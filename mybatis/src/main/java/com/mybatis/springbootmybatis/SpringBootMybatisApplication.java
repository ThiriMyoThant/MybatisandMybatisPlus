package com.mybatis.springbootmybatis;

import com.mybatis.springbootmybatis.model.Users;
import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.mybatis.springbootmybatis.mapper")
@MappedTypes(Users.class)
@SpringBootApplication

public class SpringBootMybatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMybatisApplication.class, args);
		System.out.println("Thiri Myo Thant");
	}

}
