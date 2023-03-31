public class VariableAgeTypeUnmatched {
    public static void main(String[] args) {
        int age = (int)40.1; // 선언한 타입과 맞지 않는 값 할당
        double dAge = age;
        System.out.println("제 나이는 " + age + "입니다.");
        System.out.println("제 나이는 " + dAge + "입니다.");
    }
}