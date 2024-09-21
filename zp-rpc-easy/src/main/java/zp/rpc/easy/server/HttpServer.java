package zp.rpc.easy.server;

/**
 * 功能描述
 *
 * @author MyFellingIsBetter
 * @date 2024/09/18  19:16
 */
public interface HttpServer {
    /**
     * 启动服务器
     *
     * @param port
     */
    void doStart(int port);
}
