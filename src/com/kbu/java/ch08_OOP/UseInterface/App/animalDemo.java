package com.kbu.java.ch08_OOP.UseInterface.App;

import com.kbu.java.ch08_OOP.UseInterface.impl.*;

public class animalDemo {
    public static void main(String[] args){
        Dog dog = new Dog();
        dog.sound();
        
        Cat cat = new Cat();
        cat.sound();
    }
}
