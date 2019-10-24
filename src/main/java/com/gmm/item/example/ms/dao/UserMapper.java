package com.gmm.item.example.ms.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gmm.item.example.ms.model.User;
import org.apache.ibatis.annotations.Mapper;
/**
 * @InterfaceName：UsersMapper
 * @description: 用户接口
 * @author: gmm
 * @create: 2019-10-24
 * @version：1.0
 **/
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
