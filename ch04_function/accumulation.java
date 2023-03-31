/***************************************************
 * 
 * File name : accumulation.java
 *
 ***************************************************/
public class accumulation{
    public static int accumulate(int n) {
        if(n == 1) {
            return n;
        } else {
            return n + accumulate(n-1);
        }

    }
    public static void main(String[] args){

        int accumulate = accumulate(5); // 5+4+3+2+1=15
        System.out.println(accumulate);
    }
}