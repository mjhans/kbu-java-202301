/*
 * File name Sqrt.java
 */

 public class Sqrt{
    public static void main(String[] args){
        double num, sroot, rerr;
        for (num = 1.0; num < 10.0 ; num++){
            sroot = Math.sqrt(num);
            System.out.println(num + " 의 제곱근 : " + sroot);

            rerr = num - (sroot * sroot);
            System.out.println("모수 - 제곱값 : " + rerr);
        }
    }
 }