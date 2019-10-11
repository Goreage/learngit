package com.deisgnpattern.runoob;

import interfacess.Color;

public class Blue implements Color {

    @Override
    public void fill(){
        System.out.println("Inside Blue::fill() method.");
    }
}
