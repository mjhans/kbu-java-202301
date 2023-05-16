package com.kbu.java.ch08_OOP.Polymorphism.App;

import com.kbu.java.ch08_OOP.UseAbstract.AbstractAnimal;
import com.kbu.java.ch08_OOP.UseAbstract.impl.*;

public class PolymorphismArrayDemo {
    public static void main(String[] args){
        AbstractAnimal[] animals = new AbstractAnimal[5];

        animals[0] = new Dog("Dog");
        animals[1] = new Cat("Cat");
        animals[2] = new Dog("Dog");
        animals[3] = new Cat("Cat");
        animals[4] = new Cat("Cat");

        for (AbstractAnimal animal : animals){
            animal.showCategoryName();
        }

    }
}
