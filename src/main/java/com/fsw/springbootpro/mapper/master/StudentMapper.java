package com.fsw.springbootpro.mapper.master;

import com.fsw.springbootpro.pojo.Student;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface StudentMapper {
   // @Select("select * from student")
    List<Student> getList();
    //@Select("select * from student where id = #{id}")
    Student getByID(int id);
    //@Insert("insert into student (age,grade,name) values(#{age},#{grade},#{name})")
    void insertStudent(Student student);
    //@Update("update student set age=#{age},grade=#{grade},name=#{name} where id = #{id}")
    void update(Student student);
    //@Delete("delete from student where id=#{id}")
    void delete(int id);
}
