package com.cazry.use.finall;

/**
 * @author Administrator
 * 当start结束时，main就相应的结束了。但实际这个程序中只要新线程里的run方法没有执行完
 * 匿名内部类的实例的生命周期就没有结束，将一直可以访问str局部变量的值，这就是内部类会扩大局部变量作用域的实例
 * 如果被内部类访问的局部变量没有使用final修饰，也就是说，该变量的值可以随意改变，那将引起极大地混乱，因此Java编译器
 * 要求被内部访问的局部变量必须使用final修饰符
 */
public class ClosureTest {
    public static void main(String[] args){
        //定义一个局部变量
        final String str = "Java";
        //在内部类里访问局部变量str
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <100 ; i++) {
                    //此处将一直可以访问到str局部变量
                    System.out.println(str + " " + i);
                    //暂停0.1秒
                    try
                    {
                        Thread.sleep(100);
                    }
                    catch (Exception ex)
                    {
                        ex.printStackTrace();
                    }
                }
            }
        }).start();
        //执行到此处，main方法结束
    }
}
