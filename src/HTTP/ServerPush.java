package HTTP;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ServerPush {
    public static void main(String[] args) {
        HttpClient client = HttpClient.newBuilder()
                                .followRedirects(HttpClient.Redirect.ALWAYS)
                                .build();
        HttpRequest request = HttpRequest.newBuilder()
                                .uri(URI.create("http://www.angular.io"))
                                .build();

        HttpResponse<String> response = client.sendAsync(request,
                HttpResponse.BodyHandlers.ofString(),
                new ServerPushPromiseHandler()).join();

        System.out.printf("Initiating request URI: %s%n" +
                                "Response's request code: %d%n" +
                                "Response's status code: %d%n",
                                request.uri(),
                                response.request().uri(),
                                response.statusCode());

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
