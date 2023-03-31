/********************************************************
 *                                                      *
 *  File Name : Interactive.java                        *
 *                                                      *
 ********************************************************/
import java.util.Scanner;

public class Interactive{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자 입력 : ");
        int num = sc.nextInt();
        System.out.println("입력된 숫자 : " + num);

        System.out.print("문자 입력 : ");
        char ch = sc.next().charAt(0);
        System.out.println("입력된 문자 : " + ch);

        System.out.print("문자열 입력 : ");
        String str = sc.next();
        System.out.println("입력된 문자열 : " + str);

        System.out.print("소수 입력 : ");
        double d = sc.nextDouble();
        System.out.println("입력된 소수 : " + d);

    }
}

