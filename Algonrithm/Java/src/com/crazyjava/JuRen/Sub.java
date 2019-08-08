package com.crazyjava.JuRen;
class Base
{
    int count = 2;
}
class Mid extends Base
{
    int count = 20;
}
/**
 * @author Administrator
 */
public class Sub extends Mid{
    int count = 200;
    public static void main(String[] args){
        //创建一个Sub对象
        Sub s = new Sub();
        //将Sub对象向上转型后赋为Mid,Base类型的变量
        Mid s2m = s;
        Base s2b = s;
        //分别通过三个变量来访问count实例变量
        System.out.println(s.count);
        System.out.println(s2m.count);
        System.out.println(s2b.count);
    }
}
