import java.util.Scanner;

public class Help {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char select;
        do {            
            System.out.println("1. if");
            System.out.println("2. switch");
            System.out.println("3. for");
            System.out.println("4. while");
            System.out.println("5. do-while");
            System.out.println("q. exit");
            System.out.println("보고 싶은 Control Statement를 선택하세요");

            select = sc.next().charAt(0);

            switch (select) {
                case '1':
                    System.out.println("if help");
                break;
                case '2':
                    System.out.println("switch help");
                break;
                case '3':
                    System.out.println("for help");
                break;
                case '4':
                    System.out.println("while help");
                break;
                case '5':
                    System.out.println("do-while help");
                break;
                case 'q':
                    System.out.println("exit..");
                break;
                default:
                    System.out.println("잘못 입력하셨습니다."); 
            }
        } while (select != 'q');
    }
}