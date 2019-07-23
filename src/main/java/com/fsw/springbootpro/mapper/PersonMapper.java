package com.fsw.springbootpro.mapper;

import com.fsw.springbootpro.pojo.Person;
import org.apache.ibatis.annotations.*;

import java.util.ArrayList;
import java.util.List;

@Mapper
public interface PersonMapper {
    /*@Select(value = "select * from person where id = #{id}")
    @Results({
            @Result(property = "id",column = "id")
    })
    Person getPersonByID(@Param("id") int id);

    *//**
     * 获取person列表
     *//*
    @Select("select * from person where 1=1")
    ArrayList<Person> getPersons();

    int deleteByPrimaryKey(Integer id);

    int insert(Person record);

    int insertSelective(Person record);

    Person selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Person record);

    int updateByPrimaryKey(Person record);

    List<Person> selectAll();*/
}
