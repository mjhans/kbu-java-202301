public class GCD{
    public static int euclideanRecursive(int a, int b){
        if ((a % b) == 0){
            return b;
        } else {
            return euclideanRecursive(b, a%b);
        }
    }
    public static int euclidean(int a, int b){
        while(b > 0){
            int tmp = a;
            a = b;
            b = a % b;
        }
        return a;
    }
    public static void main(String[] args){
        int gcd1 = euclideanRecursive(10, 5);
        int gcd2 = euclideanRecursive(30, 10);
        System.out.println(gcd1 + ", " + gcd2);
    }
}