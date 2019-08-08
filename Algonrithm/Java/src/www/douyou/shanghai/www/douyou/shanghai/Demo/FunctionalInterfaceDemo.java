package www.douyou.shanghai.www.douyou.shanghai.Demo;

/**
 * @Dome class
 * @author Goerage
 * Lambda表达式只能为函数式接口创建对象，即Lambda表达式只能实现具有一个抽象方法的接口，且该接口必须是
 * 由@FunctionalInterface注解修饰的函数式接口
 */
public class FunctionalInterfaceDemo {
    public static void main(String[] args){
        //传统方法实现函数式接口中的抽象方法
        FIConverter<String, Integer> converter1 = new FIConverter<String, Integer>(){
            @Override
            public Integer convert(String from){
                return Integer.valueOf(from);
            }
        };
        //调用convert()方法，将字符串转换成整数
        Integer a = converter1.convert("88");
        System.out.println(a);
        //Lambda表达式方式实现函数式接口中的抽象方法
        FIConverter<String, Integer> converter2 = (from) -> Integer.valueOf(from);
        Integer b = converter2.convert("123");
        System.out.println(b);
        System.out.println(a + b);
    }
}
