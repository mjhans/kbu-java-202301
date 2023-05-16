package com.kbu.java.ch03_operatorAndFlowControl;

// Filename : EmptyFor.java
public class EmptyFor{
    public static void main(String[] args){
        int i;
        int sum = 0;
        for (i = 1; i <= 10; sum += i++);
        System.out.println("Sum is " + sum);
    }
}