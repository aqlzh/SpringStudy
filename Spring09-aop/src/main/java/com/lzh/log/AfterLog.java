package com.lzh.log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class AfterLog  implements AfterReturningAdvice {

    // returnValue 返回值
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {

    }
}
