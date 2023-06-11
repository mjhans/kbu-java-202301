package com.kbu.java.ch11_Stream;

import java.io.FileWriter;
import java.nio.charset.StandardCharsets;

public class FileWriterTest {
    public static void writeFile(String filePath){
        try(FileWriter fw = new FileWriter(filePath, StandardCharsets.UTF_8, false)){
            fw.flush();
            System.out.printf("**** start: [%s] \n", filePath);
            for (int i = 0 ; i < 10 ; i++){
                String msg = String.format("5 * %d = %d \n", i, (5 * i));
                fw.write(msg);
            }
            fw.flush();

            fw.write('A');
            fw.write("65");
            char buf[] = {'A', 'B', 'c'};
            fw.write(buf);
            fw.flush();
            System.out.println("**** end!!");
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        
        writeFile("/Users/mjhans/workspaces/personal/java_lecture/kbu-java-2023-01/src/com/kbu/java/ch11_Stream/WriteSample01.txt");

    }
}
