package com.threadsafe.two;

public class Threadpriorityone extends Thread {

    @Override
    public void run(){
        System.out.println("Threadpriorityone run priority=" +
                this.getPriority());
        Threadprioritytwo threadprioritytwo = new Threadprioritytwo();
        threadprioritytwo.start();
    }
}
