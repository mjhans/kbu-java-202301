public class ArraySwap{
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
    public static void main(String[] args){
        int[] a = {1,2,3,4,5};
        swap(a, 0,1);
        printArray(a);
    }
}