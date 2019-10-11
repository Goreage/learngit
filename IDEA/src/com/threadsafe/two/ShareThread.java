package com.threadsafe.two;

public class ShareThread extends Thread{

    private int count = 5;
    synchronized
    @Override
    public void run(){
        super.run();
        count--;
        System.out.println("由" + ShareThread.currentThread().getName() + "计算，count=" + count);
    }
}
