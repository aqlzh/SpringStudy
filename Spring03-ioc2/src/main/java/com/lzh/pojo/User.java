package com.lzh.pojo;

public class User {
    private String name ;

//    public User(){
//        System.out.println("User的无参构造");    // 默认一直存在
//    }

    // -> 改为有参

    public User(String name){
        this.name = name ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("name"+name);
    }
}
