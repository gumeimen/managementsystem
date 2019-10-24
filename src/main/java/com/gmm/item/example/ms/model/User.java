package com.gmm.item.example.ms.model;

import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * @ClassName：User
 * @description: 用户信息类
 * @author: gmm
 * @create: 2019-10-23
 * @version：1.0
 **/
public class User implements Serializable{

    @TableId  //表主键标识;
    private String uId;

    private String userName;

    private String userPassword;

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
}
