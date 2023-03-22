/*
 * File name BitLogical.java
 */

public class BitLogical{
    public static void main(String[] args){
        int ops1 = 3;
        int ops2 = 4;

        if ((ops1 > ops2) & (++ops1 < ops2)){
            System.out.println("비트연산자 (ops1 < ops2) & (++ops1 < ops2) 결과 : true");
            System.out.println("ops1: " + ops1 + ", ops2: "+ ops2);
        } else {
            System.out.println("비트연산자 (ops1 < ops2) & (++ops1 < ops2) 결과 : false");
            System.out.println("ops1: " + ops1 + ", ops2: "+ ops2);
        }

        ops1--; // ops1 값 원상 복구
        if ((ops1 > ops2) && (++ops1 < ops2)){
            System.out.println("논리연산자 (ops1 < ops2) && (++ops1 < ops2) 결과 : true");
            System.out.println("ops1: " + ops1 + ", ops2: "+ ops2);
        } else {
            System.out.println("논리연산자 (ops1 < ops2) && (++ops1 < ops2) 결과 : false");
            System.out.println("ops1: " + ops1 + ", ops2: "+ ops2);
        }
    }
}