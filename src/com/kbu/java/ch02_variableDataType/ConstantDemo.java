package com.kbu.java.ch02_variableDataType;

public class ConstantDemo {
    public static void main(String[] args){
        final int MAXIMUM = 30;
        final int MINIMUM;
        MINIMUM = 1;

        // MAXIMUM = 40;  // 재할당은 안됨
        System.out.println("최대값 : " + MAXIMUM + " , 최소값 : " + MINIMUM);        
    }
}