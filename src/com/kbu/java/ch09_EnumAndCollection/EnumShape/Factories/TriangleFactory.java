package com.kbu.java.ch09_EnumAndCollection.EnumShape.Factories;

import com.kbu.java.ch08_OOP.Shape.Point;
import com.kbu.java.ch08_OOP.Shape.Shape;
import com.kbu.java.ch08_OOP.Shape.impl.Triangle;

public class TriangleFactory implements AbstractFactory{
    Point point1;
    Point point2;
    Point point3;

    public TriangleFactory(Point p1, Point p2, Point p3){
        this.point1 = p1;
        this.point2 = p2;
        this.point3 = p3;
    }

    @Override
    public Shape createShape() {
        return new Triangle(this.point1, this.point2, this.point3);
    }
}
