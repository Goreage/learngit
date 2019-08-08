package com.cazry.use.finall;

public class StringJionTest {
    public static void main(String[] args){
        String s1 = "疯狂Java";
        String s2 = "疯狂" + "Java";
        System.out.println(s1 == s2);
        //定义在两个字符串直接量
        String str1 = "疯狂";
        String str2 = "Java";
        //将str1和str2直接连接运算
        String s3 = str1 + str2;
        System.out.println(s1 == s3);
    }
}
