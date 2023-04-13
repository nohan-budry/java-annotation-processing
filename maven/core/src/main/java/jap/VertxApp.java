package jap;

import io.vertx.core.Vertx;
import io.vertx.core.http.HttpServer;
import io.vertx.ext.web.Router;

public class VertxApp {
    public static void main(String[] args) {
        Vertx vertx = Vertx.vertx();

        Router router = Router.router(vertx);

        HttpServer httpServer = vertx.createHttpServer();
        httpServer.requestHandler(router);
        httpServer.listen(8080);
    }
}
