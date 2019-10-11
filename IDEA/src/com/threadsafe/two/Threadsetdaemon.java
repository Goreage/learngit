package com.threadsafe.two;

public class Threadsetdaemon extends Thread {

    private int i = 0;

    @Override
    public void run(){
        try{
            while(true){
                i++;
                System.out.println("i=" + (i));
                Thread.sleep(100);
            }
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
