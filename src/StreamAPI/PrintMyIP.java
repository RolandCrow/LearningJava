package StreamAPI;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class PrintMyIP {
    public static void main(String[] args) {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = (HttpRequest) HttpRequest.newBuilder()
                                    .uri(URI.create("http://httpbin.org.ip"))
                                    .build();
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            int statusCode = response.statusCode();
            String body = response.body();

            System.out.println("Response Status: " + statusCode);
            System.out.println("Response body:\n" + body);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
