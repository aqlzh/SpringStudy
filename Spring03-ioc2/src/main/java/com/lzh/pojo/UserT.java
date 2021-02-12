package com.lzh.pojo;

public class UserT {
    private String name ;

    public UserT(){
        System.out.println("User的无参构造");    // 默认一直存在
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
