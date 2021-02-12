package com.lzh.dao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component ;

// 等价于  <bean id="user" class="com.lzh.pojo.User"/>
@Component
@Scope
public class User {

    public String name ;

    // 相当于  <property name="name" value="QuantumYou"/>
    @Value("QuantunYou")
    public void setName(String name){this.name = name ;}
}
