package com.kbu.java.ch03_operatorAndFlowControl;

/*
 * File name DecrFor.java
 */

public class DecrFor{
    public static void main(String[] args){
        for (int x = 100; x > -100 ; x -= 5){
            System.out.printf("%d, ", x);
        }
        System.out.printf("%n");
        int i, j;
        for (i = 0, j = 10; i < j ; i++, j--){
            System.out.printf("i and j : %d, %d %n", i, j);
        }

        for (int k = 0 ; k < 10;){
            System.out.println("#" + k);
            k++;
        }
    }
}