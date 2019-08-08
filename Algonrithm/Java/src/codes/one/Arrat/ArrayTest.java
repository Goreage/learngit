package codes.one.Arrat;

class Cat
{
    double weight;
    int age;
    public Cat(double weight, int age)
    {
        this.weight = weight;
        this.age = age;
    }
}
public class ArrayTest {
    public static void main(String[] args){
        //定义并动态初始化一个int[]数组
        int[] pos = new int[5];
        //采用循环为每个数组元素赋值
        for (int i = 0; i < pos.length; i++) {
            pos[i] = (i + 1) * 2;
        }
        //对于pos数组的元素来说，用起来完全等同于普通变量
        //下面即可将数组元素的值赋给int变量
        //也可将int变量的值赋给数组元素
        int a = pos[1];
        int b = 20;
        pos[2] = b;
        //定义并动态初始化一个Cat[]数组
        Cat[] cats = new Cat[2];
        cats[0] = new Cat(3.34,2);
        //将cats数组的第1个元素的值赋给数组元素c1
        Cat c1 = cats[0];
        Cat c2 = new Cat(4.3,3);
        //将c2的值赋给cats数组的第二个元素
        cats[1] = c2;
    }
}
