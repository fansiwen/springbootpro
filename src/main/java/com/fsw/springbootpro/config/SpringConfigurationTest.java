package com.fsw.springbootpro.config;

import com.fsw.springbootpro.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("com.fsw.springbootpro.pojo")
public class SpringConfigurationTest {
    //构造方法
    public SpringConfigurationTest(){
        System.out.println("我自定义的配置类方法开始了！！！！");
    }
    /*@Bean(initMethod = "start",destroyMethod = "destory")
    @Scope("prototype")
    public User getUser(){
        return new User();
    }*/
}
