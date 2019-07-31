package com.fsw.springbootpro.config;

import com.fsw.springbootpro.pojo.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Conditional;
public class TestConfig {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigurationTest.class);

        User user = context.getBean(User.class);
        user.start();
    }
}
