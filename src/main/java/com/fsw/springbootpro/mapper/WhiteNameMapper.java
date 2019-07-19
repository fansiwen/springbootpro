package com.fsw.springbootpro.mapper;

import com.fsw.springbootpro.pojo.WhiteName;
import com.fsw.springbootpro.pojoAotu.WhiteNameExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WhiteNameMapper {
    long countByExample(WhiteNameExample example);

    int deleteByExample(WhiteNameExample example);

    int insert(WhiteName record);

    int insertSelective(WhiteName record);

    List<WhiteName> selectByExample(WhiteNameExample example);

    int updateByExampleSelective(@Param("record") WhiteName record, @Param("example") WhiteNameExample example);

    int updateByExample(@Param("record") WhiteName record, @Param("example") WhiteNameExample example);
}