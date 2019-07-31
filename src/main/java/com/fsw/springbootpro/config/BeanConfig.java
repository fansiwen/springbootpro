package com.fsw.springbootpro.config;

import com.fsw.springbootpro.conditonnal.LinuxCondition;
import com.fsw.springbootpro.conditonnal.WindowsCondition;
import com.fsw.springbootpro.pojo.Person;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * 配置Person的自动配置类
 */
@Configuration
public class BeanConfig {
    @Conditional({WindowsCondition.class})
    @Bean(value = "fsw")
    public Person getPerson1(){
        return new Person(1,"fsw",31);
    }
    @Conditional({LinuxCondition.class})
    @Bean(value = "hly")
    public Person getPerson2(){
        return new Person(2,"hly",30);
    }
}
