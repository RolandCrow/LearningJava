package HTTP;

import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

public class ServerPushPromiseHandler implements HttpResponse.PushPromiseHandler<String> {

    @Override
    public void applyPushPromise(HttpRequest initiatingRequest, HttpRequest pushPromiseRequest, Function<HttpResponse.BodyHandler<String>, CompletableFuture<HttpResponse<String>>> acceptor) {
        System.out.printf("Received push promise request URI: %s%n"
                            + "Push promise initiating request URI: %s%n",
                                pushPromiseRequest.uri(),
                                initiatingRequest.uri());
        acceptor.apply(HttpResponse.BodyHandlers.ofString())
                        .thenAccept(
                                response -> {
                                    System.out.printf("%nProcessed push promise request URI: %s%n"
                                                            + "Pushed response status code: %d%n",
                                                    pushPromiseRequest.uri(),
                                                    response.statusCode());


                                });


    }
}

