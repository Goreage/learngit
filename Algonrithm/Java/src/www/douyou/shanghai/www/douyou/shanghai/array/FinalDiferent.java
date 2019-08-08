package www.douyou.shanghai.www.douyou.shanghai.array;

public class FinalDiferent {
    public static void main(String[] args) {
        /**
         * final, finally, 和 finalize 三者之间有什么不同
         */
    }
        /**
         * final 可以修饰属性，只能被赋值一次，如Stirng
         *        可以修饰方法，并且方法不能够被重写
         *        可以修饰方法，方法不能被继承
         */

        final String username = "jobs";

        public final void play(){
        }

        final class Dog{
        }

    /**
     * finally是用来修饰异常代码块，
     * 不管有无异常，最终都会被执行
     */
    public void move(){
        try{
        }catch(Exception e){
        }finally{
            //不管有无异常，最终都会被执行
        }
    }
    /**
     * finalize是Object中的方法，当我们重写这个方法是
     * 当我们创建的对象被GC回收时，他就会被调用
     */

    @Override
    public void finalize() throws Throwable{
    }
}
