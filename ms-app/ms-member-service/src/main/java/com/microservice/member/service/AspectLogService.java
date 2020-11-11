package com.microservice.member.service;

import com.microservice.member.mapper.ExceptionLog.ExceptionLogPoMapper;
import com.microservice.member.mapper.OperationLog.OperationLogPoMapper;
import com.microservice.member.pojo.ExceptionLog.ExceptionLogPo;
import com.microservice.member.pojo.OperationLog.OperationLogPo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * author  zhaoqi
 * date  2020/10/22 16:50
 */
@Service
public class AspectLogService {

    @Autowired
    OperationLogPoMapper operationLogPoMapper;

    @Autowired
    ExceptionLogPoMapper exceptionLogPoMapper;

    public void insertOperationLog(OperationLogPo operationLogPo){
        int resp = operationLogPoMapper.insert(operationLogPo);
    }

    public void insertExceptionLog(ExceptionLogPo exceptionLogPo){
        int resp = exceptionLogPoMapper.insert(exceptionLogPo);
    }
}
