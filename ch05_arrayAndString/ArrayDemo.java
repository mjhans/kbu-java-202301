public class ArrayDemo{
    public static void main(String[] args){
        int a = 4;
        int[] intArray;
        // System.out.println(intArray[2]);
        intArray = new int[5];
        //System.out.println(intArray[2]);
        int[] myArray = intArray;
        //System.out.println(intArray.length);

        myArray[2] = 6;
        intArray[0] = 1;

        //System.out.println(myArray[0]);

        int[][] i = new int[2][5];
        //System.out.println(i.length);
        for (int idx = 0 ; idx < i.length ; idx++){
            System.out.println(i[idx].length);
        }

    }
}