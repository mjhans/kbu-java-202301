public class SimpleDiceDemo{
    public static void main(String[] args){
        SimpleDice sd1 = new SimpleDice();
        SimpleDice sd2 = new SimpleDice();

        System.out.printf("%d + %d = %d \n", sd1.roll(), sd2.roll(), sd1.getFaceValue() + sd2.getFaceValue());
        

    }
}