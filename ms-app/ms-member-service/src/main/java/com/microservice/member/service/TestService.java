package com.microservice.member.service;

import com.microservice.member.mapper.test.TestMapper;
import com.microservice.member.utils.RedisUtil;
import com.microservice.member.utils.aop.TraceLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * author  zhaoqi
 * date  2020/10/22 9:56
 */
@Service
public class TestService {

    @Autowired
    TestMapper testMapper;

    @TraceLog(operModul = "测试接口2", operType = "2", operDesc = "2")
    public Object testGet(){
        return testMapper.testGet();
    }
}
