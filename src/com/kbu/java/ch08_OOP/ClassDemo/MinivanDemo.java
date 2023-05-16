package com.kbu.java.ch08_OOP.ClassDemo;

public class MinivanDemo {
    public static void main(String[] args){
        Minivan minivan = new Minivan();

        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        int distance = minivan.fuelcap * minivan.mpg;
		int payments = distance * 2000;
        
        System.out.printf("passengers : %s , distance : %s \n", minivan.passengers, distance);
        System.out.printf("payments : %s \n", payments);
    }
}
//MinivanDemo.java
