package com.lzh.demo02;

public class UserServiceProxy implements UserService{

    private UserServiceImpl userService ;

//    public UserServiceProxy(){    在 Spring中不推荐
//
//    }


    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

//    public UserServiceProxy() {
////
////    }

    @Override
    public void add() {
        log("add") ;
       userService.add();
    }

    @Override
    public void delete() {
        log("delete") ;
       userService.delete();
    }

    @Override
    public void update() {
        log("update");
      userService.update();
    }

    @Override
    public void query() {
        log("query") ;
        userService.query();
    }

    // 日志方法
    public void log(String msg){
        System.out.println("【debug】"+msg+"方法");
    }
}
