package com.kbu.java.ch09_EnumAndCollection.Game;

public abstract class Unit {
    protected String unitName;
    
    public Unit(String unitName){
        this.unitName = unitName;
    }
    public String getUnitName(){
        return this.unitName;
    }

    public abstract void attack();
    public abstract void move(int x, int y);
}
