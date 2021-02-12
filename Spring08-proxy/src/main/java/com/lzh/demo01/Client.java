package com.lzh.demo01;

public class Client {
    public static void main(String[] args) {
        Host host = new Host();

//        host.rent();
        Proxy proxy = new Proxy(host) ;
        proxy.rent();
    }
}
