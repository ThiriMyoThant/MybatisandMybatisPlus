package com.mybatis.springbootmybatis.controller;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.mybatis.springbootmybatis.mapper.UsersMapper;
import com.mybatis.springbootmybatis.model.Users;
import org.apache.catalina.mapper.Constants;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.yaml.snakeyaml.scanner.Constant;

//import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
//import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import java.util.List;

@RestController
@RequestMapping("/user")
public class User {
    private UsersMapper usersMapper;

    @Autowired
    public User(UsersMapper usersMapper) {
        this.usersMapper = usersMapper;
    }

    //Using Mybatis
//    @GetMapping("/list")
//    public List<Users> getAll()
//    {
//      return  usersMapper.findAll();
//    }
//
//    @GetMapping("/update")
//    private List<Users> update(@RequestBody  Users user)
//    {
//
//         usersMapper.updatebyId(user);
//         return usersMapper.findAll();
//    }
//
//    @GetMapping("/insert")
//    private List<Users> Insert(@RequestBody  Users user)
//    {
//
//        usersMapper.insert(user);
//        return usersMapper.findAll();
//    }
//    @GetMapping("/delete")
//    private  List<Users> Delete(int id)
//    {
//        usersMapper.delete(id);
//        return  usersMapper.findAll();
//    }


    //Using mybatisplus

    @GetMapping("/list")
    public List<Users> getAll()
    {
       // usersMapper.selectList(Wrappers.<Users>lambdaQuery().select());
      return    usersMapper.selectList(Wrappers.<Users>lambdaQuery().select());
    }

    @GetMapping("/insert")
    private List<Users> Insert(@RequestBody  Users user)
    {
        usersMapper.insert(user);
        return usersMapper.selectList(Wrappers.<Users>lambdaQuery().select());
    }
    @GetMapping("/delete")
    private  List<Users> Delete(int id)
    {
        usersMapper.deleteById(id);
       return  usersMapper.selectList(Wrappers.<Users>lambdaQuery().select());
    }
    @GetMapping("/update")
    private  List<Users> update(@RequestBody  Users user)
    {
        usersMapper.updateById(user);
        return  usersMapper.selectList(Wrappers.<Users>lambdaQuery().select());

    }


}
