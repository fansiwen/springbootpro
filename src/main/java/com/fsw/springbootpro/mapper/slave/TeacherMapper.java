package com.fsw.springbootpro.mapper.slave;

import com.fsw.springbootpro.pojo.Teacher;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface TeacherMapper {
    //@Select("select * from teacher")
    List<Teacher> getList();
    //@Select("select * from teacher where id = #{id}")
    Teacher getByID(int id);
    //@Insert("insert into teacher (age,course,name) values(#{age},#{course},#{name})")
    void insert (Teacher teacher);
    //@Update("update teacher set age=#{age},course=#{course},name=#{name} where id=#{id}")
    void update (Teacher teacher);
    //@Delete("delete from teacher where id = #{id}")
    void delete(int id);
}
