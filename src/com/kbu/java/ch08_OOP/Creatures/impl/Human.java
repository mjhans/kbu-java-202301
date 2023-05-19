package com.kbu.java.ch08_OOP.Creatures.impl;

import com.kbu.java.ch08_OOP.Creatures.*;

public class Human extends AbstractMammal implements Swimmable, Talkable{
    public void sound(){
        System.out.println("AAAAAAAhhhh");
    }

    @Override
    public void swim() {
        System.out.println("i can swim");
    }

    @Override
    public void talk(AbstractAnimal all) {
        System.out.println( "talking with ");
        all.sound();
    }    
}
