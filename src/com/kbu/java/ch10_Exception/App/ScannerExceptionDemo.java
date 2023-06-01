package com.kbu.java.ch10_Exception.App;

import java.util.InputMismatchException;
import java.util.Scanner;


public class ScannerExceptionDemo {
    public static void main(String[] args){
        int temp = 0;
        Scanner input = null;
        try {
            input = new Scanner(System.in);
            temp = input.nextInt();
        } catch (InputMismatchException e) {
            System.out.println(e);
        } finally {
            //input.close();
            System.out.println("Finally?");
            if (input != null){
                try {
                    System.out.println("Finally close!!!");
                    input.close();
                } catch (Exception e){
                    System.out.println(e);
                }
            }
        }
        System.out.printf("temp : %d \n", temp);
        System.out.println("exit program");
    }
}
