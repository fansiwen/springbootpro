package com.fsw.springbootpro.service.serviceimpl;

import org.springframework.stereotype.Service;

@Service
public class LogService {
    /**
     * 输出日志
     * @param begignTime
     * @param methodName
     */
    public void log(Long begignTime,String methodName){
        System.out.println(methodName+"at"+begignTime);
    }
}
