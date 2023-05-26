package com.kbu.java.ch08_OOP.Shape.impl;

import com.kbu.java.ch08_OOP.Shape.Paintable;
import com.kbu.java.ch08_OOP.Shape.Shape;

public class DrawPane {
    Shape[] shapeList = null;
    public void addShape(Shape ... s) {
        this.shapeList = s;
    }
    public void draw(){
        for(Shape shape : this.shapeList){
            shape.draw();
        }
    }

    public void paint(){
        for(Paintable p : this.shapeList){
            p.paint();
        }
    }
}
