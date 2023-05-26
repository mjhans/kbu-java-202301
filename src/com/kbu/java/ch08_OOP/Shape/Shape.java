package com.kbu.java.ch08_OOP.Shape;

public abstract class Shape implements Paintable {
    protected String color;
    public abstract void draw();
    public void setColor(String color){
        this.color = color;
    }
    @Override
    public void paint() {
        if (this.color.isEmpty() || this.color.equals("")){
            System.out.printf("painted [%s] no color \n", this.getClass().getName());
        } else {
            System.out.printf("painted [%s] %s \n", this.getClass().getName(), this.color);
        }
    }
}
