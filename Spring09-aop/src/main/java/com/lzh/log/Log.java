package com.lzh.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;


// method  要执行的目标对象的方法
// objects (args) 参数
//  o (target) 目标参数
public class Log implements MethodBeforeAdvice {
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println(o.getClass().getName()+"的"+method.getName()+"被执行了");
    }
}
