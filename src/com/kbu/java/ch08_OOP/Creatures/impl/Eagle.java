package com.kbu.java.ch08_OOP.Creatures.impl;

import com.kbu.java.ch08_OOP.Creatures.*;

public class Eagle extends AbstarctBird implements Flyable{

    @Override
    public void sound() {
        System.out.println("kkiii!!");
    }

    @Override
    public void fly() {
        System.out.println("i can fly");
    }
}
