package com.kbu.java.ch09_EnumAndCollection.EnumShape.Factories;

import com.kbu.java.ch08_OOP.Shape.Shape;

public class BaseFactory {
    public static Shape getShape(AbstractFactory af){
        return af.createShape();
    }
}
