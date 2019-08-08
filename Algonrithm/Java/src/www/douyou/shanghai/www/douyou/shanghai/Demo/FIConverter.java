package www.douyou.shanghai.www.douyou.shanghai.Demo;

@FunctionalInterface
public interface FIConverter<F, T> {
    T convert(F from);
    /**
     * @author Goerage
     * Java8投入大量精力来思考如何使现有的函数更加友好的支持Lambda表达式，最终引入函数式接口
     * 的概念。函数式接口本质是一个仅有一个抽象方法的普通接口。函数式接口能够被隐式地转换为Lambda表达式。例如
     * ActionListener监听器接口只有一个方法，就可以使用Lambda表达式进行简化。
     *  函数式接口在实际使用过程中很容易出错，例如某个人在接口定义中又增加了另一个方法，则该接口不再是函数式接口
     *此时将该接口装换为Lambda表达式会失败。为了克服函数式接口的脆弱性，并且能够明确声明接口是作为函数式接口的意图，
     * Java8增加了一个注解@FunctionInterface来定义函数式接口，其语法格式如下：
     * @FunctionInterface
     * public interface 接口名{
     *     //只有一个抽象方法
     * }
     * @FunctionInterface：使用该注解修饰的接口必须是函数式接口，该接口中只能声明一个抽象方法，如果声明多个抽方法
     * 则会报错。但是默认方法和静态方法不属于抽象方法，因此在函数式接口中也可以定义默认方法和静态方法。
     */
}

