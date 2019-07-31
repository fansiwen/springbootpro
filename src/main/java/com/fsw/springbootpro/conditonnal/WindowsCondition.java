package com.fsw.springbootpro.conditonnal;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * 在Windows环境下进行加载
 * conditionContext:判断条件能使用的上下文环境
 * annotatedTypeMetadata:注解所在位置的注释信息
 */
public class WindowsCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        //获取Bean工厂
        ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();
        //获取类加载器
        ClassLoader classLoader = context.getClassLoader();
        //获取环境
        Environment environment = context.getEnvironment();
        //获得Bean的注册类
        BeanDefinitionRegistry registry = context.getRegistry();
        //获得操作系统名称
        String osName = environment.getProperty("os.name");
        if(osName.contains("Windows")){
            return true;
        }
        return false;
    }
}
