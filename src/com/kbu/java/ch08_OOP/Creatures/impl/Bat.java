package com.kbu.java.ch08_OOP.Creatures.impl;

import com.kbu.java.ch08_OOP.Creatures.*;

public class Bat extends AbstractMammal implements Flyable{
    public void sound() {
        System.out.println("BBiBBi!!");
    }

    @Override
    public void fly() {
        System.out.println("i can fly");
    }
}
