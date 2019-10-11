package com.deisgnpattern.runoob;

import interfacess.Color;
import interfacess.Shape;

public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);
}
