package com.dpwpsj.integrations.orafus2maximo;
//import com.dpwpsj.integrations.orafus2maximo.SharedCommon;
import com.oracle.xmlns.oxp.service.v2.*;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.apache.commons.text.StringEscapeUtils;
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

public class Companies {
    private final static String DEFAULT_CURRENCY = "USD";
    private final static String ORA_FUS_PARAMETER_NAME_1 = "Fecha";
    private final static String ORA_FUS_ROOT_TAG = "DATA_DS";
    private final static String ORA_FUS_RECORD_NODE_TAG = "G_1";
    private final static String ORA_FUS_COMPANY_ID_TAG = "NUMERO_PROVEEDOR";
    private final static String ORA_FUS_COMPANY_TAX_ID_TAG = "ID_CONTRIBUYENTE";
    private final static String ORA_FUS_COMPANY_NAME_TAG = "NOMBRE_PROVEEDOR";
    private final static String ORA_FUS_COMPANY_ADDRESS_TAG = "DIRECCION";
    private final static String ORA_FUS_COMPANY_CITY_TAG = "CIUDAD";
    private final static String ORA_FUS_COMPANY_COUNTRY_TAG = "PAIS";
    //private final static String ORA_FUS_COMPANY_BUSINESS_UNIT_TAG = "UNIDAD_NEGOCIO";
    private final static String ORA_FUS_COMPANY_CURRENCY_TAG = "MONEDA";
    private final static String ORA_FUS_COMPANY_GL_ACCOUNT_TAG = "CUENTA_CONTABLE";
    private final static String ORA_FUS_COMPANY_CONTACT_NAME_TAG = "NOMBRE_CONTACTO";
    private final static String ORA_FUS_COMPANY_CONTACT_TEL_TAG = "TELEFONO";
    private final static String ORA_FUS_COMPANY_CONTACT_CELL_TAG = "TELEFONO_MOVIL";
    //private final static String ORA_FUS_COMPANY_CONTACT_FAX_TAG = "TELEFONO_FAX";
    private final static String ORA_FUS_COMPANY_CONTACT_EMAIL_TAG = "CORREO";
    private final static String MAXIMO_HEADER_SOAP_ACTION_NAME = "SOAPAction";
    private final static String MAXIMO_HEADER_SOAP_ACTION_VALUE = "urn:processDocument";
    private final static String MAXIMO_HEADER_AUTHENTICATION = "MAXAUTH";
    private final static String MAXIMO_NAMESPACE = "max";
    private final static String MAXIMO_SERVER_URI = "http://www.ibm.com/maximo";
    private final static String MAXIMO_ROOT_TAG = "SyncPSJCOMPANIES";
    private final static String MAXIMO_RECORDSET_TAG = "PSJCOMPANIESSet";
    private final static String MAXIMO_RECORD_TAG = "COMPANIES";
    private final static String MAXIMO_ORGANIZATION_ID_TAG = "ORGID";
    private final static String MAXIMO_ORGANIZATION_ID_VALUE = "EC";
    private final static String MAXIMO_SITE_CODE_TAG = "GNGSITECODE";
    private final static String MAXIMO_SITE_CODE_VALUE = "Posorja";
    private final static String MAXIMO_TYPE_TAG = "TYPE";
    private final static String MAXIMO_TYPE_VALUE = "V";
    private final static String MAXIMO_TYPE_ATTRRIBUTE = "maxvalue";
    private final static String MAXIMO_COMPANY_ID_TAG = "COMPANY";
    private final static String MAXIMO_COMPANY_CUSTOMER_NUM_TAG = "CUSTOMERNUM";
    private final static String MAXIMO_COMPANY_NAME_TAG = "NAME";
    private final static String MAXIMO_COMPANY_COMP_NAME_TAG = "CONTACT";
    private final static String MAXIMO_COMPANY_LONG_NAME_TAG = "NAME_LONGDESCRIPTION";
    private final static String MAXIMO_COMPANY_ADDRESS_1_TAG = "ADDRESS1";
    private final static String MAXIMO_COMPANY_CITY_TAG = "ADDRESS2";
    private final static String MAXIMO_COMPANY_COUNTRY_TAG = "ADDRESS3";
    //private final static String MAXIMO_COMPANY_ZIPCODE_TAG = "ADDRESS4";
    private final static String MAXIMO_COMPANY_CURRENCY_TAG = "CURRENCYCODE";
    private final static String MAXIMO_COMPANY_GL_ACCOUNT_TAG = "APCONTROLACC";
    private final static String MAXIMO_COMPANY_GL_ACCOUNT_ID_TAG = "VALUE";
    private final static String MAXIMO_COMPANY_CONTACT_TAG = "COMPCONTACT";
    private final static String MAXIMO_COMPANY_CONTACT_NAME_TAG = "CONTACT";
    private final static String MAXIMO_COMPANY_CONTACT_TEL_TAG = "VOICEPHONE";
    private final static String MAXIMO_COMPANY_CONTACT_CELL_TAG = "CELLPHONE";
    private final static String MAXIMO_COMPANY_CONTACT_EMAIL_TAG = "EMAIL";
    private final static String LOG_FILENAME = Companies.class.getSimpleName() + ".log";
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
    private static DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
    private static final Logger LOGGER = Logger.getLogger(Companies.class.getName());
    public static void main(String[] args) {
        FileHandler fh;
        SOAPMessage requestMessage;
        SOAPMessage responseMessage;
        String logFilename = dateFileFormat.format(date) + LOG_FILENAME;
        loadSettings();
        try {
            fh = new FileHandler(logFilename, true);
            LOGGER.addHandler(fh);
            LOGGER.info("inicio del programa...");
            Document docReport = getOraFusionReport();
            if (docReport.getElementsByTagName(ORA_FUS_RECORD_NODE_TAG).getLength() > 0){
                requestMessage = createMaximoSOAPRequest(docReport);
                responseMessage = submitReport2Maximo(requestMessage);
                if (responseMessage.getSOAPPart().getElementsByTagName(MAXIMO_RECORDSET_TAG).getLength() > 0) {
                    System.out.println("si fue una respuesta valida");
                } else {
                    System.out.println("no fue una respuesta valida");
                }
            } else {
                LOGGER.info("no hay datos en el reporte de Oracle Fusion...");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private static void loadSettings(){
        Properties prop = new Properties();
        InputStream input  = null;
        try {
            input  = new FileInputStream(Companies.class.getSimpleName() + PROPERTIES_FILE_EXT);
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
            //arrayOfString.getItem().add("13-08-2019");
            paramNameValue.setValues(arrayOfString);
            arrayOfParamNameValue.getItem().add(paramNameValue);
            paramNameValues.setListOfParamNameValues(arrayOfParamNameValue);
            rr.setParameterNameValues(paramNameValues);

            ReportResponse reportResponse = new ReportResponse();

            //String outFile = "C://Temp//fusionreport.txt";
            reportResponse = rs.runReport(rr, fusionUser, fusionPassword);
            byte[] baReport = reportResponse.getReportBytes();
            String resultReport = new String(baReport);
            //FileOutputStream fio = new FileOutputStream(outFile);
            //fio.write(baReport);
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
        String strCompanyName;
        String strCompanyAddress;
        String strCompanyContactName;
        String strCompanyContactTel;
        String strCompanyContactCell;
        String strCompanyContactEmail;
        String strCompanyCurrency;
        String strCompanyGLAccountId;
        for (int count = 0; count < fusionReportDetailsNodeList.getLength(); count++) {
            Node fusionReportDetailNode = fusionReportDetailsNodeList.item(count);
            if (fusionReportDetailNode.getNodeName().equals(ORA_FUS_RECORD_NODE_TAG)) {
                Element eElement = (Element) fusionReportDetailNode;
                SOAPElement soapBodyElem_Sr = soapBodyElem_Srqry.addChildElement(MAXIMO_RECORD_TAG, MAXIMO_NAMESPACE);
                // Adding child's in SR Object
                SOAPElement soapBodyElemOrganizationId = soapBodyElem_Sr.addChildElement(MAXIMO_ORGANIZATION_ID_TAG, MAXIMO_NAMESPACE);
                SOAPElement soapBodyElemSiteCode = soapBodyElem_Sr.addChildElement(MAXIMO_SITE_CODE_TAG, MAXIMO_NAMESPACE);
                SOAPElement soapBodyElemType = soapBodyElem_Sr.addChildElement(MAXIMO_TYPE_TAG, MAXIMO_NAMESPACE);
                SOAPElement soapBodyElemCompanyId = soapBodyElem_Sr.addChildElement(MAXIMO_COMPANY_ID_TAG, MAXIMO_NAMESPACE);
                SOAPElement soapBodyElemCompanyCustomerNumber = soapBodyElem_Sr.addChildElement(MAXIMO_COMPANY_CUSTOMER_NUM_TAG, MAXIMO_NAMESPACE);
                SOAPElement soapBodyElemCompanyName = soapBodyElem_Sr.addChildElement(MAXIMO_COMPANY_NAME_TAG, MAXIMO_NAMESPACE);
                SOAPElement soapBodyElemCompanyCompContact = soapBodyElem_Sr.addChildElement(MAXIMO_COMPANY_COMP_NAME_TAG, MAXIMO_NAMESPACE);
                SOAPElement soapBodyElemCompanyLongName = soapBodyElem_Sr.addChildElement(MAXIMO_COMPANY_LONG_NAME_TAG, MAXIMO_NAMESPACE);
                SOAPElement soapBodyElemCompanyAddress = soapBodyElem_Sr.addChildElement(MAXIMO_COMPANY_ADDRESS_1_TAG, MAXIMO_NAMESPACE);
                SOAPElement soapBodyElemCompanyCity = soapBodyElem_Sr.addChildElement(MAXIMO_COMPANY_CITY_TAG, MAXIMO_NAMESPACE);
                SOAPElement soapBodyElemCompanyCountry = soapBodyElem_Sr.addChildElement(MAXIMO_COMPANY_COUNTRY_TAG, MAXIMO_NAMESPACE);
                //SOAPElement soapBodyElemCompanyZipcode = soapBodyElem_Sr.addChildElement(MAXIMO_COMPANY_ZIPCODE_TAG, MAXIMO_NAMESPACE);
                SOAPElement soapBodyElemCompanyCurrency = soapBodyElem_Sr.addChildElement(MAXIMO_COMPANY_CURRENCY_TAG, MAXIMO_NAMESPACE);
                Name soapBodyElemAttrType = envelope.createName(MAXIMO_TYPE_ATTRRIBUTE);
                // Adding the GL Account info
                //SOAPElement soapBodyElemCompanyGLAccount = soapBodyElem_Sr.addChildElement(MAXIMO_COMPANY_GL_ACCOUNT_TAG, MAXIMO_NAMESPACE);
                //SOAPElement soapBodyElemCompanyGLAccountId = soapBodyElemCompanyGLAccount.addChildElement(MAXIMO_COMPANY_GL_ACCOUNT_ID_TAG, MAXIMO_NAMESPACE);
                // Adding contact info
                SOAPElement soapBodyElemCompanyContact = soapBodyElem_Sr.addChildElement(MAXIMO_COMPANY_CONTACT_TAG, MAXIMO_NAMESPACE);
                SOAPElement soapBodyElemCompanyContactName = soapBodyElemCompanyContact.addChildElement(MAXIMO_COMPANY_CONTACT_NAME_TAG, MAXIMO_NAMESPACE);
                SOAPElement soapBodyElemCompanyContactTel = soapBodyElemCompanyContact.addChildElement(MAXIMO_COMPANY_CONTACT_TEL_TAG, MAXIMO_NAMESPACE);
                SOAPElement soapBodyElemCompanyContactCell = soapBodyElemCompanyContact.addChildElement(MAXIMO_COMPANY_CONTACT_CELL_TAG, MAXIMO_NAMESPACE);
                SOAPElement soapBodyElemCompanyContactEmail = soapBodyElemCompanyContact.addChildElement(MAXIMO_COMPANY_CONTACT_EMAIL_TAG, MAXIMO_NAMESPACE);
                //Adding static Value
                soapBodyElemOrganizationId.addTextNode(MAXIMO_ORGANIZATION_ID_VALUE);
                soapBodyElemSiteCode.addTextNode(MAXIMO_SITE_CODE_VALUE);
                soapBodyElemType.addTextNode(MAXIMO_TYPE_VALUE);
                soapBodyElemType.addAttribute(soapBodyElemAttrType, MAXIMO_TYPE_VALUE);
                //Adding dynamic Value
                soapBodyElemCompanyId.addTextNode(eElement.getElementsByTagName(ORA_FUS_COMPANY_TAX_ID_TAG).item(0).getTextContent());
                soapBodyElemCompanyCustomerNumber.addTextNode(eElement.getElementsByTagName(ORA_FUS_COMPANY_ID_TAG).item(0).getTextContent());
                if (eElement.getElementsByTagName(ORA_FUS_COMPANY_NAME_TAG).getLength() > 0){
                    strCompanyName = StringEscapeUtils.escapeXml10(eElement.getElementsByTagName(ORA_FUS_COMPANY_NAME_TAG).item(0).getTextContent());
                    soapBodyElemCompanyName.addTextNode(strCompanyName.trim());
                } else {
                    soapBodyElemCompanyName.addTextNode("");
                }
                if (eElement.getElementsByTagName(ORA_FUS_COMPANY_ADDRESS_TAG).getLength() > 0){
                    strCompanyAddress = StringEscapeUtils.escapeXml10(eElement.getElementsByTagName(ORA_FUS_COMPANY_ADDRESS_TAG).item(0).getTextContent());
                    if (strCompanyAddress.length() >= 100){
                        strCompanyAddress = strCompanyAddress.substring(0, 99);
                    }
                    soapBodyElemCompanyAddress.addTextNode(strCompanyAddress.trim());
                } else {
                    soapBodyElemCompanyAddress.addTextNode("");
                }
                soapBodyElemCompanyCity.addTextNode(eElement.getElementsByTagName(ORA_FUS_COMPANY_CITY_TAG).item(0).getTextContent());
                soapBodyElemCompanyCountry.addTextNode(eElement.getElementsByTagName(ORA_FUS_COMPANY_COUNTRY_TAG).item(0).getTextContent());
                //soapBodyElemCompanyZipcode.addTextNode(eElement.getElementsByTagName(ORA_FUS_COMPANY_ZIP_TAG).item(0).getTextContent());
                if (eElement.getElementsByTagName(ORA_FUS_COMPANY_CURRENCY_TAG).getLength() > 0){
                    strCompanyCurrency = eElement.getElementsByTagName(ORA_FUS_COMPANY_CURRENCY_TAG).item(0).getTextContent();
                    if (strCompanyCurrency != null) {
                        soapBodyElemCompanyCurrency.addTextNode(strCompanyCurrency);
                    }
                } else {
                    soapBodyElemCompanyCurrency.addTextNode(DEFAULT_CURRENCY);
                }
               /* if (eElement.getElementsByTagName(ORA_FUS_COMPANY_GL_ACCOUNT_TAG).getLength() > 0){
                    strCompanyGLAccountId = eElement.getElementsByTagName(ORA_FUS_COMPANY_GL_ACCOUNT_TAG).item(0).getTextContent();
                    if (strCompanyGLAccountId.length() > 0) {
                        strCompanyGLAccountId = strCompanyGLAccountId.substring(0, (strCompanyGLAccountId.length() - 4));
                        soapBodyElemCompanyGLAccountId.addTextNode(strCompanyGLAccountId);
                    }
                }*/
                if (eElement.getElementsByTagName(ORA_FUS_COMPANY_CONTACT_NAME_TAG).getLength() > 0){
                    strCompanyContactName = StringEscapeUtils.escapeXml10(eElement.getElementsByTagName(ORA_FUS_COMPANY_CONTACT_NAME_TAG).item(0).getTextContent());
                    if (strCompanyContactName != null){
                        if (strCompanyContactName.length() > 50) {
                            soapBodyElemCompanyCompContact.addTextNode(strCompanyContactName.substring(0,49).trim());
                            soapBodyElemCompanyContactName.addTextNode(strCompanyContactName.substring(0,49).trim());
                        } else {
                            soapBodyElemCompanyCompContact.addTextNode(strCompanyContactName.trim());
                            soapBodyElemCompanyContactName.addTextNode(strCompanyContactName.trim());
                        }
                    } else {
                        soapBodyElemCompanyCompContact.addTextNode("");
                        soapBodyElemCompanyContactName.addTextNode("");
                    }
                }
                if (eElement.getElementsByTagName(ORA_FUS_COMPANY_CONTACT_TEL_TAG).getLength() > 0){
                    strCompanyContactTel = StringEscapeUtils.escapeXml10(eElement.getElementsByTagName(ORA_FUS_COMPANY_CONTACT_TEL_TAG).item(0).getTextContent());
                    soapBodyElemCompanyContactTel.addTextNode(strCompanyContactTel.trim());
                } else {
                    soapBodyElemCompanyContactTel.addTextNode("");
                }
                if (eElement.getElementsByTagName(ORA_FUS_COMPANY_CONTACT_CELL_TAG).getLength() > 0){
                    strCompanyContactCell = StringEscapeUtils.escapeXml10(eElement.getElementsByTagName(ORA_FUS_COMPANY_CONTACT_CELL_TAG).item(0).getTextContent());
                    soapBodyElemCompanyContactCell.addTextNode(strCompanyContactCell.trim());
                } else {
                    soapBodyElemCompanyContactCell.addTextNode("");
                }
                if (eElement.getElementsByTagName(ORA_FUS_COMPANY_CONTACT_EMAIL_TAG).getLength() > 0){
                    strCompanyContactEmail = StringEscapeUtils.escapeXml10(eElement.getElementsByTagName(ORA_FUS_COMPANY_CONTACT_EMAIL_TAG).item(0).getTextContent());
                    soapBodyElemCompanyContactEmail.addTextNode(strCompanyContactEmail.trim());
                } else {
                    soapBodyElemCompanyContactEmail.addTextNode("");
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