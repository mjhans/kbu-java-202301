package com.kbu.java.ch06_String;

public class Palindrome{
    public static boolean isPalindrome(String str){
        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args){
        String sample = "A man, a plan, a canal, Panama!";
        String test = sample.replaceAll("[^ㄱ-ㅎㅏ-ㅣ가-힣a-zA-Z0-9]", "").toLowerCase();
        System.out.printf("test string : %s, is palindrome: %s \r\n", sample, isPalindrome(test));

        StringBuilder sb = new StringBuilder(test);
        String test2 = sb.reverse().toString();
        System.out.println(test2 == test);
        System.out.println(test2.equals(test));
    }
}