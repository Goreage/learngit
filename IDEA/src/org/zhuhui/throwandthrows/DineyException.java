package org.zhuhui.throwandthrows;

/**
 * throw是语句抛出一个异常，一般是在代码块的内部，
 * 当程序出现某种逻辑错误时由程序员主动抛出某种特定类型的异常
 */
public class DineyException {
    public static void main(String[] args){
        String s = "abc";
        if(s.equals("abc")){
            throw new NumberFormatException();
        }else{
            System.out.println(s);
        }
    }
}
