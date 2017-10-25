import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Base64;

import java.util.concurrent.TimeUnit;


public class HTTPClient {

    public static void main(String[] args) {

        try {
            URL url = new URL ("http://127.0.0.1:8080/");
            String encoding = "test1";


            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            System.out.println("Connected...");

            connection.setRequestMethod("POST");
            connection.setDoOutput(true);
            InputStream content = (InputStream)connection.getInputStream();
            BufferedReader in   = 
                new BufferedReader (new InputStreamReader (content));
            String line;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
        } catch(Exception e) {
            e.printStackTrace();
        }

    }

}