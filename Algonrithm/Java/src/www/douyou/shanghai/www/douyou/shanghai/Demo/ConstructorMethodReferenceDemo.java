package www.douyou.shanghai.www.douyou.shanghai.Demo;

/**
 * @author  Goerage
 * @opinion 下述代码对构造方法进行 :: 方法引用
 */

/**
 * 产品类Product
 */
    class Product{
    /**
     * 定义名称，产量
     */
    String name;
    int quantity;
    Product(){
    }
    Product(String name, int quantity){
        this.name = name;
        this.quantity = quantity;
    }
    @Override
    public String toString(){
        return "产品:" + this.name + "   产量:" + this.quantity;
    }
}

/**
 * 子产品类ChildP继承Product
 */
class ChilpdP extends Product{
    ChilpdP(){
    }
    ChilpdP(String name, int quantity){
        super(name, quantity);
    }
    @Override
    public String toString(){
        return "子产品:" + this.name + "  产量:" + this.quantity;
    }
}

/**
 * 产品工厂(函数式接口)
 */
@FunctionalInterface
interface ProductFactory<P extends Product>{
    P create(String name, int quantity);
}
public class ConstructorMethodReferenceDemo {
    public static void main(String[] args){
        ProductFactory<Product> productFactory = Product::new;
        Product p1 = productFactory.create("打印机",100);
        System.out.println(p1);
        ProductFactory<ChilpdP> chilpdPFactory = ChilpdP::new;
        ChilpdP p2 = chilpdPFactory.create("复印机",100);
        System.out.println(p2);
    }
}
