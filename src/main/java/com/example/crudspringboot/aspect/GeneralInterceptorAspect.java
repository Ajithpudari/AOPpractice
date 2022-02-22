package com.example.crudspringboot.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Slf4j
@Component
public class GeneralInterceptorAspect {

    @Pointcut("execution(* com.example.crudspringboot.controller.*.*(..))")
    public void loggingPointCut() {
    }

    @Before("loggingPointCut()")
    public void before(JoinPoint joinpoint) {
        log.info("beforeMethodInvoked::"+joinpoint.getSignature());


    }
    @After("loggingPointCut()")
    public void after(JoinPoint joinpoint) {
        log.info("AfterMethodInvoked::"+joinpoint.getSignature());


    }
}