package com.kbu.java.ch10_Exception.App;

import java.util.*;
import java.util.Scanner;

public class ScannerExceptionAutoCloseDemo {
    public static void main(String[] args){
        int temp = 0;
        Scanner input = new Scanner(System.in);
        try (input) {
            temp = input.nextInt();
            System.out.println(temp);
        
        } catch (Exception e){
            System.out.println(e);
        }
        
        System.out.printf("temp : %d \n", temp);
        System.out.println("exit program");
    }
}
