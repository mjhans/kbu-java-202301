package com.kbu.java.ch11_Stream;

import java.io.FileReader;
import java.nio.charset.StandardCharsets;

public class FileReaderTest {
    public static void printFile(String filePath){
        try(FileReader fr = new FileReader(filePath, StandardCharsets.UTF_8)){
            int i;
            System.out.printf("**** start: [%s] \n", filePath);
            while ((i = fr.read()) != -1){
                System.out.printf("[%s]\n", (char)i);
            }
            System.out.println("**** end!!");
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        
        printFile("/Users/mjhans/workspaces/personal/java_lecture/java-programming/src/com/kbu/java/File/TextFiles/Sample01.txt");
        printFile("/Users/mjhans/workspaces/personal/java_lecture/java-programming/src/com/kbu/java/File/TextFiles/Sample02.txt");
    }
}
