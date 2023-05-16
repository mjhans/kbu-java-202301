package com.kbu.java.ch08_OOP.ClassDemo;

public class Rectangle {
    private int length;
    private int breadth;
    // 기본 생성자
    public Rectangle() {
        length = 0;
        breadth = 0;
    }
    // 매개변수가 하나인 생성자
    public Rectangle(int side) {
        length = side;
        breadth = side;
    }
    // 매개변수가 두 개인 생성자
    public Rectangle(long length, long breadth) {
        System.out.println("long datatype");
        this.length = (int)length;
        this.breadth = (int)breadth;
    }
    // 매개변수가 두 개인 생성자
    public Rectangle(int length, int breadth) {
        System.out.println("int datatype");
        this.length = length;
        this.breadth = breadth;
    }
    public void displayDimensions() {
        System.out.println("Length: " + length + ", Breadth: " + breadth);
    }
    public static void main(String[] args){
    Rectangle rectangle1 = new Rectangle();
    Rectangle rectangle2 = new Rectangle(10);
    Rectangle rectangle3 = new Rectangle(10, 20);
    Rectangle rectangle4 = new Rectangle(10l, 20l); // long 값을 넘긴다. 
    rectangle1.displayDimensions(); // 출력: Length: 0, Breadth: 0
    rectangle2.displayDimensions(); // 출력: Length: 10, Breadth: 10
    rectangle3.displayDimensions(); // 출력: Length: 10, Breadth: 20
    rectangle4.displayDimensions(); // 출력: Length: 10, Breadth: 20
    }
}
