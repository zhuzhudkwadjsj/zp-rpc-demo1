package com.zp.common.model;/**
 * 功能描述
 *
 * @author MyFellingIsBetter
 * @date 2024/09/17  23:55
 */

/**
 *@ClassName User
 *@Description TODO
 *@Author MyFellingIsBetter
 *@Date 2024/9/17 23:55
 *@Version 1.0
 */
import java.io.Serializable;

/**
 * 用户
 */
public class User implements Serializable {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

