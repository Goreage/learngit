package com.deisgnpattern.runoob;

import interfacess.Shape;

public class Square implements Shape {

    @Override
    public void draw(){
        System.out.println("Inside Square::draw() method.");
    }
}
