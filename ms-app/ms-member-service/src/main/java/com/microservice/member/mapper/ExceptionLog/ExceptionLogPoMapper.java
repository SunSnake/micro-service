package com.microservice.member.mapper.ExceptionLog;

import com.microservice.member.pojo.ExceptionLog.ExceptionLogPo;
import com.microservice.member.pojo.ExceptionLog.ExceptionLogPoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ExceptionLogPoMapper {
    int countByExample(ExceptionLogPoExample example);

    int deleteByExample(ExceptionLogPoExample example);

    int deleteByPrimaryKey(String excepId);

    int insert(ExceptionLogPo record);

    int insertSelective(ExceptionLogPo record);

    List<ExceptionLogPo> selectByExampleWithBLOBs(ExceptionLogPoExample example);

    List<ExceptionLogPo> selectByExample(ExceptionLogPoExample example);

    ExceptionLogPo selectByPrimaryKey(String excepId);

    int updateByExampleSelective(@Param("record") ExceptionLogPo record, @Param("example") ExceptionLogPoExample example);

    int updateByExampleWithBLOBs(@Param("record") ExceptionLogPo record, @Param("example") ExceptionLogPoExample example);

    int updateByExample(@Param("record") ExceptionLogPo record, @Param("example") ExceptionLogPoExample example);

    int updateByPrimaryKeySelective(ExceptionLogPo record);

    int updateByPrimaryKeyWithBLOBs(ExceptionLogPo record);

    int updateByPrimaryKey(ExceptionLogPo record);
}
