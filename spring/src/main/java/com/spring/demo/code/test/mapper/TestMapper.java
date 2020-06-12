package com.spring.demo.code.test.mapper;

import com.spring.demo.code.test.model.Test;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.BaseMapper;
import tk.mybatis.mapper.common.ExampleMapper;

import java.util.List;

@Mapper
public interface TestMapper extends BaseMapper<Test>, ExampleMapper<Test> {


    List<Test> selectInfo(String s);
}
