package com.microservice.member.mapper.OperationLog;

import com.microservice.member.pojo.OperationLog.OperationLogPo;
import com.microservice.member.pojo.OperationLog.OperationLogPoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OperationLogPoMapper {
    int countByExample(OperationLogPoExample example);

    int deleteByExample(OperationLogPoExample example);

    int deleteByPrimaryKey(String operId);

    int insert(OperationLogPo record);

    int insertSelective(OperationLogPo record);

    List<OperationLogPo> selectByExample(OperationLogPoExample example);

    OperationLogPo selectByPrimaryKey(String operId);

    int updateByExampleSelective(@Param("record") OperationLogPo record, @Param("example") OperationLogPoExample example);

    int updateByExample(@Param("record") OperationLogPo record, @Param("example") OperationLogPoExample example);

    int updateByPrimaryKeySelective(OperationLogPo record);

    int updateByPrimaryKey(OperationLogPo record);
}
