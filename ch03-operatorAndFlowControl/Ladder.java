/*
 * File name Ladder.java
 */

public class Ladder{
    public static void main(String[] args){
        for (int x = 0 ; x < 10 ; x++){
            if (x == 1){
                System.out.println("x는 1");
            } else if(x == 2) {
                System.out.println("x는 2");
            } else if(x == 3) {
                System.out.println("x는 3");
            } else if(x == 4) {
                System.out.println("x는 4");
            } else {
                System.out.println("x는 1~4 사이의 값이 아니다. (" + x + ")");
            }
        }
    }
}