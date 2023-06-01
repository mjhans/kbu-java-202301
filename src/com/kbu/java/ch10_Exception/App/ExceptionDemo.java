package com.kbu.java.ch10_Exception.App;

import java.io.IOException;
import java.util.*;

public class ExceptionDemo {
    public static void main(String[] args){
        int[] arr = new int[5];
        try{
            int a = arr[5];
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}