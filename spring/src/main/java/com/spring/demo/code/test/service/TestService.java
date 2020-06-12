package com.spring.demo.code.test.service;

import com.spring.demo.code.test.model.Test;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public interface TestService {

    List<Test> selectInfo(String msg);

    List<Test> selectByInfo(String info);
}
