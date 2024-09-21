package com.zp.rpc.consumer;/**
 * 功能描述
 *
 * @author MyFellingIsBetter
 * @date 2024/09/18  22:30
 */

/**
 *@ClassName UserServiceProxy
 *@Description TODO
 *@Author MyFellingIsBetter
 *@Date 2024/9/18 22:30
 *@Version 1.0
 */

import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpResponse;
import com.zp.common.model.User;
import com.zp.common.service.UserService;
import zp.rpc.easy.model.RpcRequest;
import zp.rpc.easy.model.RpcResponse;
import zp.rpc.easy.serializer.JdkSerializer;
import zp.rpc.easy.serializer.Serializer;

import java.io.IOException;

/**
 * 静态代理
 */
public class UserServiceProxy implements UserService {

    @Override
    public User getUser(User user) {
        // 指定序列化器
        Serializer serializer = new JdkSerializer();

        // 发请求
        RpcRequest rpcRequest = RpcRequest.builder()
                .serviceName(UserService.class.getName())
                .methodName("getUser")
                .parameterTypes(new Class[]{User.class})
                .args(new Object[]{user})
                .build();
        try {
            byte[] bodyBytes = serializer.serialize(rpcRequest);
            byte[] result;
            try (HttpResponse httpResponse = HttpRequest.post("http://localhost:8080")
                    .body(bodyBytes)
                    .execute()) {
                result = httpResponse.bodyBytes();
            }
            RpcResponse rpcResponse = serializer.deserialize(result, RpcResponse.class);
            return (User) rpcResponse.getData();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}
