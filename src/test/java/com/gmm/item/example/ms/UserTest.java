package com.gmm.item.example.ms;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.gmm.item.example.ms.dao.UserMapper;
import com.gmm.item.example.ms.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @ClassName：UserTest
 * @description: 用户crud测试
 * @author: gmm
 * @create: 2019-10-24
 * @version：1.0
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void addUserTest() {
        User user = new User();
        user.setuId("6");
        user.setUserName("鲁迅");
        user.setUserPassword("12345");
        int number = userMapper.insert(user);
        System.out.println("return insert value = "+number);
    }

    @Test
    public void deleteByIdUserTest() {
        Integer deleteById = userMapper.deleteById("4L");
        System.out.println("return delete value = " + deleteById);
    }

    @Test
    public void updateUserTest() {
        User user = userMapper.selectById("5");
        user.setUserName("李思");
        user.setUserPassword("55889");
        int number = userMapper.updateById(user);
        System.out.println("return update value = " + number);
    }

    @Test
    public void findByIdUserTest() {
        User user = userMapper.selectById(3L);
        System.out.println("return select value = " + user);
    }

    @Test
    public void findAllTest() {
        List<User> list = userMapper.selectList(null);
        System.out.println("return select value = "+list);
    }

    @Test
    public void findBatchIdsLoadsUserTest() {
        List<Long> list = new ArrayList<>();
        list.add(1L);
        list.add(2L);
        list.add(3L);
        List<User> lists = userMapper.selectBatchIds(list);
        System.out.println("return selectBatchIds value = " + lists);
    }

    @Test
    public void findMapsPageUserTest() {
        Page<User> page = new Page<>(0, 1);
        QueryWrapper<User> queryWrapper = new QueryWrapper<User>();
        IPage<Map<String, Object>> mapIPage = userMapper.selectMapsPage(page, queryWrapper);
        System.out.println("return findMapsPageUser value = "+mapIPage);
    }
}
