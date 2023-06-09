package com.kbu.java.ch11_Stream;

import java.io.FileInputStream;

public class FileInputStreamDemo {
    public static void printFile(String filePath){
        try(FileInputStream fis = new FileInputStream(filePath)){
            int i;
            System.out.printf("**** start: [%s] \n", filePath);
            while ((i = fis.read()) != -1){
                System.out.printf("[%s]\n", (char)i);
            }
            System.out.println("**** end!!");
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        
        printFile("/Users/mjhans/workspaces/personal/java_lecture/kbu-java-2023-01/src/com/kbu/java/ch11_Stream/Sample01.txt");
        printFile("/Users/mjhans/workspaces/personal/java_lecture/kbu-java-2023-01/src/com/kbu/java/ch11_Stream/Sample02.txt");
    }
}
