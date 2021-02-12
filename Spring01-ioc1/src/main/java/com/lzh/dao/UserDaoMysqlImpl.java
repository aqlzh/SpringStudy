package com.lzh.dao;

public class UserDaoMysqlImpl  implements UserDao {
    @Override
    public void getUser() {
        System.out.println("Mysql 获取用户信息");
    }
}
