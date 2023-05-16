package com.kbu.java.appendix02;

import java.util.Scanner;

public class PrimeList{
    public static boolean isPrime(int num){
        for (int i = 2; i <= (int)(num / 2) ; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자 입력 : ");
        int number = sc.nextInt();

        for (int i = 2 ; i <= number ; i++){
            if (isPrime(i)){
                System.out.println(i + "는 소수입니다.");
            }
            
        }
    }
}