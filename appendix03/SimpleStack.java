import java.util.Scanner; 
import java.util.Random;

public class SimpleStack{
    public static int STACK_SIZE = 5;
    public static int[] stack = new int[STACK_SIZE];
    public static int top = 0;  // 데이터 위치를 알려주는 변수

    public static boolean isFull(){
        return top == STACK_SIZE;
    }
    public static boolean isEmpty(){
        return top == 0;
    }
    public static void printArray(){
        System.out.printf("\t stack의 상태 top: %d, stack size : %d \n", top, STACK_SIZE);
        for (int i = (top-1) ; i >= 0 ; i--){
            System.out.printf("\t  index: %d, value: %d \n", i, stack[i]);
        }
    }
    public static int push(int x){
        int result = -1;
        if (!isFull()){
            stack[top++] = x;
            result = x;
        }
        return result;
    }
    public static int pop(){
        return stack[--top];
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        String kin = "";
        do{
            System.out.println("1: 저장");
            System.out.println("2: 삭제");
            System.out.println("3: 출력");
            System.out.println("s: Stop");
            
            kin = sc.next(); 
            if (kin.equals("1")){
                int result = push(rnd.nextInt(20));
                if (result == -1){
                    System.out.println("error");
                } else {
                    System.out.printf("\t %d 저장 \n", result);
                }
                
            } else if (kin.equals("2")){
                int result = pop();
                System.out.printf("\t %d 삭제 \n", result);
            } else if (kin.equals("3")){
                System.out.println("-----------------------------------");
                printArray();
                System.out.println("-----------------------------------");
            } else if (kin.equals("s")){
                System.out.println("Stop");
            } else {
                System.out.println("메뉴번호를 다시 입력해주세요.");
            }

        }while(!kin.equals("s"));
    }
}