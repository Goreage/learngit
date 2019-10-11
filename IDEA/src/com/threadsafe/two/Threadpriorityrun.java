package com.threadsafe.two;

public class Threadpriorityrun {
    public static void main(String[] args){
        System.out.println("main thread begin priority=" +
                Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(6);
        System.out.println("main thread end prioirty=" +
                Thread.currentThread().getPriority());
        Threadpriorityone threadpriorityone = new Threadpriorityone();
        threadpriorityone.start();
    }
}
