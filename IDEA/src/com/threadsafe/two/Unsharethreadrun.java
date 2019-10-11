package com.threadsafe.two;

public class Unsharethreadrun {
   public static void main(String[] args){
       Unsharethread a = new Unsharethread("A");
       Unsharethread b = new Unsharethread("B");
       Unsharethread c = new Unsharethread("C");
       a.start();
       b.start();
       c.start();
   }
}
