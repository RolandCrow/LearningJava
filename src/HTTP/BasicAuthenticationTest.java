package HTTP;

import java.net.Authenticator;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class BasicAuthenticationTest {
    public static void main(String[] args) {
        String username = "kishori";
        char[] password = new char[] {'s', 'h', 'a', 'r','a', 'n' };
        Authenticator.setDefault(
                new BasicAuthenticator(username, password));

        HttpClient client = HttpClient.newBuilder()
                            .authenticator(Authenticator.getDefault())
                            .build();

        HttpRequest request = HttpRequest.newBuilder()
                                .uri(URI.create("https://httpbin.org/basic-auth/" +
                                                    username + "/" + new String(password))).build();

        HttpResponse<String> response = client.sendAsync(request, HttpResponse.BodyHandlers.ofString()).join();
        System.out.println("Response Status:" + response.statusCode());
        System.out.println("Response body:\n" + response.body());

        response.previousResponse()
                .ifPresent(previousResponse ->  {
                    System.out.println("Previous response Status:" + previousResponse.statusCode());
                    System.out.println("Previous response body\n" + previousResponse.body());

                    System.out.println("Previous response headers:");
                    previousResponse.headers().map().entrySet().forEach(System.out:: println);
                });


    }


}
// 101 p