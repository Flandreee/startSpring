package com.spring.demo.code.test.service.impl;

import com.spring.demo.code.test.mapper.TestMapper;
import com.spring.demo.code.test.model.Test;
import com.spring.demo.code.test.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class TestServiceImpl implements TestService {

    @Autowired
    TestMapper mapper;

    @Override
    public List<Test> selectInfo(String msg){

        Example e = new Example(Test.class);
        Example.Criteria criteria = e.createCriteria();
        criteria.andEqualTo("msg", msg);
        List<Test> infoList = mapper.selectByExample(e);

        return infoList;

    }

    @Override
    public List<Test> selectByInfo(String info){

        Example e = new Example(Test.class);
        Example.Criteria criteria = e.createCriteria();
        criteria.andGreaterThanOrEqualTo("info", info);
        List<Test> infoList = mapper.selectByExample(e);


        infoList = mapper.selectInfo("4");

        return infoList;

    }


}
