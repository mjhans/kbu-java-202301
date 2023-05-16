package com.kbu.java.ch08_OOP.UseAbstract.App;

import com.kbu.java.ch08_OOP.UseAbstract.impl.Cat;
import com.kbu.java.ch08_OOP.UseAbstract.impl.Dog;

public class animalDemo {
    public static void main(String[] args){
        Dog dog = new Dog("Dog");
        dog.sound();
        dog.sound(5);
        dog.showCategoryName();
        
        Cat cat = new Cat("Cat");
        cat.sound();
        cat.showCategoryName();
    }
}
