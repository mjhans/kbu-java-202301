package com.kbu.java.ch09_EnumAndCollection.Generic.App;

class Box<T> {
    private T t;
    public void set(T t) { this.t = t; }
    public T get() { return t; }
}

public class GenericSample {
    public static void main(String[] args) {
        Box<String> box = new Box<>();
        box.set("Test box");
        System.out.println(box.get());

        //Box<int> box2 = new Box<>();
        Box<Integer> box3 = new Box<>();
        box3.set(3);
        System.out.println(box3.get());
    }
}


