package com.fsw.springbootpro.controller;

import com.fsw.springbootpro.mapper.master.StudentMapper;
import com.fsw.springbootpro.mapper.slave.TeacherMapper;
import com.fsw.springbootpro.pojo.Student;
import com.fsw.springbootpro.pojo.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MybatisMultiDbController {
    @Autowired
    private StudentMapper studentMapper;
    @Autowired
    private TeacherMapper teacherMapper;
    @RequestMapping("/students")
    public List<Student> getStudents(){
        return studentMapper.getList();
    }
    @RequestMapping("/teachers")
    public List<Teacher> getTeachers(){
        return teacherMapper.getList();
    }
}
