package com.lzh.demo03;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

// 使用此类，自动生成代理类
public class ProxyInvocationHandler implements InvocationHandler {
     // 被代理的接口
    private Rent rent ;

    public void setRent(Rent rent){
        this.rent = rent ;
    }

    // 生成得到的代理类
    public Object getProxy(){

        return  Proxy.newProxyInstance(this.getClass().getClassLoader(), rent.getClass().getInterfaces(), this);

    }

    // 处理代理实列，并返回结果,本质为反射机制的实现
//    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        seehouse();
        Object result = method.invoke(rent,args) ;
        return result;
    }
    public void seehouse(){
        System.out.println("中介待看房");
    }
}
