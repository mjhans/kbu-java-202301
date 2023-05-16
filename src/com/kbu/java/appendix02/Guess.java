package com.kbu.java.appendix02;

import java.util.Scanner;

public class Guess{
    public static void main(String[] args){
        int ch = 'l';

        Scanner sc = new Scanner(System.in);
        char input;
        do {
            System.out.print("문자 입력 : ");
            input = sc.next().charAt(0);

            if (input > ch){
                System.out.println("down");
            } else if (input < ch){
                System.out.println("up");
            } else {
                System.out.println("equal");
                break;
            }
        } while(input != '0');
    }
}