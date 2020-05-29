package com.mybatis.springbootmybatis.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;
@Data
@EntityScan
@TableName("u_user")
public class Users {

    private Integer id;
    private String username;
    private String first_name;
    private String middle_name;
    private String last_name;
    private String email;
    private String password_digest;
    private String device_id;
    private String phone;
}
