import java.util.Random;

public class FindNumber{
    public static void printArray(int[] target){
        for (int i = 0 ; i < target.length ; i++){
            System.out.println(target[i]);
        }
    }
    public static int[] swap(int[] origin, int sourceIndex, int targetIndex){
        int temp = origin[sourceIndex];
        origin[sourceIndex] = origin[targetIndex];
        origin[targetIndex] = temp;
        return origin;
    }

    public static int[] shuffleIndexes(int[] source){
        int range = source.length;
        
        Random rd = new Random();
        
        for (int i = 0 ; i < range ; i++){
            int dstIdx = rd.nextInt(range); //배열의 범위 내
            source = swap(source, i, dstIdx);
        }
        return source;     
        
    }

    public static int[] copyArray(int[] source){
        int[] temp = new int[source.length -1];
        for(int i = 0 ; i < temp.length ; i++){
            temp[i] = source[i];
        }
        return temp;
    }

    public static int[] initializeArr(int N){
        int[] temp = new int[N];
        for(int i = 0 ; i < N ; i++){
            temp[i] = (i + 1);
        }
        //int[] randArr = shuffleIndexes(temp);
        return copyArray(shuffleIndexes(temp));

    }
    public static void main(String[] args){
        int[] A = initializeArr(10);
        printArray(A);
    }
}