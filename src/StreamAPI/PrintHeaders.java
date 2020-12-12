package StreamAPI;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class PrintHeaders {
    public static void main(String[] args) {
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                                .uri(URI.create("http:/httpbin.org"))
                                .method("HEAD", HttpRequest.BodyPublishers.noBody())
                                .build();

        try {
            HttpResponse<Void> response = client.send(request, HttpResponse.BodyHandlers.discarding());
            System.out.println("Status code:" + response.statusCode());
            System.out.println("Response Headers:");
            response.headers().map().entrySet().forEach(System.out:: println);

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
