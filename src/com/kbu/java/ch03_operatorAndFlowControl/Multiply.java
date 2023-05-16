package com.kbu.java.ch03_operatorAndFlowControl;

public class Multiply{
    public static void main(String[] args){
        for (int i = 2 ; i <=9 ;i++){
            System.out.println(i + "단 입니다.");
            System.out.println(i*1);
            System.out.println(i*2);
            System.out.println(i*3);
            System.out.println(i*4);
            System.out.println(i*5);
            //생략 ...   
            System.out.println(i*9);
            
            System.out.println("---------------------------------");
        }
        System.out.println("end");
    }
}