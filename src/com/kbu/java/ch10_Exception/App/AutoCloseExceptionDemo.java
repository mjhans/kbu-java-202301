package com.kbu.java.ch10_Exception.App;

import java.io.Closeable;
import java.io.IOException;

class AutoCloseObj implements AutoCloseable{

    @Override
    public void close() throws IOException {
        System.out.println("AutoCloseObj closed");
    }
}

public class AutoCloseExceptionDemo {
    public static void main(String[] args){
        AutoCloseObj obj = new AutoCloseObj();
        try(obj){

        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("program exit");
    }
}
