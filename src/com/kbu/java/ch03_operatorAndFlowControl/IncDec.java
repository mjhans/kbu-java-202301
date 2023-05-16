package com.kbu.java.ch03_operatorAndFlowControl;

/********************************************************
 *                                                      *
 *  File Name : IncDec.java                             *
 *                                                      *
 ********************************************************/

public class IncDec {
    public static void main(String[] args){
        int i = 0;

        int result1 = i++; // int result1 = i; i = i+1;
        int result2 = ++i; // int result2 = i = i + 1;

        System.out.println("result 1 : " + result1 + ", result 2 : " + result2);
    }
}


