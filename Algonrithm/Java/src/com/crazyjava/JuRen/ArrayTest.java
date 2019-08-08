package com.crazyjava.JuRen;

public class ArrayTest {
    public static void main(String[] args){
        //采用静态初始化方式初始化第一个数组
        String[] books = new String[]
                {
                        "疯狂Java讲义",
                        "轻量级Java EE企业应用实战",
                        "疯狂Ajax讲义",
                        "疯狂XML讲义"
                };
        //采用静态初始化的简化形式初始化第二个数组
        String[] names = {
                "孙悟空",
                "猪八戒",
                "白骨精"
        };
        //采用动态初始化的语法初始化第三个数组
        String[] strArr = new String[5];
        //访问三个数组的长度
        System.out.println("第一个数组的长度：" + books.length);
        System.out.println("第一个数组的长度：" + names.length);
        System.out.println("第一个数组的长度：" + strArr.length);
    }
}