package com.threadsafe.two;

public class Threadsetdaemonrun {
    public static void main(String[] args){
        try{
            Threadsetdaemon threadsetdaemon = new Threadsetdaemon();
            //setDeamon守护线程
            threadsetdaemon.setDaemon(true);
            threadsetdaemon.start();
            threadsetdaemon.sleep(5000);
            System.out.println("我要离开thread对象也不在打印了， 也就是停止了");
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
