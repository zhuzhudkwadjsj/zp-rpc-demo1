package com.zp.provider;/**
 * 功能描述
 *
 * @author MyFellingIsBetter
 * @date 2024/09/18  8:52
 */

import com.zp.common.service.UserService;
import zp.rpc.easy.registry.LocalRegistry;
import zp.rpc.easy.server.HttpServer;
import zp.rpc.easy.server.VertxHttpServer;

/**
 *@ClassName EasyProviderExample
 *@Description TODO
 *@Author MyFellingIsBetter
 *@Date 2024/9/18 8:52
 *@Version 1.0
 */
public class EasyProviderExample {
    public static void main(String[] args) {
        //注册服务
        LocalRegistry.register(UserService.class.getName(), UserServiceImpl.class);

        //提供服务
        HttpServer httpServer = new VertxHttpServer();
        httpServer.doStart(8080);
    }
}
