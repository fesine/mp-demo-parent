package com.mp.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @description: 类描述
 * @author: fesine
 * @createTime:2021/3/25
 * @update:修改内容
 * @author: fesine
 * @updateTime:2021/3/25
 */

@Data
@TableName("mp_user")//指定表名
public class User {

    /**
     * 主键
     */
    @TableId//指定为主键，使用雪花算法生成id值
    private Long userId;

    /**
     * 姓名
     */
    @TableField("name")//指定列名
    private String realName;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 直属上级
     */
    private Long managerId;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;
}
