import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        String urlBase = "http://www.omdbapi.com/";

        String chaveApi = "e991f82e";

        String titulo = "Titanic";

        String urlStr = urlBase + "?apikey=" + chaveApi + "&t=" + titulo;
        URL url = new URL(urlStr);

        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");

        Scanner scanner = new Scanner(conn.getInputStream());
        String response = scanner.useDelimiter("\\A").next();

        System.out.println(response);

        scanner.close();
        conn.disconnect();
    }
}