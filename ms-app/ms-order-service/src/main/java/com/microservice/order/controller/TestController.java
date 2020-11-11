package com.microservice.order.controller;

import com.microservice.order.service.RedisAtomicService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * author  zhaoqi
 * date  2020/11/3 11:33
 */
@RestController
@RequestMapping("/redis")
@Api(tags = "测试接口")
public class TestController {

    @Autowired
    RedisAtomicService redisAtomicService;

    @ApiOperation("redisGet")
    @RequestMapping(value = "/redisGet", method = RequestMethod.GET)
    public Object redisGet(){
        return redisAtomicService.query("hh");
    }

    @ApiOperation("redisSet")
    @RequestMapping(value = "/redisSet", method = RequestMethod.GET)
    public Object redisSet(){
        return redisAtomicService.saveStr("hh", "dsfassdf");
    }

}
