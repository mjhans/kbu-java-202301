package com.kbu.java.ch09_EnumAndCollection.EnumShape.Factories;

import com.kbu.java.ch08_OOP.Shape.Point;
import com.kbu.java.ch08_OOP.Shape.Shape;
import com.kbu.java.ch08_OOP.Shape.impl.Rectangle;

public class RectangleFactory implements AbstractFactory{
    Point point1;
    Point point2;
    Point point3;
    Point point4;

    public RectangleFactory(Point p1, Point p2, Point p3, Point p4){
        this.point1 = p1;
        this.point2 = p2;
        this.point3 = p3;
        this.point4 = p4;
    }
    @Override
    public Shape createShape() {
        return new Rectangle(this.point4, this.point3, this.point2, this.point1);
    }
    
}
