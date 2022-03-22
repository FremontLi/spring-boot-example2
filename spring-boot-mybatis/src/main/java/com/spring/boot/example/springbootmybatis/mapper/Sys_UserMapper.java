package com.spring.boot.example.springbootmybatis.mapper;

import com.spring.boot.example.springbootmybatis.dao.Sys_User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface Sys_UserMapper {

    Sys_User getSys_UserById(String id);
}