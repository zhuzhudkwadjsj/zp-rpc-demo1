package com.zp.provider;/**
 * 功能描述
 *
 * @author MyFellingIsBetter
 * @date 2024/09/18  8:45
 */

import com.zp.common.model.User;
import com.zp.common.service.UserService;

/**
 *@ClassName UserServiceImpl
 *@Description TODO
 *@Author MyFellingIsBetter
 *@Date 2024/9/18 8:45
 *@Version 1.0
 */
public class UserServiceImpl implements UserService {
    @Override
    public User getUser(User user) {
        System.out.println("用户名：" + user.getName());
        return user;
    }
}
