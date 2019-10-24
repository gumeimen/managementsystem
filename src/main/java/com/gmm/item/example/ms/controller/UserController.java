package com.gmm.item.example.ms.controller;

import com.gmm.item.example.ms.model.User;
import com.gmm.item.example.ms.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * @ClassName：UserController
 * @description: 用户控制器
 * @author: gmm
 * @create: 2019-10-23
 * @version：1.0
 **/
@RestController
@RequestMapping("user")
public class UserController{

    @Autowired
    private UserServiceImpl userService;
    
    /** 
    * @Description: 查询单个用户信息
    * @Param: [id] 通过ID查询；
    * @return: com.gmm.demo.model.User 
    * @Author: gmm
    * @Date: 2019-10-24 
    */ 
    @GetMapping(value ="/findById")
    public User findByIdUser(@RequestParam("id") Integer id){
        return userService.getById(id);
    }
    /** 
    * @Description:  
    * @Param: [] 
    * @return: java.util.List<com.gmm.demo.model.User> 
    * @Author: gmm
    * @Date: 2019-10-24
    */ 
    @GetMapping("/findAll")
    public List<User> findAllUser(){
        return userService.selectUserList();
    }
}