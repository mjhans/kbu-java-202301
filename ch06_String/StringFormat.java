public class StringFormat{
    public static void main(String[] args){
        int x = 123;
        double y = 3.141592;
        String s = "Hello, world!";

        String result = String.format("x = [%d], y = %.2f, s = %s", x, y, s);
        System.out.println(result); // "x = 123, y = 3.14, s = Hello, world!"

        String format = "x = %d, y = %.2f, s = %s \n";

        int x1 = 1231;
        double y1 = 31.141592;
        String s1 = "Hello1, world!";

        int x2 = 1233;
        double y2 = 33.141592;
        String s2 = "Hello3, world!";

        int x3 = 1233;
        double y3 = 33.141592;
        String s3 = "Hello3, world!";

        String result1 = String.format(format, x1, y1, s1);
        String result2 = String.format(format, x2, y2, s2);
        String result3 = String.format(format, x3, y3, s3);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.printf(format, x1, y1, s1);
        System.out.printf(format, x2, y2, s2);

    }
}