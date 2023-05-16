package com.kbu.java.ch03_operatorAndFlowControl;

//file name : FactorialSum.java
public class FactorialSum{
    public static void main(String[] args){
        int sum = 0;
        int fact = 1;

        for (int i = 1; i <=5; i++){
            sum += i;
            fact *= i;
        }

        System.out.println("Sum is " + sum);
        System.out.println("Factorial is " + fact);
    }
}