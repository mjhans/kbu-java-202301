package com.kbu.java.ch09_EnumAndCollection.Generic.impl;

import com.kbu.java.ch08_OOP.Shape.Point;
import com.kbu.java.ch09_EnumAndCollection.Generic.Printable;


public class Line extends com.kbu.java.ch08_OOP.Shape.impl.Line implements Printable {

    public Line(Point point1, Point point2) {
        super(point1, point2);
    }

    @Override
    public void print() {
        System.out.printf("printing... [%s] %s \n", 
        this.getClass().getName(), this.color);
    }

  
}
