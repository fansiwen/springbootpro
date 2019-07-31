package com.fsw.springbootpro.pojo;

import org.springframework.stereotype.Component;

@Component
public class User {
    private String userName;
    private String url;
    private String password;

    public void syaHello(){
        System.out.println("hello user");
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", url='" + url + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public void start(){
        System.out.println("Bean 初始化");
    }

    public void destory(){
        System.out.println("Bean 销毁");
    }
}
