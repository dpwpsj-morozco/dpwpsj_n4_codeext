package com.dpwpsj.shared;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.HttpURLConnection;
import java.util.Base64;
public class SharedCommon {
    private final static String WIN_EVENT = "EventCreate /t :p_type /id :p_id /so :p_source /l APPLICATION  /d \":p_description\"";
    public static void registerEvent(String type, String id, String source, String description) {
        String cmdtext = WIN_EVENT;
        cmdtext = cmdtext.replaceAll(":p_type", type);
        cmdtext = cmdtext.replaceAll(":p_id", id);
        cmdtext = cmdtext.replaceAll(":p_source", source);
        cmdtext = cmdtext.replaceAll(":p_description", description);
        System.out.println(cmdtext);
        try {
            Process process = Runtime.getRuntime().exec(cmdtext,null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static String oraFusionHTTPRequest(String destUrl, String postData, String authStr) throws Exception {
        URL url = new URL(destUrl);
        HttpURLConnection conn = (HttpURLConnection)url.openConnection();
        if (conn == null) {
            return null;
        }
        conn.setRequestProperty("Content-Type", "text/xml; charset=UTF-8");
        conn.setDoOutput(true);
        conn.setDoInput(true);
        conn.setUseCaches(false);
        conn.setFollowRedirects(true);
        conn.setAllowUserInteraction(false);
        conn.setRequestMethod("POST");
        conn.setConnectTimeout(500000);

        byte[] authBytes = authStr.getBytes("UTF-8");
        String auth = Base64.getEncoder().encodeToString(authBytes);
        conn.setRequestProperty("Authorization", "Basic " + auth);

      //  System.out.println("post data size:" + postData.length());


        OutputStream out = conn.getOutputStream();
        OutputStreamWriter writer = new OutputStreamWriter(out, "UTF-8");
        writer.write(postData);
        writer.close();
        out.close();

       // System.out.println("connection status: " + conn.getResponseCode() +
      //          "; connection response: " +
       //         conn.getResponseMessage());

        InputStream in = conn.getInputStream();
        InputStreamReader iReader = new InputStreamReader(in);
        BufferedReader bReader = new BufferedReader(iReader);

        String line;
        String response = "";
      //  System.out.println("==================Service response: ================ ");
        while ((line = bReader.readLine()) != null) {
           // System.out.println(line);
            response += line;
        }
        iReader.close();
        bReader.close();
        in.close();
        conn.disconnect();


        return response;
    }
}
