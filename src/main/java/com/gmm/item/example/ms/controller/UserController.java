package com.gmm.item.example.ms.controller;

import com.gmm.item.example.ms.model.User;
import com.gmm.item.example.ms.service.impl.UserServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
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
@Api(tags = "用户模块接口")
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
    @GetMapping(value ="/{uId}")
    @ApiOperation(value = "获取单个用户信息", notes = "根据url的id来获取用户详细信息")
    @ApiImplicitParam(name = "uId",value = "编号", required = true,paramType = "path")
    public User findByIdUser(@PathVariable @Valid Integer uId){
        return userService.getById(uId);
    }
    /** 
    * @Description: 查询所有用户信息；
    * @Param: [] 
    * @return: java.util.List<com.gmm.demo.model.User> 
    * @Author: gmm
    * @Date: 2019-10-24
    */ 
    @GetMapping("/findAll")
    @ApiOperation(value = "获取用户详细信息", notes = "查询用户信息")
    public List<User> findAllUser(){
        return userService.selectUserList();
    }
}