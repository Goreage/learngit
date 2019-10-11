package com.deisgnpattern.runoob;

import interfacess.Color;
import interfacess.Shape;

//使用FactoryProducter来领取AbstractFactory,通过传递参数来获取实体类的对象
public class AbstractFactoryPatternDemo {
    public static void main(String[] args){

        //获取形状工厂
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

        //获取形状为Circle的对象
        Shape shape1 = shapeFactory.getShape("CIRCLE");

        //调用Circle的draw方法
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("RECTANGLE");

        shape2.draw();

        //获取形状为Square的对象
        Shape shape3 = shapeFactory.getShape("SQUARE");
        shape3.draw();

        //获取颜色工厂
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

        Color color1 = colorFactory.getColor("RED");
        color1.fill();

        Color color2 = colorFactory.getColor("Green");
        color2.fill();

        Color color3 = colorFactory.getColor("BLUE");
        color3.fill();
    }
}
