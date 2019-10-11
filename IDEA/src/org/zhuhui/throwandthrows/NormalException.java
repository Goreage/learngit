package org.zhuhui.throwandthrows;


/**
 * 抛出异常有三种形式
 *
 * throw
 * throws
 * 系统自动抛异常
 *
 * 一、系统自动抛异常
 *
 * 当程序语句出现一些逻辑错误、主义错误或类型转换错误时，系统会自动抛出异常：（举个栗子）
 * 属于  java.lang.ArithmeticException
 */
public class NormalException {
    public static void main(String[] args){
        int a = 5;
        int b = 0;
        System.out.println(5 / b);
    }
}
