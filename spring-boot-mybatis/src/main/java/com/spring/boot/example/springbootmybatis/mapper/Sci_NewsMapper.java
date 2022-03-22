package com.spring.boot.example.springbootmybatis.mapper;

import com.spring.boot.example.springbootmybatis.dao.Sci_News;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface Sci_NewsMapper {

    Sci_News getSci_NewsById(String id);

}