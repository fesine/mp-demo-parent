package com.mp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @description: 类描述
 * @author: fesine
 * @createTime:2021/3/25
 * @update:修改内容
 * @author: fesine
 * @updateTime:2021/3/25
 */
@SpringBootApplication
@MapperScan("com.mp.dao")
public class CrudApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrudApplication.class, args);
    }
}
