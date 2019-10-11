package com.deisgnpattern.runoob;

public class FactoryProducer {
    //创建一个工厂创造器/生成器类，通过传递形状或颜色信息来获取工厂
    public static AbstractFactory getFactory(String chioce){
        if(chioce.equalsIgnoreCase("SHAPE")){
            return new ShapeAbstractFactory();
        }else if(chioce.equalsIgnoreCase("COLOR")){
            return new ColorAbstractFactory();
        }
        return null;
    }
}
