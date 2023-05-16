package com.kbu.java.ch08_OOP.Polymorphism.App;

import com.kbu.java.ch08_OOP.UseAbstract.AbstractAnimal;
import com.kbu.java.ch08_OOP.UseAbstract.impl.*;

public class PolymorphismDemo {
    public static void main(String[] args){
        AbstractAnimal dog = new Dog("Dog");
        AbstractAnimal cat = new Cat("cat");

        dog.sound();
        dog.showCategoryName();
        cat.sound();
        cat.showCategoryName();
    }
}
