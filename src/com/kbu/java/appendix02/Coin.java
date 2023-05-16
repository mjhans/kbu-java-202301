package com.kbu.java.appendix02;

public class Coin{
    public static void main(String[] args){
        int a = 10;
        int b = 10;
        int c = 10;
        int d = 9;
        int e = 10;
        int f = 10;
        int g = 10;
        int h = 10;

        if ((a + b) == (c + d)) {
            // efgh 중에 가짜 동전이 있다.
            if (e == f){
                // gh 중에 가짜가 있다.
                if (g == e) {
                    System.out.println("h가 가짜다");
                } else {
                    System.out.println("g가 가짜다");
                }
            } else {
                // e f중에 가짜가 있다. 
                if ( e == g) {
                    System.out.println("f가 가짜다");
                } else {
                    System.out.println("e가 가짜다");
                }
            }
        } else {
            // abcd 중에 가짜 동전이 있다.
            if (a == b) {
                // cd중에 가짜가 있다.
                if ( c == a) {
                    System.out.println("d가 가짜다");
                } else {
                    System.out.println("c가 가짜다");
                }
            } else {
                // ab 중에 가짜가 있다.
                if (a ==  d) {
                    System.out.println("b가 가짜다");
                } else {
                    System.out.println("a가 가짜다");
                }
            }
        }
    }
}