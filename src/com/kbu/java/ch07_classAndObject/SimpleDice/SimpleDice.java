package com.kbu.java.ch07_classAndObject.SimpleDice;

import java.util.Random;

public class SimpleDice{

    private int faceValue = 0;
    private int MAXVALUE = 6;
    private int MINVALUE = 1;
    private Random rnd = new Random(10);

    public int roll(){
        faceValue = (rnd.nextInt(50) % MAXVALUE) + 1;
        return faceValue;
        
    }

    public int getFaceValue(){
        return faceValue;
        
    }
}