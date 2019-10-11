package com.threadsafe.two;

public class Sharethreadrun {
    public static void main(String[] args){

        ShareThread shareThread = new ShareThread();
        //下列线程是通过shareThread对象创建的
        Thread a = new Thread(shareThread,"A");
        Thread b = new Thread(shareThread,"B");
        Thread c = new Thread(shareThread,"C");
        Thread d = new Thread(shareThread,"D");
        Thread e = new Thread(shareThread,"E");
        a.start();
        b.start();
        c.start();
        d.start();
        e.start();
    }
}
