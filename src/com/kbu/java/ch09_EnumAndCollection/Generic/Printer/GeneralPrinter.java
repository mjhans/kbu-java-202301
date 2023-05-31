package com.kbu.java.ch09_EnumAndCollection.Generic.Printer;

import com.kbu.java.ch09_EnumAndCollection.Generic.Printable;

public class GeneralPrinter<T extends Printable> {
    protected T item;
    public void setItem(T item){
        this.item = item;
    }
    public void print(){
        item.print();
    }
}
