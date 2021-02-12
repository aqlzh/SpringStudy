package com.lzh.service;

import com.lzh.dao.UserDao;
import com.lzh.dao.UserDaoImpl;

public class UserServiceImpl implements UserService{

    private UserDao userdao = new UserDaoImpl();

    private UserDao userDao;

    public void getUser() {
        userdao.getUser();
    }


    // 利用set 进行动态实现值得注入
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao ;
    }
}
