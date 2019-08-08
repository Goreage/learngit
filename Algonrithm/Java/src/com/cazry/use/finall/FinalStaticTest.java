package com.cazry.use.finall;

public class FinalStaticTest {
    //定义两个final类变量
    final static String str1;
    final static String str2 = "Java";
    //str1放在静态初始块中初始化
    static{
        str1 = "Java";
    }
    public static void main(String[] args){
        System.out.println(str1 + str1 == "JavaJava");
        System.out.println(str2 + str2 == "JavaJava");
    }
}
