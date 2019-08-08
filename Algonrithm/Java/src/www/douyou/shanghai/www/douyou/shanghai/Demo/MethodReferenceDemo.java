package www.douyou.shanghai.www.douyou.shanghai.Demo;

/**
 * ::方法的引用 在Java8中可以使用双冒号操作符::来简化Lambda表达式。::表示方法引用，其语法格式如下：
 * 容器 :: 方法名
 * :: 方法引用包含三部分组成:
 * 左边是容器，可以是类名或实例名;
 * 中间是 :: 操作符;
 * 右边是相应的方法名，注意方法名后没有小括号。
 * :: 方法引用可以用于静态方法，实例方法以及构造方法中，引用不同方法时书写格式也不同
 * 如果是静态方法，则是：
 *  类名 :: 静态方法名
 *  如果是实例方法，则是:
 *  对象 :: 实例方法名
 *  如果是构造方法， 则是：
 *  类名 :: new
 *      for example
 *      ::静态方法引用
 *      //String.valueOf()静态方法
 *      String::valueOf
 *      //Math.max()静态方法
 *      Math::max
 * 上面两行代码使用::进行方法引用，等价于下面两条Lambda表达式
 * (x) -> String.valueOf(x)
 * (a,b) -> Math.max(a,b)
 *      8.3节定义FIConverter函数式接口基础上，分别使用Lambda表达式和 :: 方法引用的方式实现不同数据之间的
 *      转换。
 */
public class MethodReferenceDemo {
    public static void main(String[] args){
        //Lambda表达式方式实现函数式接口的抽象方法
        FIConverter<String, Integer> converter1 = (from) -> Integer.valueOf(from);
        Integer a = converter1.convert("123");
        System.out.println(a);
        //::方法引用的方式
        FIConverter<String, Integer> converter2 = Integer::valueOf;
        Integer b = converter2.convert("456");
        System.out.println(b);
        System.out.println(a + b);
    }
}
