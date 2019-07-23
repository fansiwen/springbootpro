package com.fsw.springbootpro.controller;

import com.fsw.springbootpro.pojo.Student;
import com.fsw.springbootpro.pojo.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * JDBC多数据源控制器
 */
@RestController
public class JdbcMultiDbController {
    /*@Autowired
    @Qualifier("masterTemplate")
    private JdbcTemplate masterTemplate;
    @Autowired
    @Qualifier("slaveTemplate")
    private JdbcTemplate slaveTemplate;
    @RequestMapping(value = "/list")
    public void list(){
        String studentSql = "select * from student";
        RowMapper<Student> studentRowMapper = new BeanPropertyRowMapper<>(Student.class);
        List<Student> studentList = masterTemplate.query(studentSql, studentRowMapper);
        System.out.println(studentList);

        String teacherSql = "select * from teacher";
        RowMapper<Teacher> teacherRowMapper = new BeanPropertyRowMapper<>(Teacher.class);
        List<Teacher> teacherList = slaveTemplate.query(teacherSql, teacherRowMapper);
        System.out.println(teacherList);
    }*/

}
