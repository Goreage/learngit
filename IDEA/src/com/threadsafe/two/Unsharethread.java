package com.threadsafe.two;

public class Unsharethread extends Thread{

    private int count = 5;

    public Unsharethread(String name){
        super();
        this.setName(name);
    }
    @Override
    public void run(){
        super.run();
        while(count > 0){
            count--;
            System.out.println("由" + Unsharethread.currentThread().getName() +
                    "计算，count=" + count);
        }
    }
}
