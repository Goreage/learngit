package com.qingfeng.Lambda.closure;

import java.util.function.Supplier;

//闭包问题
public class ClosureDemo {
    public static void main(String[] args){
        int n = getNumber().get();
        //当getNumber方法结束时它内部的成员变量num的作用域也消失了
        System.out.println(n);
    }

    private static Supplier<Integer> getNumber(){
        int num = 10;

        //使用闭包可以延长内部变量的时间，已达到变量的使用
        return () ->{
            return num;
        };
    }
}
