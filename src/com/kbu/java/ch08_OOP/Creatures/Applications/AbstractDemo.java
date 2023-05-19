package com.kbu.java.ch08_OOP.Creatures.Applications;

import com.kbu.java.ch08_OOP.Creatures.impl.*;;

public class AbstractDemo {
    public static void main(String[] args){
        Human human = new Human();
        Bat bat = new Bat();
        Eagle eagle = new Eagle();
        Penguin penguin = new Penguin();

        human.sound();
        human.swim();
        bat.sound();
        bat.fly();
        eagle.sound();
        eagle.fly();
        penguin.sound();
        penguin.swim();

        human.talk(penguin);
        human.talk(eagle);
        human.talk(bat);
        human.talk(human);

    }
}
