package com.fsw.springbootpro.annotation;

import com.fsw.springbootpro.service.serviceimpl.LogService;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;

import java.lang.reflect.Method;

/**
 * 日志切面类
 */
@Aspect
@Component
public class SysLogAspect {
    @Autowired
    private LogService logService;

    @Pointcut("@annotation(com.fsw.springbootpro.annotation.SysLog)")
    public void logPointCut(){
    }

    /**
     * 前置通知
     * @param joinPoint
     */
    @Before("logPointCut()")
    public void before(JoinPoint joinPoint){
        //获取当前系统时间毫秒数
        long beginTime = System.currentTimeMillis();
        //获取目标方法的信息
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        //获取目标方法
        Method method = signature.getMethod();
        //通过注解获取注解的类
        SysLog sysLog = method.getAnnotation(SysLog.class);
        //获取注解的值
        String value = sysLog.value();
        Object[] objects = joinPoint.getArgs();
        logService.log(beginTime,"before"+method.getName());
    }
    @Around("logPointCut()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        long beginTime = System.currentTimeMillis();
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Method method = methodSignature.getMethod();
        SysLog sysLog = method.getAnnotation(SysLog.class);
        String value = sysLog.value();
        Object[] args = joinPoint.getArgs();
        Object object = joinPoint.proceed(args);
        logService.log(beginTime,"around"+method.getName());
        return object;
    }
    @After("logPointCut()")
    public void after(JoinPoint joinPoint){
        long beginTime = System.currentTimeMillis();
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Method method = methodSignature.getMethod();
        SysLog sysLog = method.getAnnotation(SysLog.class);
        String value = sysLog.value();
        Object[] args = joinPoint.getArgs();
        logService.log(beginTime,"after"+method.getName());
    }
    @AfterReturning("logPointCut()")
    public void afterReturnning(JoinPoint joinPoint){
        long beginTime = System.currentTimeMillis();
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Method method = methodSignature.getMethod();
        SysLog sysLog = method.getAnnotation(SysLog.class);
        String value = sysLog.value();
        Object[] args = joinPoint.getArgs();
        logService.log(beginTime,"afterReturnning"+method.getName());
    }
    @AfterThrowing("logPointCut()")
    public void afterThrowing(JoinPoint joinPoint){
        long beginTime = System.currentTimeMillis();
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Method method = methodSignature.getMethod();
        SysLog sysLog = method.getAnnotation(SysLog.class);
        String value = sysLog.value();
        Object[] args = joinPoint.getArgs();
        logService.log(beginTime,"afterThrowing"+method.getName());
    }
}