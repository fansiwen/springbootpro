package com.fsw.springbootpro.controller;

import com.fsw.springbootpro.pojo.Student;
import com.fsw.springbootpro.service.serviceimpl.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private TestService testService;
    @GetMapping("test")
    public String test(@RequestParam String p1){
        Student student  = new Student(1,31,2,"fsw");
        testService.log1(p1,student);
        testService.log2(p1,student);
        testService.throwException();
        return "hello aop";
    }
}
