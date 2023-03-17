public class CharacterExample{
    public static void main(String[] args) {
        char chA = 'A';  // 2byte로 할당
        System.out.println(chA);
        System.out.println((int)chA);  // 대문자 A에 대한 아스키 코드 (UTF-16) 값

        char chB = 66;
        System.out.println(chB);
        
    }
}