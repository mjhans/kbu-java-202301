package com.kbu.java.ch08_OOP.Shape.App;

import com.kbu.java.ch08_OOP.Shape.*;
import com.kbu.java.ch08_OOP.Shape.impl.*;

enum ShapeType {
    LINE,
    RECTANGLE,
    TRIANGLE
}


public class DrawDemo {
    public static void main(String[] args){
        Line line1 = new Line(new Point(3,4), new Point(4, 5));
        Triangle triangle1 = new Triangle(new Point(3,4), new Point(4, 5), new Point(6, 7));
        Rectangle rectangle1 = new Rectangle(new Point(3,4), new Point(4, 5), new Point(6, 7), new Point(1,1));

        DrawPane dp1 = new DrawPane();
        dp1.addShape(line1, triangle1, rectangle1);
        dp1.draw();

        line1.setColor("black");
        triangle1.setColor("red");
        rectangle1.setColor("blue");

        dp1.paint();
        rectangle1.setColor("black");
        dp1.paint();
    }
}
