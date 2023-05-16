package com.kbu.java.ch08_OOP.UseAbstract;

public abstract class AbstractAnimal {
    protected String category = "";
    public AbstractAnimal(){
        this("Animal");
    }
    public AbstractAnimal(String category){
        this.category = category;
    }
    public abstract void sound();
    public void showCategoryName(){
        System.out.println(this.category + " category");
    }
}
