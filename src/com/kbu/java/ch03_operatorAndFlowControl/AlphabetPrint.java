package com.kbu.java.ch03_operatorAndFlowControl;

//filename : AlphabetPrint.java
public class AlphabetPrint {
    public static void main(String[] args) {
        char ch = 'a';
        while(ch <= 'z') {
            ch++;
            System.out.println("char: " + ch);
            //ch++;
        }
    }
}