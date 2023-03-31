public class Multiplication {
    public static void main(String[] args){
        // 5단 출력하기
        System.out.println("while문으로 출력하기");
        int i = 1;
        while (i < 10){
            System.out.println("5 * " + i + " = " + (5 * i++));
        }

        System.out.println("do-while문으로 출력하기");
        int j = 0;
        do {
            System.out.println("5 * " + j + " = " + (5 * j++));
        } while (j < 10);

        System.out.println("for문으로 출력하기");
        for (int k = 1; k < 10 ; k++) {
            System.out.println("5 * " + k + " = " + (5 * k));
        }
    }
}