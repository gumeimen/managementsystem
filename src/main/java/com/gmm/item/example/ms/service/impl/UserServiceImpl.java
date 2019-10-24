package com.gmm.item.example.ms.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gmm.item.example.ms.dao.UserMapper;
import com.gmm.item.example.ms.model.User;
import com.gmm.item.example.ms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * @ClassName：UserServiceImpl
 * @description: 用户服务实现类
 * @author: gmm
 * @create: 2019-10-23
 * @version：1.0
 **/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> selectUserList() {
        return userMapper.selectList(null);
    }
}
