package com.threadsafe.two;

public class Returnthreadstoprun {

    public static void main(String[] args) throws InterruptedException{
        Returnthreadstop t = new Returnthreadstop();
        t.start();
        Thread.sleep(2000);
        t.interrupt();
    }
}
