package com.deisgnpattern.runoob;

import interfacess.Shape;

public class FactoryPatternDemo {
    public static void main(String[] args){
        ShapeFactory shapeFactory = new ShapeFactory();

        //获取Circle的对象，并调用它的draw方法
        Shape shape1 = shapeFactory.getShope("CIRCLE");

        //调用Circle的draw方法

        shape1.draw();

        //获取Rectangle的对象，并调用它的draw方法
        Shape shape2 = shapeFactory.getShope("RECTANGLE");

        //调用Rectangle的draw方法
        shape2.draw();

        //获取Square的对象，并调用它的draw方法
        Shape shape3 = shapeFactory.getShope("SQUARE");

        //调用Square的draw方法
        shape3.draw();
    }
}
