import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import  java.util.*;


public class Test6 {

    public static void main(String[] args) throws IOException {

      /*

 Design and implement a basic version of a URL shortener service similar to bit.ly. The service should have the following capabilities:
Shorten URL: Given a long URL, return a unique short URL.
Expand URL: Given a short URL, return the original long URL.
Analytics (optional): Track how many times a short URL was accessed.
   url : http://javaAPi/test/add
       */

        String urlLong = "http://javaAPi/test/add";

        String apiUrl = "https://bit.ly"; // here we have put API url I have taken dummy one

        Map map = new HashMap();
        map.put("longUrl",urlLong);

        //URL url1 = new URL(urlLong);
        URL url = new URL(apiUrl);

        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("Authorised","Bear"+ "Token");
        httpURLConnection.setRequestProperty("ContentType","application/json");
        httpURLConnection.setDoOutput(true);

        try(OutputStream os = httpURLConnection.getOutputStream()){
            os.write(map.toString().getBytes());
        }

        Scanner scanner = new Scanner(httpURLConnection.getInputStream());
        String response = scanner.useDelimiter("\\A").next();
        scanner.close();

        System.out.println("response : "+response);

    }
}
