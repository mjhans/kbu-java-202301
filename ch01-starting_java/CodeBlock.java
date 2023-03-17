public class CodeBlock{
    public static void main(String[] args){
        int i, j, d;

        i = 6;
        j = 10;
        if (i == 7)
            System.out.println("i is " + i);
            i = 10;
            System.out.println("i is " + i);

        if ( i != 10 ) {
            System.out.println("i does not equal zero");
            d = j / i;
            System.out.println("j / i is " + d);
        }
    }
}