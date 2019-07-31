package com.fsw.springbootpro.conditonnal;

import com.fsw.springbootpro.config.BeanConfig;
import com.fsw.springbootpro.pojo.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;

public class TestPersonBean {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);

        String property = context.getEnvironment().getProperty("os.name");
        Map<String,Person> map = context.getBeansOfType(Person.class);
        System.out.println(map+"运行环境为;"+property);
    }
}
