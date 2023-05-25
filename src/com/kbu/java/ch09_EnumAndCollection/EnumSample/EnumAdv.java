package com.kbu.java.ch09_EnumAndCollection.EnumSample;

import com.kbu.java.ch09_EnumAndCollection.EnumSample.Constants.*;

//---------------------------------------
// interface를 이용해서 구분 :
//      본질은 상수값이기에 논리적인 오류나 예상치 못한 인풋값이 들어올때는 실행할 때 문제 발생
// interface Fruits {
// 	int APPLE = 1, BANANA = 2, ORANGE = 3;
// }

// interface Companies {
// 	int MS = 1, APPLE = 2, AMAZON = 3;
// }
//---------------------------------------
/*
 *   주석으로 상수에 대한 의미를 부여
 *   1 : apple
 *   2 : BANANA
 *   3 : ORANGE 
 */
public class EnumAdv {
    
    //---------------------------------------
    // final static 키워드로 변수에 상수값 정의 
    //    변경에 유연하게 대응 가능 하나, 변수값이 중첩될 경우 문제가 발생한다. 
    // final static int APPLE = 1;
    // final static int BANANA = 2;
    // final static int ORANGE = 3;

    // //회사 추가
    // final static int MS = 1;
    // final static int APPLE = 2;
    // final static int AMAZON = 3;
    //---------------------------------------


    public static void main(String[] args) { 
        
        //int type    = APPLE;
        Fruits type = Fruits.APPLE;
        System.out.println(Companies.APPLE);
        System.out.println(Fruits.APPLE);
        

        // if (Fruits.APPLE == Companies.APPLE) {
        //     System.out.println("what???");
        // }

        // if (type == Companies.APPLE) {
        //     System.out.println("what???");
        // }        

        switch (type) {
            //case Fruits.APPLE:
            case APPLE:
                System.out.println("32 kcal");
                break;
            //case Fruits.BANANA:
            case BANANA:
                System.out.println("52 kcal");
                break;
            //case Fruits.ORANGE:
            case ORANGE:
                System.out.println("16 kcal");
                break;
        }    
    }
}
