package com.mybatis.springbootmybatis.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mybatis.springbootmybatis.model.Users;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UsersMapper extends BaseMapper<Users> {
    //If you use mybatis only , you need to write Query Like this , and not need extends
    //BaseMapper
//    @Select("select * from u_user")
//    List<Users> findAll();

//    @Update("update u_user set  " +
//            "username = #{username},"+
//            "first_name = #{first_name},"+
//            "middle_name = #{middle_name},"+
//            "last_name = #{last_name},"+
//            "email = #{email},"+
//            "password_digest = #{password_digest},"+
//            "device_id = #{device_id},"+
//            "phone = #{phone} "+
//            "where id = #{id}")
//     void updatebyId(Users user);
//
//    @Insert("insert into u_user (username,first_name,middle_name,last_name,email,password_digest,device_id,phone) values " +
//            "(#{username},"+
//            " #{first_name},"+
//            " #{middle_name},"+
//            "#{last_name},"+
//            " #{email},"+
//            " #{password_digest},"+
//            " #{device_id},"+
//            " #{phone})")
//    void insert(Users user);
//
//    @Delete("delete from u_user where id = #{id}")
//    void delete(int id);
}
