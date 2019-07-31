package com.fsw.springbootpro.service.serviceimpl;

import com.fsw.springbootpro.annotation.SysLog;
import com.fsw.springbootpro.pojo.Student;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    @SysLog("log-1")
    public void log1(String name, Student student){
        System.out.println("print log1"+name+""+student.toString());
    }
    @SysLog("log-2")
    public void log2(String name,Student student){
        System.out.println("print log2"+name+""+student.toString());
    }
    @SysLog("throw-exception")
    public void throwException(){
        System.out.println("throw exception");
        int i = 3/0;
    }
}
