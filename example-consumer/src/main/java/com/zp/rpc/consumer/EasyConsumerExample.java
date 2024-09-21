package com.zp.rpc.consumer;/**
 * 功能描述
 *
 * @author MyFellingIsBetter
 * @date 2024/09/18  19:03
 */

import com.zp.common.model.User;
import com.zp.common.service.UserService;
import zp.rpc.easy.proxy.ServiceProxyFactory;

/**
 *@ClassName EasyConsumerExample
 *@Description TODO
 *@Author MyFellingIsBetter
 *@Date 2024/9/18 19:03
 *@Version 1.0
 */
public class EasyConsumerExample {

    public static void main(String[] args) {
        // 静态代理
//        UserService userService = new UserServiceProxy();
        // 动态代理
        UserService userService = ServiceProxyFactory.getProxy(UserService.class);
        User user = new User();
        user.setName("zp");
        // 调用
        User newUser = userService.getUser(user);
        if (newUser != null) {
            System.out.println(newUser.getName());
        } else {
            System.out.println("user == null");
        }
    }
}
