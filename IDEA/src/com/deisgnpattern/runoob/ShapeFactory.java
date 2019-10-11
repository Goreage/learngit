package com.deisgnpattern.runoob;

import interfacess.Shape;

public class ShapeFactory {

    //使用getShape方法获取形状类型的对象
    public Shape getShope(String shapeType){
        if(shapeType == null){
            return  null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}
