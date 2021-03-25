package com.mp;

import com.mp.dao.UserMapper;
import com.mp.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;

/**
 * @description: 类描述
 * @author: fesine
 * @createTime:2021/3/25
 * @update:修改内容
 * @author: fesine
 * @updateTime:2021/3/25
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CrudTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void insert(){
        User user = new User();
        user.setRealName("向水");
        user.setAge(30);
        user.setManagerId(1088248166370832385L);
        user.setCreateTime(LocalDateTime.now());
        user.setRemark("这是一个备注字段");
        int rows = userMapper.insert(user);
        System.out.println("影响行数："+rows);
    }
}
