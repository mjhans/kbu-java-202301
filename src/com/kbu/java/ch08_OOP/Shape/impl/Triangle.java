package com.kbu.java.ch08_OOP.Shape.impl;

import com.kbu.java.ch08_OOP.Shape.*;

public class Triangle extends Line {
    protected Point point3;

    public Triangle(Point point1, Point point2, Point point3){
        super(point1, point2);
        this.point3 = point3;
    }
    @Override
    public void draw() {
        System.out.printf("(%s) draw with points (%s, %s) (%s, %s) (%s, %s)\n", 
        this.getClass().getName(), this.point1.getX(),this.point1.getY(), 
        this.point2.getX(), this.point2.getY(), this.point3.getX(), this.point3.getY());
    }
    
}
