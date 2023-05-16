package com.kbu.java.ch07_classAndObject.SimpleVehicle;

public class SimpleVehicleDemo{
    public static void main(String[] args){
        SimpleVehicle minivan = new SimpleVehicle(7, 80, 9);
        // SimpleVehicle minivan = new SimpleVehicle();
        //minivan.fuelcap = 80;
        // minivan.mpg = 9;
        // minivan.passenger = 7;

        // SimpleVehicle sportscar = new SimpleVehicle();
        // sportscar.fuelcap = 40;
        // sportscar.mpg = 12;
        // sportscar.passenger = 2;

        int range_minivan = minivan.range();
        // int range_sportscar = minivan.range();  
        System.out.println(range_minivan);
        
        // for (int i = 0 ; i < args.length ; i++){
        //     System.out.println(args[i]);
        // }



    }
}