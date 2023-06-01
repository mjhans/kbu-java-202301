package com.kbu.java.ch10_Exception.App;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionMultiDemo {
    public static void main(String[] args){
        int temp;
        try (Scanner input = new Scanner(System.in)) {
            temp = input.nextInt();
            System.out.println(temp);
        } catch (InputMismatchException e) {
            e.printStackTrace();
        } catch (Exception e) {
            if (e instanceof IOException) {
                e.printStackTrace();
            }
            e.printStackTrace();
        }
    }
}
