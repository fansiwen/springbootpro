package com.fsw.springbootpro.mapper;

import com.fsw.springbootpro.pojo.WhiteName;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
public interface WhiteNameMapper {
    int deleteByPrimaryKey(Integer index);

    int insert(WhiteName record);

    int insertSelective(WhiteName record);

    WhiteName selectByPrimaryKey(Integer index);

    int updateByPrimaryKeySelective(WhiteName record);

    int updateByPrimaryKey(WhiteName record);
}