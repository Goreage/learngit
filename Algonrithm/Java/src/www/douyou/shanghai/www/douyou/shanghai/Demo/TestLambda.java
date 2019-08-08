package www.douyou.shanghai.www.douyou.shanghai.Demo;

public class TestLambda {
    public static void main(String[] args){

        //Lambda表达式的用法

        //方式一
        /**
         * 创建一个线程匿名类，并且将它传入Runnable
         */
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("hello world");
            }
        }).start();

        //方式二
        new Thread(() -> System.out.println("hello world from Lambda")).start();

        new Thread(() -> {
            if(1 == 2){
                System.out.println("1 == 2");
            }else{
                System.out.println("1 != 2");
            }
        }).start();
    }
}
