package com.mp;

import com.mp.dao.UserMapper;
import com.mp.entity.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

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
public class SimpleTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void test(){
        List<User> list = userMapper.selectList(null);
        Assert.assertEquals(5, list.size());
        list.forEach(System.out::println);
    }
}
