public class StringDemo{
    public static void main(String[] args){
        String a = "hello world!!";
        String b = "hello world!!";

        System.out.println(a == b);
        System.out.println(a.equals(b));

        String c = new String("hello world!!");
        String d = new String("hello world!!");

        System.out.println(c == d);
        System.out.println(c.equals(d));

        System.out.println("---------------------------------------------------");

        String myString = "Hello World!";

        int length = myString.length(); // 12

        char firstChar = myString.charAt(0); // 'H'
        char lastChar = myString.charAt(11); // '!'        

        String subString = myString.substring(6, 11); // "World"
        
        String lowerCaseString = myString.toLowerCase(); // "hello world!"

        String upperCaseString = myString.toUpperCase(); // "HELLO WORLD!"

        String replacedString = myString.replace('o', '0'); // "Hell0 W0rld!"

        int index = myString.indexOf("World"); // 6

        String trimmedString = myString.trim(); // "Hello World!"

        String[] splitString = myString.split(","); // ["Hello",

        System.out.println(myString);

    }
}