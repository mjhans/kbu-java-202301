package com.kbu.java.ch08_OOP.UseAbstract.impl;

import com.kbu.java.ch08_OOP.UseAbstract.AbstractAnimal;

public class Dog extends AbstractAnimal{
    public Dog(){
        super();
    }
    public Dog(String category){
        super(category);
    }
    public void showCategoryName(){
        super.showCategoryName();
        System.out.println("I'm wonderful " + this.category);
    }
    public void sound() {
        System.out.println("Woof!!");
    }
    public void sound(int n) {
        for (int i = 0 ; i < n ; i++){
            this.sound();
        }
    }
}
