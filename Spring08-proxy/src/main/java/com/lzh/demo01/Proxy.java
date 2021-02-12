package com.lzh.demo01;

public class Proxy  implements Rent{

    private Host host ;

    public Proxy() {
    }

    public Proxy(Host host) {
        this.host = host;
    }

    @Override
    public void rent() {
         seeHouse();
         contract();
         fare();
    }

    // 看房
    public void seeHouse(){
        System.out.println("中介带你看房");
    }

    // 签合同
    public void contract(){
        System.out.println("签合同");
    }
    //收取中介费
    public void fare(){
        System.out.println("收取中介费");
    }

}
