package com.dpwpsj.integrations.orafus2maximo;

import com.oracle.xmlns.oxp.service.v2.ReportRequest;
import com.oracle.xmlns.oxp.service.v2.ReportService_Service;
import com.oracle.xmlns.oxp.service.v2.ReportService;
import com.oracle.xmlns.oxp.service.v2.ReportResponse;
import com.oracle.xmlns.oxp.service.v2.ParamNameValue;
import com.oracle.xmlns.oxp.service.v2.ParamNameValues;
import com.oracle.xmlns.oxp.service.v2.ArrayOfParamNameValue;
import com.oracle.xmlns.oxp.service.v2.ArrayOfString;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.IOException;
import java.io.StringReader;
import java.net.URL;
import java.util.Date;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Properties;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.soap.SOAPConnection;
import javax.xml.soap.SOAPConnectionFactory;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.MimeHeaders;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPPart;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPException;
import javax.xml.soap.Name;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.Source;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
public class PaidInvoices {
    private final static String ORA_FUS_PARAMETER_NAME_1 = "p_fecha_desde";
    private final static String ORA_FUS_ROOT_TAG = "DATA_DS";
    private final static String ORA_FUS_RECORD_NODE_TAG = "G_PAGOS_AP";
    //private final static String ORA_FUS_INVOICE_ID_TAG = "ID_FACTURA_AP";
    //private final static String ORA_FUS_INVOICE_NUMBER_TAG = "NRO_FACTURA_AP";
    private final static String ORA_FUS_INVOICE_MAXIMO_ID_TAG = "NUM_SEC_MAXIMO";
    private final static String ORA_FUS_INVOICE_DATE_TAG = "FECHA_PAGO";
    private final static String ORA_FUS_INVOICE_STATUS_TAG = "ESTADO";
    //private final static String ORA_FUS_INVOICE_BUSINESS_UNIT_TAG = "UNIDAD_NEGOCIO";
    private final static String MAXIMO_HEADER_SOAP_ACTION_NAME = "SOAPAction";
    private final static String MAXIMO_HEADER_SOAP_ACTION_VALUE = "urn:processDocument";
    private final static String MAXIMO_HEADER_AUTHENTICATION = "MAXAUTH";
    private final static String MAXIMO_NAMESPACE = "max";
    private final static String MAXIMO_SERVER_URI = "http://www.ibm.com/maximo";
    private final static String MAXIMO_ROOT_TAG = "SyncPSJINVOICE";
    private final static String MAXIMO_RECORDSET_TAG = "PSJINVOICESet";
    private final static String MAXIMO_RECORD_TAG = "INVOICE";
    private final static String MAXIMO_CHANGEBY_TAG = "CHANGEBY";
    private final static String MAXIMO_CHANGEBY_VALUE = "MXINTADM";
    private final static String MAXIMO_CHANGEDATE_TAG = "CHANGEDATE";
    private final static String MAXIMO_INVOICENUM_TAG = "INVOICENUM";
    private final static String MAXIMO_ORGANIZATION_ID_TAG = "ORGID";
    private final static String MAXIMO_ORGANIZATION_ID_VALUE = "EC";
    private final static String MAXIMO_PAID_DATE_TAG = "PAIDDATE";
    private final static String MAXIMO_SITE_ID_TAG = "SITEID";
    private final static String MAXIMO_SITE_ID_VALUE = "ECPSJ";
    private final static String MAXIMO_INVOICE_STATUS_TAG = "STATUS";
    private final static String MAXIMO_INVOICE_STATUS_ATTRRIBUTE = "maxvalue";
    private final static String MAXIMO_INVOICE_CHANGE_STATUS_TAG = "INVOICECHGSTAT";
    private final static String MAXIMO_INVOICE_CHANGE_STATUS_MEMO_TAG = "MEMO";
    private final static String MAXIMO_INVOICE_CHANGE_STATUS_MEMO_VALUE = "DPWPSJ Middleware Fus2Max";
    private final static String MAXIMO_INVOICE_CHANGE_STATUS_POCLOSE_TAG = "POCLOSE";
    private final static String MAXIMO_INVOICE_CHANGE_STATUS_POCLOSE_VALUE = "1";
    private final static String MAXIMO_INVOICE_CHANGE_STATUS_STATUS_TAG = "STATUS";
    private final static String MAXIMO_INVOICE_CHANGE_STATUS_STATUS_DATE_TAG = "STATUSDATE";
    private final static String LOG_FILENAME = PaidInvoices.class.getSimpleName() + ".log";
    private final static String PROPERTIES_FILE_EXT = ".properties";
    private static String fusionEndPoint;
    private static String fusionReportPath;
    private static String fusionUser;
    private static String fusionPassword;
    private static String maximoEndPoint;
    private static String maximoAuthentication;
    private static Date date = new Date();
    private static DateFormat dateFileFormat = new SimpleDateFormat("yyyyMMddHHmm");
    private static DateFormat dateISOFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
    private static DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    private static final Logger LOGGER = Logger.getLogger(PaidInvoices.class.getName());
    public static void main(String[] args) {
        FileHandler fh;
        String logFilename = dateFileFormat.format(date) + LOG_FILENAME;
        loadSettings();
        try {
            fh = new FileHandler(logFilename, true);
            LOGGER.addHandler(fh);
            LOGGER.info("inicio del programa...");
            Document docReport = getOraFusionReport();
            SOAPMessage requestMessage = createMaximoSOAPRequest(docReport);
            SOAPMessage responseMessage = submitReport2Maximo(requestMessage);
         /*   if (isValidResponse(responseMessage)) {

            }*/
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private static void loadSettings(){
        Properties prop = new Properties();
        InputStream input  = null;
        try {
            input  = new FileInputStream(PaidInvoices.class.getSimpleName() + PROPERTIES_FILE_EXT);
            prop.load(input);
            fusionEndPoint = prop.getProperty("fusendpoint");
            fusionReportPath = prop.getProperty("fusreportpath");
            fusionUser = prop.getProperty("fususer");
            fusionPassword = prop.getProperty("fuspassword");
            maximoEndPoint = prop.getProperty("maxendpoint");
            maximoAuthentication = prop.getProperty("maxauth");
            LOGGER.log(Level.INFO, "Se ha leido el archivo de configuración");
        } catch (FileNotFoundException fne){
            LOGGER.log(Level.SEVERE, "Excepción no encuentra archivo de configuración", fne);
        } catch (IOException io) {
            LOGGER.log(Level.SEVERE, "Excepción E/S al leer archivo de configuración", io);
        } catch (Exception ex){
            LOGGER.log(Level.SEVERE, "Excepción No Manejada", ex);
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    LOGGER.log(Level.SEVERE, "Excepción E/S al cerrar archivo de configuración", e);
                }
            }
        }
    }
    private static Document getOraFusionReport(){
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder;
        Document doc = null;
        LOGGER.info("getOraFusionReport()");
        //MalformedURLException
        try{
            URL url_wsdl = new URL(fusionEndPoint);
            ReportService_Service reportService_Service = new ReportService_Service(url_wsdl);
            ReportService rs = reportService_Service.getReportService();
            ReportRequest rr = new ReportRequest();
            rr.setAttributeLocale("en-US");
            rr.setAttributeTemplate("Default");
            rr.setFlattenXML(false);
            rr.setSizeOfDataChunkDownload(-1);
            rr.setReportAbsolutePath(fusionReportPath);

            ArrayOfParamNameValue arrayOfParamNameValue = new ArrayOfParamNameValue();
            ParamNameValues paramNameValues = new ParamNameValues();
            ParamNameValue paramNameValue = new ParamNameValue();
            ArrayOfString arrayOfString = new ArrayOfString();
            paramNameValue.setName(ORA_FUS_PARAMETER_NAME_1);
            arrayOfString.getItem().add(dateFormat.format(date));
//            arrayOfString.getItem().add("2019-01-01");
            paramNameValue.setValues(arrayOfString);
            arrayOfParamNameValue.getItem().add(paramNameValue);
            paramNameValues.setListOfParamNameValues(arrayOfParamNameValue);
            rr.setParameterNameValues(paramNameValues);

            ReportResponse reportResponse = new ReportResponse();

            //String outFile = "C://Temp//fusionreport.txt";
            reportResponse = rs.runReport(rr, fusionUser, fusionPassword);
            byte[] baReport = reportResponse.getReportBytes();
            String resultReport = new String(baReport);
           // FileOutputStream fio = new FileOutputStream(outFile);
           // fio.write(baReport);
           // fio.close();
            LOGGER.info(resultReport);
            builder = factory.newDocumentBuilder();
            doc = builder.parse( new InputSource( new StringReader(resultReport) ) );
        } catch (Exception e) {
            LOGGER.severe(e.getMessage());
        }
        return doc;
    }
    private static SOAPMessage submitReport2Maximo(SOAPMessage inMessage){
        SOAPMessage response = null;
        try{
            SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
            SOAPConnection soapConnection = soapConnectionFactory.createConnection();
            //SOAPMessage message = createMaximoSOAPRequest();
            URL endpoint = new URL(maximoEndPoint);
            MimeHeaders headers = inMessage.getMimeHeaders();
            headers.addHeader(MAXIMO_HEADER_SOAP_ACTION_NAME, MAXIMO_HEADER_SOAP_ACTION_VALUE);
            headers.addHeader(MAXIMO_HEADER_AUTHENTICATION, maximoAuthentication);
            response = soapConnection.call(inMessage, endpoint);
            soapConnection.close();
            print(response);
            return response;
        } catch (Exception e) {
            LOGGER.severe(e.getMessage());
            return response;
        }
    }
    private static SOAPMessage createMaximoSOAPRequest(Document inDoc) throws Exception {
        MessageFactory messageFactory = MessageFactory.newInstance();
        SOAPMessage soapMessage = messageFactory.createMessage();
        SOAPPart soapPart = soapMessage.getSOAPPart();
        //SOAP Envelope
        SOAPEnvelope envelope = soapPart.getEnvelope();
        envelope.addNamespaceDeclaration(MAXIMO_NAMESPACE, MAXIMO_SERVER_URI);

        SOAPBody soapBody = envelope.getBody();
        //Adding Header Element Tags
        SOAPElement soapBodyElem_Qrysr = soapBody.addChildElement(MAXIMO_ROOT_TAG, MAXIMO_NAMESPACE);
        SOAPElement soapBodyElem_Srqry = soapBodyElem_Qrysr.addChildElement(MAXIMO_RECORDSET_TAG, MAXIMO_NAMESPACE);

        NodeList fusionReportNodeList = inDoc.getElementsByTagName(ORA_FUS_ROOT_TAG);
        Node fusionReportNode = fusionReportNodeList.item(0);
        NodeList fusionReportDetailsNodeList = fusionReportNode.getChildNodes();
        Date date = new Date();
        String systemDate = dateISOFormat.format(date);
        for (int count = 0; count < fusionReportDetailsNodeList.getLength(); count++) {
            Node fusionReportDetailNode = fusionReportDetailsNodeList.item(count);
            if (fusionReportDetailNode.getNodeName().equals(ORA_FUS_RECORD_NODE_TAG)) {
                Element eElement = (Element) fusionReportDetailNode;
                if (eElement.getElementsByTagName(ORA_FUS_INVOICE_MAXIMO_ID_TAG).item(0).getTextContent().startsWith("EC")) {
                    SOAPElement soapBodyElem_Sr = soapBodyElem_Srqry.addChildElement(MAXIMO_RECORD_TAG, MAXIMO_NAMESPACE);
                    // Adding child's in SR Object
                    SOAPElement soapBodyElemChangeBy = soapBodyElem_Sr.addChildElement(MAXIMO_CHANGEBY_TAG, MAXIMO_NAMESPACE);
                    SOAPElement soapBodyElemChangeDate = soapBodyElem_Sr.addChildElement(MAXIMO_CHANGEDATE_TAG, MAXIMO_NAMESPACE);
                    SOAPElement soapBodyElemInvoiceNo = soapBodyElem_Sr.addChildElement(MAXIMO_INVOICENUM_TAG, MAXIMO_NAMESPACE);
                    SOAPElement soapBodyElemOrganizationId = soapBodyElem_Sr.addChildElement(MAXIMO_ORGANIZATION_ID_TAG, MAXIMO_NAMESPACE);
                    SOAPElement soapBodyElemInvoiceDate = soapBodyElem_Sr.addChildElement(MAXIMO_PAID_DATE_TAG, MAXIMO_NAMESPACE);
                    SOAPElement soapBodyElemSiteId = soapBodyElem_Sr.addChildElement(MAXIMO_SITE_ID_TAG, MAXIMO_NAMESPACE);
                    SOAPElement soapBodyElemInvoiceStatus = soapBodyElem_Sr.addChildElement(MAXIMO_INVOICE_STATUS_TAG, MAXIMO_NAMESPACE);

                    Name soapBodyElemAttrTypeInvoiceStatus = envelope.createName(MAXIMO_INVOICE_STATUS_ATTRRIBUTE);
                    // Adding change log
                    SOAPElement soapBodyElem_InvoiceChangeStat = soapBodyElem_Sr.addChildElement(MAXIMO_INVOICE_CHANGE_STATUS_TAG, MAXIMO_NAMESPACE);
                    SOAPElement soapBodyElemInvoiceChangeMemo = soapBodyElem_InvoiceChangeStat.addChildElement(MAXIMO_INVOICE_CHANGE_STATUS_MEMO_TAG, MAXIMO_NAMESPACE);
                    SOAPElement soapBodyElemInvoiceChangePOClose = soapBodyElem_InvoiceChangeStat.addChildElement(MAXIMO_INVOICE_CHANGE_STATUS_POCLOSE_TAG, MAXIMO_NAMESPACE);
                    SOAPElement soapBodyElemInvoiceChangeStatus = soapBodyElem_InvoiceChangeStat.addChildElement(MAXIMO_INVOICE_CHANGE_STATUS_STATUS_TAG, MAXIMO_NAMESPACE);
                    SOAPElement soapBodyElemInvoiceChangeStatusDate = soapBodyElem_InvoiceChangeStat.addChildElement(MAXIMO_INVOICE_CHANGE_STATUS_STATUS_DATE_TAG, MAXIMO_NAMESPACE);
                    //Adding static Value
                    soapBodyElemChangeBy.addTextNode(MAXIMO_CHANGEBY_VALUE);
                    soapBodyElemChangeDate.addTextNode(systemDate);
                    soapBodyElemInvoiceNo.addTextNode(eElement.getElementsByTagName(ORA_FUS_INVOICE_MAXIMO_ID_TAG).item(0).getTextContent());
                    soapBodyElemOrganizationId.addTextNode(MAXIMO_ORGANIZATION_ID_VALUE);
                    soapBodyElemInvoiceDate.addTextNode(eElement.getElementsByTagName(ORA_FUS_INVOICE_DATE_TAG).item(0).getTextContent());
                    soapBodyElemSiteId.addTextNode(MAXIMO_SITE_ID_VALUE);
                    soapBodyElemInvoiceStatus.addTextNode(eElement.getElementsByTagName(ORA_FUS_INVOICE_STATUS_TAG).item(0).getTextContent());

                    soapBodyElemInvoiceStatus.addAttribute(soapBodyElemAttrTypeInvoiceStatus, eElement.getElementsByTagName(ORA_FUS_INVOICE_STATUS_TAG).item(0).getTextContent());
                    soapBodyElemInvoiceChangeMemo.addTextNode(MAXIMO_INVOICE_CHANGE_STATUS_MEMO_VALUE);
                    soapBodyElemInvoiceChangePOClose.addTextNode(MAXIMO_INVOICE_CHANGE_STATUS_POCLOSE_VALUE);
                    soapBodyElemInvoiceChangeStatus.addTextNode((eElement.getElementsByTagName(ORA_FUS_INVOICE_STATUS_TAG).item(0).getTextContent()));
                    soapBodyElemInvoiceChangeStatusDate.addTextNode(systemDate);
                }

            }
        }
        soapMessage.saveChanges();
        print(soapMessage);
        return soapMessage;
    }
    private static void print(SOAPMessage soapMessage) throws SOAPException, TransformerException {
        LOGGER.info("print()");
        TransformerFactory tff = TransformerFactory.newInstance();
        Transformer tf = tff.newTransformer();
        tf.setOutputProperty(OutputKeys.INDENT, "yes");
        tf.setOutputProperty("{http://xml.apache.org/xslt}indent-amount","2");
        Source sc = soapMessage.getSOAPPart().getContent();
        ByteArrayOutputStream streamOut = new ByteArrayOutputStream();
        StreamResult result = new StreamResult(streamOut);
        tf.transform(sc, result);
        String strMessage = streamOut.toString();
        LOGGER.info(strMessage);
    }
    /*private static boolean isValidResponse(SOAPMessage soapMessage){
        boolean validProcess = false;
        return validProcess;
    }*/
}