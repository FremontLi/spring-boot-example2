package com.spring.boot.example.springbootmybatis.controller;


import com.spring.boot.example.springbootmybatis.dao.Sci_News;
import com.spring.boot.example.springbootmybatis.mapper.Sci_NewsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Sci_NewsController {

    @Autowired
    private Sci_NewsMapper sci_newsMapper;

    @ResponseBody
    @RequestMapping("/getSci_NewsById")
    public Sci_News getSci_NewsById(String id){
        return sci_newsMapper.getSci_NewsById(id);
    }
}