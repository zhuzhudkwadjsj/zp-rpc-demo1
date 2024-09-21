package zp.rpc.easy.server;/**
 * 功能描述
 *
 * @author MyFellingIsBetter
 * @date 2024/09/18  19:30
 */

import io.vertx.core.Vertx;

/**
 *@ClassName VertxHttpServer
 *@Description TODO
 *@Author MyFellingIsBetter
 *@Date 2024/9/18 19:30
 *@Version 1.0
 */
public class VertxHttpServer implements HttpServer{

    @Override
    public void doStart(int port) {
        //创建vertx实例
        Vertx vertx = Vertx.vertx();

        // 创建 HTTP 服务器
        io.vertx.core.http.HttpServer server = vertx.createHttpServer();

        //监听端口并处理
        server.requestHandler(new HttpServerHandler());

        // 启动 HTTP 服务器并监听指定端口
        server.listen(port, result -> {
            if (result.succeeded()) {
                System.out.println("Server is now listening on port " + port);
            } else {
                System.err.println("Failed to start server: " + result.cause());
            }
        });
    }
}
