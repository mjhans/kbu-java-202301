
public class getNumber{
    public static int getRandomNumber(){
        double rand = Math.random();
        int diceValue = (int)(rand * 100000);
        return diceValue;
    }

    public static void main(String[] args){
        int num = getRandomNumber();
        System.out.println("random number : " + num);
    }
}