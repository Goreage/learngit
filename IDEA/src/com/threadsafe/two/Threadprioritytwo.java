package com.threadsafe.two;

public class Threadprioritytwo extends Thread {

    @Override
    public void run(){
        System.out.println("Threadprioritytwo run priority=" +
                this.getPriority());
    }
}
