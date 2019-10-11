package com.threadsafe.two;

public class Threadinterruptrun {
    public static void main(String[] args){

        try{
            Threadinterrupt threadinterrupt = new Threadinterrupt();
            threadinterrupt.start();
                threadinterrupt.sleep(2000);
            threadinterrupt.interrupt();
        }catch(InterruptedException e){
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end");
    }
}
