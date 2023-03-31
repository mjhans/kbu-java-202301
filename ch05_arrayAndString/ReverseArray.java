import java.util.Scanner;

public class ReverseArray{
    public static void printArray(int[] target){
        for (int i = 0 ; i < target.length ; i++){
            System.out.println(target[i]);
        }
    }

    public static int[] copyArray(int[] source){
        int[] temp = new int[source.length];
        for(int i = 0 ; i < temp.length ; i++){
            temp[i] = source[i];
        }
        return temp;
    }

    public static int[] copyArray2(int[] source){
        int[] temp = new int[source.length];
        for(int i = 0 ; i < temp.length ; i++){
            temp[i] = source[i];
        }
        source[0] = 100000;
        return temp;
    }
    public static int[] reverseArray(int[] source){
        int[] temp = new int[source.length];
        int originIdx;
        int tmpIdx;
    
        for(originIdx = 0, tmpIdx = (temp.length - 1) ; originIdx < source.length ; originIdx++, tmpIdx--){
            temp[tmpIdx] = source[originIdx];
        }
        return temp;
    }


    public static void main(String[] args){
        System.out.println("숫자 10번 입력");
        //int[] origin = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int[] origin = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < origin.length; i++){
            origin[i] = sc.nextInt();
        }
        // System.out.println("origin 출력");
        // printArray(origin);
        //System.out.println("reverse");
        printArray(copyArray2(origin));
        printArray(origin);
        
        // System.out.println("origin 복사본");
        // int[] copiedArray = copyArray(origin);
        // copiedArray[0] = 10000;
        // printArray(copiedArray);
        // printArray(origin);


    }
}