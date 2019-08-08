package com.fieldtest.JuRen;

class Base
{
    int count = 2;
    public void display()
    {
        System.out.println(this.count);
    }
}
class Derived extends Base
{
    int count = 20;
    @Override
    public void display()
    {
        System.out.println(this.count);
    }
}
/**
 * @author Administrator
 */
public class FieldAndMethodTest {
    public static void main(String[] args){
        //声明并创建一个Base对象
        Base b = new Base();
        //直接访问count实例变量和通过display访问count实例变量
        System.out.println(b.count);
        b.display();
        //声明并创建一个Derived对象
        Derived d = new Derived();
        //直接访问count实例变量和通过display访问count实例变量
        System.out.println(d.count);
        d.display();
        //声明一个Base变量，并将Derived对象赋给该变量
        Base bd = new Derived();
        //直接访问count实例变量和通过display访问count实例变量
        System.out.println(((Derived) bd).count);
        bd.display();
        //让d2b变量指向原b变量所指向的Dervied对象
        Base d2b = d;
        //访问d2b所指对象的count实例变量
        System.out.println(d2b.count);
    }
}
