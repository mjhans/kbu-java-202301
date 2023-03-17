public class floating {
    public static void main(String[] args) {
        double doubleValue = 0.0d;
        for (int i = 0; i < 100; i++) {
            doubleValue += 0.1d;
        }
        double doubleResult = 0.1d * 100.0d;
        System.out.println("expected value is : " + doubleResult + " result is : " + doubleValue);
        float floatValue = 0.0f;
        for (int i = 0; i < 100; i++) {
            floatValue += 0.1f;
        }
        float floatResult = 0.1f * 100.0f;
        System.out.println("expected value is : " + floatResult + " result is : " + floatValue);
    }
}
