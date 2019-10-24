package com.gmm.item.example.ms.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.gmm.item.example.ms.model.User;

import java.util.List;

/**
 * @InterfaceName：UsersMapper
 * @description: 用户信息 服务类接口；
 * @author: gmm
 * @create: 2019-10-24
 * @version：1.0
 **/

public interface UserService extends IService<User> {

    /** 
    * @Description: 查询所有用户信息；
    * @Param: [] 
    * @return: java.util.List<com.gmm.demo.model.User> 
    * @Author: gmm
    * @Date: 2019-10-24 
    */ 
    List<User> selectUserList();

}
