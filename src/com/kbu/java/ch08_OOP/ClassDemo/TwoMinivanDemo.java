package com.kbu.java.ch08_OOP.ClassDemo;

public class TwoMinivanDemo {
    public static void main(String[] args){
        Minivan minivan1 = new Minivan();
        minivan1.passengers = 7;
        minivan1.fuelcap = 16;
        minivan1.mpg = 21;

        int distance = minivan1.fuelcap * minivan1.mpg;
		int payments = distance * 2000;
        
        System.out.printf("passengers : %s , distance : %s \n", minivan1.passengers, distance);
        System.out.printf("payments : %s \n", payments);

		Minivan minivan2 = new Minivan();
        minivan2.passengers = 2;
        minivan2.fuelcap = 30;
        minivan2.mpg = 21;

        int distance2 = minivan2.fuelcap * minivan2.mpg;
		int payments2 = distance2 * 2000;
        
        System.out.printf("passengers : %s , distance : %s \n", minivan2.passengers, distance2);
        System.out.printf("payments : %s \n", payments2);

    }
}
//MinivanDemo.java
