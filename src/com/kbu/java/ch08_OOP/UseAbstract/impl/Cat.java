package com.kbu.java.ch08_OOP.UseAbstract.impl;

import com.kbu.java.ch08_OOP.UseAbstract.AbstractAnimal;

public class Cat extends AbstractAnimal {
    public Cat(){
        super();
    }
    public Cat(String category){
        super(category);
    }
    public void sound() {
        System.out.println("Meow");
    }
    
}
