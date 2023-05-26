package com.kbu.java.ch08_OOP.Shape.impl;

import com.kbu.java.ch08_OOP.Shape.*;

public class Line extends Shape{
    protected Point point1;
    protected Point point2;
    
    public Line(Point point1, Point point2){
        this.point1 = point1;
        this.point2 = point2;
    }

    @Override
    public void draw() {
        System.out.printf("(%s) draw with points (%s, %s) (%s, %s) \n", 
        this.getClass().getName(), point1.getX(), point1.getY(), 
        point2.getX(), point2.getY());
    }

    
}
