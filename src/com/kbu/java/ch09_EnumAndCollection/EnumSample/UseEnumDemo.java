package com.kbu.java.ch09_EnumAndCollection.EnumSample;

import com.kbu.java.ch09_EnumAndCollection.EnumSample.Constants.Day;

public class UseEnumDemo {
    public static void main(String[] args){
        for (Day dt : Day.values()){
            System.out.println(dt.toString());
        }

        Day monday = Day.valueOf("MONDAY");

        System.out.println(monday.toString());

    }
}
