package com.microservice.member.controller;

import com.microservice.member.service.TestService;
import com.microservice.member.utils.RedisUtil;
import com.microservice.member.utils.aop.TraceLog;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * author  zhaoqi
 * date  2020/10/22 8:45
 */
@RestController
@RequestMapping("/test")
@Api(tags = "测试接口")
public class TestController {

    @Autowired
    TestService testService;

    @Autowired
    RedisUtil redisUtil;

    @ApiOperation("get请求")
    @RequestMapping(value = "/testGet", method = RequestMethod.GET)
    @TraceLog(operModul = "测试接口", operType = "新增测试", operDesc = "测试新增接口")
    public Object testGet(){
        return testService.testGet();
    }

    @ApiOperation("redis")
    @RequestMapping(value = "/redis", method = RequestMethod.GET)
    @TraceLog(operModul = "redis", operType = "新增测试", operDesc = "测试redis")
    public Object redis(){
        return redisUtil.get("hh");
    }

}
