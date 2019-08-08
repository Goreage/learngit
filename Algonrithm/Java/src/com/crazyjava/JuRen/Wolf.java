package com.crazyjava.JuRen;
class Animal
{
    public String getDesc()
    {
        return "Animal";
    }

    /**
     * @return
     */
    @Override
    public String toString()
    {
        return getDesc();
    }
}
public class Wolf extends Animal{
    //定义name，weight两个实例变量
    private String name;
    private double weight;
    public Wolf(String name,double weight)
    {
        //为name, weight两个实例变量赋值
        this.name = name;
        this.weight = weight;
    }
    //重写getDesc方法
    @Override
    public String getDesc()
    {
        return "Wolf[name=" + name + ",weight=" + weight + "]";
    }
    public static void main(String[] args){
        System.out.println(new Wolf("灰太狼", 32.3));
    }
}
