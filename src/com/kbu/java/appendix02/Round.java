package com.kbu.java.appendix02;

import java.util.Scanner; // Scanner 사용을 위한 임포트

public class Round {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        final double PI = 3.14;
        System.out.print("원의 반지름을 정수로 입력하세요 : ");
        int r = sc.nextInt();
        System.out.println("");
        System.out.println("당신이 입력한 반지름은 " + r + "입니다.");
        double area = PI * r * r;
        double roundLength = 2 * PI * r;
        System.out.println("원의 넓이 : " + area);
        System.out.println("원의 둘레 : " + roundLength);
    }
}