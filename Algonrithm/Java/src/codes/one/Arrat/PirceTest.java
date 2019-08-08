package codes.one.Arrat;
class Price
{
    //类变量Price实例
    final static Price INSTANCE = new Price(2.8);
    //定义一个类变量
    static double initPrice = 20;
    //定义该Price的currentPrice实例变量
    double currentPirce;
    public Price(double discount)
    {
        //根据静态变量计算实例变量
        currentPirce = initPrice - discount;
    }
}
public class PirceTest {
    public static void main(String[] args){
        //通过Price的INSTANCE访问currentPrice实例变量
        System.out.println(Price.INSTANCE.currentPirce);
        //显示创建Price实例
        Price p = new Price(2.8);
        //通过显示创建的Price实例访问currentPrice实例变量
        System.out.println(p.currentPirce);
    }
}
