package com.kbu.java.ch08_OOP.Shape.impl;

import com.kbu.java.ch08_OOP.Shape.Point;

public class Rectangle extends Triangle{

    public Point point4;

    public Rectangle(Point point1, Point point2, Point point3, Point point4) {
        super(point1, point2, point3);
        this.point4 = point4;
    }   
    
    @Override
    public void draw(){
        System.out.printf("(%s) draw with points (%s, %s) (%s, %s) (%s, %s), (%s, %s) \n", 
        this.getClass().getName(), this.point1.getX(), 
        this.point1.getY(), this.point2.getX(), this.point2.getY(), 
        this.point3.getX(), this.point3.getY(), this.point4.getX(), this.point4.getY());
    }
}
