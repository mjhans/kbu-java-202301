package com.kbu.java.ch09_EnumAndCollection.EnumShape.App;

import com.kbu.java.ch08_OOP.Shape.*;
import com.kbu.java.ch08_OOP.Shape.impl.*;
import com.kbu.java.ch09_EnumAndCollection.EnumShape.Constants.ShapeType;
import com.kbu.java.ch09_EnumAndCollection.EnumShape.Factories.BaseFactory;
import com.kbu.java.ch09_EnumAndCollection.EnumShape.Factories.LineFactory;
import com.kbu.java.ch09_EnumAndCollection.EnumShape.Factories.RectangleFactory;
import com.kbu.java.ch09_EnumAndCollection.EnumShape.Factories.TriangleFactory;

public class EnumShapeDemo {

    public static Shape createShape(ShapeType type, Point ... points){
        Shape shape = switch(type){
            case LINE -> new Line(points[0], points[1]);
            case RECTANGLE -> new Rectangle(points[0], points[1], points[2], points[3]);
            case TRIANGLE -> new Triangle(points[0], points[1], points[2]);
            //case LINE -> new Line(points[0], points[1]);
            default -> new Line(points[0], points[1]);            
        };
        return shape;
    }
    public static void main(String[] args){

        //Shape line1 = createShape(ShapeType.LINE, new Point(3,4), new Point(4, 5));
        Shape line1 = BaseFactory.getShape(new LineFactory(new Point(3,4), new Point(4, 5)));
        Shape triangle1 = BaseFactory.getShape(new TriangleFactory(new Point(3,4), new Point(4, 5), new Point(6, 7)));
        //Shape triangle1 = createShape(ShapeType.TRIANGLE, new Point(3,4), new Point(4, 5), new Point(6, 7));
        Shape rectangle1 = BaseFactory.getShape(new RectangleFactory(new Point(3,4), new Point(4, 5), new Point(6, 7), new Point(1,1)));
        //Shape rectangle1 = createShape(ShapeType.RECTANGLE, new Point(3,4), new Point(4, 5), new Point(6, 7), new Point(1,1));
        
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
