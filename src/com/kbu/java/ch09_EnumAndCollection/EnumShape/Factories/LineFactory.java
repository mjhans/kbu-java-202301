package com.kbu.java.ch09_EnumAndCollection.EnumShape.Factories;

import com.kbu.java.ch08_OOP.Shape.Point;
import com.kbu.java.ch08_OOP.Shape.Shape;
import com.kbu.java.ch08_OOP.Shape.impl.Line;

public class LineFactory implements AbstractFactory {
    Point point1;
    Point point2;

    public LineFactory(Point p1, Point p2){
        this.point1 = p1;
        this.point2 = p2;
    }
    @Override
    public Shape createShape() {
        return new Line(this.point1, this.point2);
    }
    
}
