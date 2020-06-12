package com.spring.demo.code.test.action;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.spring.demo.code.test.model.Test;
import com.spring.demo.code.test.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/test")
public class testAction {

    private static final Logger logger = LoggerFactory.getLogger(testAction.class);

    @Autowired
    TestService testService;

    @GetMapping("test")
    public JSONObject test(){
        JSONObject testJSON = new JSONObject();
        testJSON.put("code", 200);
        testJSON.put("msg", "test");
        return testJSON;
    }

    @GetMapping("testMysql")
    public JSONArray testMysql(String msg){
        List<Test> testList = testService.selectInfo(msg);
        JSONArray jsonArray = new JSONArray();
        testList.forEach(x -> jsonArray.add(JSONObject.toJSON(x)));

        return jsonArray;

    }

    @GetMapping("test1")
    public JSONArray test1(String info){
        List<Test> testList = testService.selectByInfo(info);
        JSONArray jsonArray = new JSONArray();
        testList.forEach(x -> jsonArray.add(JSONObject.toJSON(x)));

        return jsonArray;
    }
}
