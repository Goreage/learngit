package www.douyou.shanghai;

/**
 * 创建一个类，它的执行顺序是：
 * 静态代码块
 * 普通代码块
 * Fork() 构造器
 */
public class Fork {
    public Fork(){
        System.out.println("Fork() 构造器");
    }
    {
        System.out.println("普通代码块");
    }
    static {
        System.out.println("静态代码块");
    }

    public static void main(String[] args){
        //创建一个对象 方法执行的顺序
        new Fork();
    }
}
