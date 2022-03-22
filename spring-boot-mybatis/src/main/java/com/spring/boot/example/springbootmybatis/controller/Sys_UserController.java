package com.spring.boot.example.springbootmybatis.controller;


import com.spring.boot.example.springbootmybatis.dao.Sys_User;
import com.spring.boot.example.springbootmybatis.mapper.Sys_UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Sys_UserController {

    @Autowired
    private Sys_UserMapper sys_userMapper;

    @ResponseBody
    @RequestMapping("/getSys_UserById")
    public Sys_User getSci_NewsById(String id){
        return sys_userMapper.getSys_UserById(id);
    }
}