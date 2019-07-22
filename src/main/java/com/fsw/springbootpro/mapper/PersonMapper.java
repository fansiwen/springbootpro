package com.fsw.springbootpro.mapper;

import com.fsw.springbootpro.pojo.Person;
import org.apache.ibatis.annotations.*;

@Mapper
public interface PersonMapper {
    @Select(value = "select * from person where id = #{id}")
    @Results({
            @Result(property = "id",column = "id")
    })
    Person getPersonByID(@Param("id") int id);
}
