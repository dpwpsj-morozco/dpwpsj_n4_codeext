package com.dpwpsj.integrations.orafus2maximo;
import com.dpwpsj.shared.SharedCommon;

import java.io.*;
import java.net.URL;
import java.net.HttpURLConnection;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Date;
import java.util.Properties;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
public class SubmitPayablesInvoices {
    private final static String XML = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:typ=\"http://xmlns.oracle.com/apps/financials/payables/invoices/quickInvoices/invoiceInterfaceService/types/\">\n" +
            "   <soapenv:Header/>\n" +
            "   <soapenv:Body>\n" +
            "      <typ:submitInvoiceImport>\n" +
            "         <typ:ledgerId>:p_ledgerId</typ:ledgerId>\n" +
            "         <typ:orgId>:p_orgId</typ:orgId>\n" +
            "         <typ:accountingDate>:p_accountingDate</typ:accountingDate>\n" +
            "      </typ:submitInvoiceImport>\n" +
            "   </soapenv:Body>\n" +
            "</soapenv:Envelope>\n";
    private final static String LOG_FILENAME = SubmitPayablesInvoices.class.getSimpleName() + ".log";
    private final static String PROPERTIES_FILE_EXT = ".properties";
    private static String fusionEndPoint;
    private static String fusionUser;
    private static String fusionPassword;
    private static String ledgerId;
    private static String orgId;
    private static Date date = new Date();
    private static DateFormat dateFileFormat = new SimpleDateFormat("yyyyMMddHHmm");
    private static DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    private static final Logger LOGGER = Logger.getLogger(SubmitPayablesInvoices.class.getName());
    public static void main(String[] args) {
        FileHandler fh;
        String logFilename = dateFileFormat.format(date) + LOG_FILENAME;
        loadSettings();
        try {
            fh = new FileHandler(logFilename, true);
            LOGGER.addHandler(fh);
            LOGGER.info("inicio del programa...");
            String xmlSoapEnvelope = XML;
            xmlSoapEnvelope = xmlSoapEnvelope.replaceAll(":p_ledgerId", ledgerId);
            xmlSoapEnvelope = xmlSoapEnvelope.replaceAll(":p_orgId", orgId);
            xmlSoapEnvelope = xmlSoapEnvelope.replaceAll(":p_accountingDate", dateFormat.format(date));
            LOGGER.info(xmlSoapEnvelope);
            String result = SharedCommon.oraFusionHTTPRequest(fusionEndPoint, xmlSoapEnvelope, fusionUser +":" + fusionPassword);
            LOGGER.info(result);
           // SharedCommon.registerEvent("SUCCESS", "1", SubmitPayablesInvoices.class.getSimpleName(), result);
            LOGGER.info("fin del programa...");
        } catch (Exception e) {
            LOGGER.severe(e.getMessage());
          //  SharedCommon.registerEvent("ERROR", "1", SubmitPayablesInvoices.class.getSimpleName(), "falla en ejecutar aplicacion");
        }
    }
    private static void loadSettings(){
        Properties prop = new Properties();
        InputStream input  = null;
        try {
            input  = new FileInputStream(SubmitPayablesInvoices.class.getSimpleName() + PROPERTIES_FILE_EXT);
            prop.load(input);
            fusionEndPoint = prop.getProperty("fusendpoint");
            fusionUser = prop.getProperty("fususer");
            fusionPassword = prop.getProperty("fuspassword");
            ledgerId = prop.getProperty("ledgerId");
            orgId = prop.getProperty("orgId");
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
}