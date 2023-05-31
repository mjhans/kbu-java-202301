package com.kbu.java.ch09_EnumAndCollection.Generic.App;

import com.kbu.java.ch08_OOP.Shape.Point;
import com.kbu.java.ch08_OOP.Shape.impl.DrawPane;
import com.kbu.java.ch09_EnumAndCollection.Generic.Printable;
import com.kbu.java.ch09_EnumAndCollection.Generic.Printer.GeneralPrinter;
import com.kbu.java.ch09_EnumAndCollection.Generic.impl.Line;

public class GenericShapeDemo {
    public static void main(String[] args){
        Line line1 = new Line(new Point(3, 4), new Point(5,5));
        
        DrawPane drawPane = new DrawPane();

        drawPane.addShape(line1);
        line1.setColor("blue");
        drawPane.draw();
        drawPane.paint();

        GeneralPrinter<Printable> gp = new GeneralPrinter<>();
        gp.setItem(line1);

        gp.print();

        line1.setColor("black");
        gp.print();

        // GeneralPrinter<String> gp1 = new GeneralPrinter<>();
        // gp1.setItem("String");
        // gp1.print();
        
        
    }
}
