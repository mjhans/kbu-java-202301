package com.kbu.java.ch04_function;

public class CheckNum{
    public static int add(int a, int b){
        return (a + b);
    }
    public static boolean isEven(int a){
        if ((a % 2) == 0){
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args){
        System.out.println(add(10, 20));
        int number = 32;
        boolean bResult = isEven(number);
        System.out.println(number + " even: " + bResult);
    }
}