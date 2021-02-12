package com.lzh.demo04;

import com.lzh.demo03.Rent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

// 使用此类，自动生成代理类
public class ProxyInvocationHandler implements InvocationHandler {
     // 被代理的接口
    private Object target ;

    public void setTarget( Object target){
        this.target = target ;
    }

    // 生成得到的代理类
    public Object getProxy(){

        return  Proxy.newProxyInstance(this.getClass().getClassLoader(), target.getClass().getInterfaces(), this);

    }

    // 处理代理实列，并返回结果,本质为反射机制的实现
//    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        seehouse();
        log(method.getName());   // 利用反射
        Object result = method.invoke(target,args) ;
        return result;
    }
    public void seehouse(){
        System.out.println("中介带看房");
    }

    public  void log(String msg){
        System.out.println("执行了"+msg+"方法");
    }
}
