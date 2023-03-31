import java.util.Scanner;

public class SimpleGuess{
    public static void main(String[] args){
        char ch, answer = 'K';
        System.out.println("I'm thinking of a letter A ~ Z.");
        System.out.println("Can you guess it: ");
        Scanner sc = new Scanner(System.in);
        ch = sc.next().charAt(0);
        if (ch == answer) {
            System.out.println("** Right **");
        }
        else {
            System.out.println("...Sorry, you're wrong.");
            if (ch < answer) 
                System.out.println("too low");
            else
                System.out.println("too high");
        }
    }
}