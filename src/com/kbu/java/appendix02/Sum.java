package com.kbu.java.appendix02;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 입력 : ");
        int num = sc.nextInt();
        int sum = 0;

        // n * (n+1) / 2
        // i를 증가하면서 더하는 로직
        // for (int i = 1 ; i <= num ; i++){
        //     sum += i;

        // }
        // 출력문
        System.out.println(sum);
    }
}