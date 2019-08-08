package www.douyou.shanghai.www.douyou.shanghai.Demo;

import java.util.Arrays;
import java.util.List;

public class LambdaDesc {
    /**
     * @Auth Goerage
     * Lambda表达式是基于数学中的λ演算而得名，直接对应于其中的Lambda抽象，Lambda表达式是Java8中的重要的新特性，
     * 支持将代码作为方法参数，允许使用更加简洁的代码来创建只有一个抽象方法的接口实例
     * 普通方法的定义
     * 返回类型 方法体(参数列表){
     *     方法体
     * }
     * Lambda表达式实际上是一个匿名方法，即没有方法名。Lambda表达式中包括表达式和语句，通常由参数列表，箭头和方法
     * 体三部分组成，
     *  Lambda 表达式(匿名方法)
     *  (参数方法) -> {方法体}
     *  For example
     *      (int x, int y) -> {
     *          System.out.println(x);
     *         System.out.println(y);
     *         return x + y;
     *      }
     *      也可省略参数类型
     *      (x, y){
     *        System.out.println(x);
     *        System.out.println(y);
     *        return x + y;
     *      }
     * 省略{}和return关键字的Lambda表达式
     * (x, y) -> x + y
     *  如果参数列表只包含一个推断类型参数时， 还可以省略小括号()，即Lambda表达式可以简化如下格式
     *      只有一个参数的Lambda表达式
     *      参数名 -> {方法体}
     *      省略()的Lambda表达式
     *      x -> {
     *          System.out.println(x);
     *         return ++x;
     *      }
     *  如果参数列表只包含一个推断类型参数，且方法体只包括一条语句，则Lambda表达式可以简化如下格式：
     *     语法：只有一个参数和一条语句的Lambda表达式
     *     参数名 -> 表达式
     *     for example 省略() , {}和return关键字的Lambda表达式
     *     x -> ++x
     *     参数列表可以没有参数，此时Lambda表达式的格式如下
     *     语法 没有参数的Lambda表达式
     *     () -> {方法体}
     *     没有参数的Lambda表达式
     *     //没有参数， 返回值为5
     *     () -> 5
     *     //没有参数，只打印信息
     *     () -> System.out.println("QST欢迎您！");
     */
    public static void main(String[] args){
        String[] names = {"QST青软实训", "锐嫔学院", "感知教育", "人力资源服务", "欢迎您"};
        List<String> arrNames = Arrays.asList(names);
        //传统的循环方式
        System.out.println("传统的循环方式输出：");
        for (String name : arrNames){
            System.out.println(name);
        }
        System.out.println("---------------------------------------");
        //在Java8中使用Lambda表达式输出
        System.out.println("使用Lambda表达式输出：");
        arrNames.forEach((name) -> System.out.println(name));
        System.out.println("---------------------------------------");
        //在Java8中使用双冒号操作符::
        System.out.println("使用双冒号表达式输出：");
        arrNames.forEach(System.out::println);
    }
}
