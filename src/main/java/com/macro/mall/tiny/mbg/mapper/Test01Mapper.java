package com.macro.mall.tiny.mbg.mapper;

import com.macro.mall.tiny.mbg.model.Test01;
import com.macro.mall.tiny.mbg.model.Test01Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Test01Mapper {
    long countByExample(Test01Example example);

    int deleteByExample(Test01Example example);

    int deleteByPrimaryKey(Integer id);

    int insert(Test01 record);

    int insertSelective(Test01 record);

    List<Test01> selectByExample(Test01Example example);

    Test01 selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Test01 record, @Param("example") Test01Example example);

    int updateByExample(@Param("record") Test01 record, @Param("example") Test01Example example);

    int updateByPrimaryKeySelective(Test01 record);

    int updateByPrimaryKey(Test01 record);
}