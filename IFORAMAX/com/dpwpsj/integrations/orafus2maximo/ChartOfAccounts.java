package com.dpwpsj.integrations.orafus2maximo;

import com.oracle.xmlns.oxp.service.v2.*;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.soap.*;
import javax.xml.transform.*;
import javax.xml.transform.stream.StreamResult;
import java.io.*;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ChartOfAccounts {
    private final static String ORA_FUS_PARAMETER_NAME_1 = "p_fecha_desde";
    private final static String ORA_FUS_ROOT_TAG = "DATA_DS";
    private final static String ORA_FUS_RECORD_NODE_TAG = "G_CUENTAS";
    //private final static String ORA_FUS_COA_ID_TAG = "ID_CUENTA";
    private final static String ORA_FUS_COA_LEDGER_ID_TAG = "CUENTA_CONTABLE";
    //private final static String ORA_FUS_COA_UPDATE_TAG = "FECHA_ACTUALIZACION";
    private final static String ORA_FUS_COA_STATUS_TAG = "ACTIVA";
    //private final static String ORA_FUS_COA_GROUP_TAG = "ID_ESTRUCTURA";
    private final static String ORA_FUS_COA_ACTIVE_DATE_TAG = "FECHA_ACTIVA_DESDE";
    private final static String MAXIMO_HEADER_SOAP_ACTION_NAME = "SOAPAction";
    private final static String MAXIMO_HEADER_SOAP_ACTION_VALUE = "urn:processDocument";
    private final static String MAXIMO_HEADER_AUTHENTICATION = "MAXAUTH";
    private final static String MAXIMO_NAMESPACE = "max";
    private final static String MAXIMO_SERVER_URI = "http://www.ibm.com/maximo";
    private final static String MAXIMO_ROOT_TAG = "SyncPSJCOA";
    private final static String MAXIMO_RECORDSET_TAG = "PSJCOASet";
    private final static String MAXIMO_RECORD_TAG = "CHARTOFACCOUNTS";
    private final static String MAXIMO_ORGANIZATION_ID_TAG = "ORGID";
    private final static String MAXIMO_ORGANIZATION_ID_VALUE = "EC";
    private final static String MAXIMO_COA_STATUS_TAG = "ACTIVE";
    private final static String MAXIMO_COA_ACTIVE_DATE_TAG = "ACTIVEDATE";
    private final static String MAXIMO_COA_GL_ACCOUNT_TAG = "GLACCOUNT";
    private final static String MAXIMO_COA_LEDGER_ID_TAG = "VALUE";
    private final static String LOG_FILENAME = ChartOfAccounts.class.getSimpleName() + ".log";
    private final static String PROPERTIES_FILE_EXT = ".properties";
    private static String fusionEndPoint;
    private static String fusionReportPath;
    private static String fusionUser;
    private static String fusionPassword;
    private static String fusionMasterCompany;
    private static String maximoEndPoint;
    private static String maximoAuthentication;
    private static Date date = new Date();
    private static DateFormat dateFileFormat = new SimpleDateFormat("yyyyMMddHHmm");
    private static DateFormat dateISOFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
    private static DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    private static final Logger LOGGER = Logger.getLogger(ChartOfAccounts.class.getName());
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
            input  = new FileInputStream(ChartOfAccounts.class.getSimpleName() + PROPERTIES_FILE_EXT);
            prop.load(input);
            fusionEndPoint = prop.getProperty("fusendpoint");
            fusionReportPath = prop.getProperty("fusreportpath");
            fusionUser = prop.getProperty("fususer");
            fusionPassword = prop.getProperty("fuspassword");
            fusionMasterCompany = prop.getProperty("fusmastercompany");
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

            ReportResponse reportResponse;

            //String outFile = "C://Temp//fusionreport.txt";
            reportResponse = rs.runReport(rr, fusionUser, fusionPassword);
            byte[] baReport = reportResponse.getReportBytes();
            String resultReport = new String(baReport);
            /*FileOutputStream fio = new FileOutputStream(outFile);
            fio.write(baReport);
            fio.close();*/
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
        org.w3c.dom.Node fusionReportNode = fusionReportNodeList.item(0);
        NodeList fusionReportDetailsNodeList = fusionReportNode.getChildNodes();
        Date date = new Date();
        //String systemDate = dateISOFormat.format(date);
        String strCOAStatus;
        String strCOAActiveDate;
        String strCOALedgerId;
        for (int count = 0; count < fusionReportDetailsNodeList.getLength(); count++) {
            Node fusionReportDetailNode = fusionReportDetailsNodeList.item(count);
            if (fusionReportDetailNode.getNodeName().equals(ORA_FUS_RECORD_NODE_TAG)) {
                Element eElement = (Element) fusionReportDetailNode;
                if (eElement.getElementsByTagName(ORA_FUS_COA_LEDGER_ID_TAG).getLength() > 0){
                    strCOALedgerId = eElement.getElementsByTagName(ORA_FUS_COA_LEDGER_ID_TAG).item(0).getTextContent();
                    if (strCOALedgerId.length() > 0) {
                        if (strCOALedgerId.substring(0, 4).equals(fusionMasterCompany)) {
                            SOAPElement soapBodyElem_Sr = soapBodyElem_Srqry.addChildElement(MAXIMO_RECORD_TAG, MAXIMO_NAMESPACE);
                            // Adding child's in SR Object
                            SOAPElement soapBodyElemOrganizationId = soapBodyElem_Sr.addChildElement(MAXIMO_ORGANIZATION_ID_TAG, MAXIMO_NAMESPACE);
                            SOAPElement soapBodyElemCOAStatus = soapBodyElem_Sr.addChildElement(MAXIMO_COA_STATUS_TAG, MAXIMO_NAMESPACE);
                            SOAPElement soapBodyElemCOAActiveDate = soapBodyElem_Sr.addChildElement(MAXIMO_COA_ACTIVE_DATE_TAG, MAXIMO_NAMESPACE);
                            SOAPElement soapBodyElemCOAGLAccount = soapBodyElem_Sr.addChildElement(MAXIMO_COA_GL_ACCOUNT_TAG, MAXIMO_NAMESPACE);

                            SOAPElement soapBodyElemCOALedgerId = soapBodyElemCOAGLAccount.addChildElement(MAXIMO_COA_LEDGER_ID_TAG, MAXIMO_NAMESPACE);
                            //Adding static Value
                            soapBodyElemOrganizationId.addTextNode(MAXIMO_ORGANIZATION_ID_VALUE);

                            if (eElement.getElementsByTagName(ORA_FUS_COA_STATUS_TAG).getLength() > 0){
                                strCOAStatus = eElement.getElementsByTagName(ORA_FUS_COA_STATUS_TAG).item(0).getTextContent();
                                if (strCOAStatus != null){
                                    if (strCOAStatus.equals("Y")){
                                        soapBodyElemCOAStatus.addTextNode("1");
                                    }
                                    else {
                                        soapBodyElemCOAStatus.addTextNode("0");
                                    }
                                } else {
                                    soapBodyElemCOAStatus.addTextNode("0");
                                }
                            } else {
                                soapBodyElemCOAStatus.addTextNode("0");
                            }
                            if (eElement.getElementsByTagName(ORA_FUS_COA_ACTIVE_DATE_TAG).getLength() > 0){
                                strCOAActiveDate = eElement.getElementsByTagName(ORA_FUS_COA_ACTIVE_DATE_TAG).item(0).getTextContent();
                                if (strCOAActiveDate != null){
                                    soapBodyElemCOAActiveDate.addTextNode(strCOAActiveDate);
                                } else {
                                    soapBodyElemCOAActiveDate.addTextNode(dateFormat.format(date));
                                }
                            } else {
                                soapBodyElemCOAActiveDate.addTextNode(dateFormat.format(date));
                            }
                            strCOALedgerId = strCOALedgerId.substring(0, (strCOALedgerId.length() - 4));
                            soapBodyElemCOALedgerId.addTextNode(strCOALedgerId);
                        }
                    }
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
}