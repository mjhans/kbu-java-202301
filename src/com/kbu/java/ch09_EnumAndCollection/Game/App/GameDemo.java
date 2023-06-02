package com.kbu.java.ch09_EnumAndCollection.Game.App;

import com.kbu.java.ch09_EnumAndCollection.Game.Archer;
import com.kbu.java.ch09_EnumAndCollection.Game.Knight;
import com.kbu.java.ch09_EnumAndCollection.Game.Unit;
import com.kbu.java.ch09_EnumAndCollection.Game.Controller.GameController;

public class GameDemo {
    public static void main(String[] args){
        Unit knight1 = new Knight("knight1");
        Unit Archer1 = new Archer("archer1");

        GameController gc = new GameController();
        gc.addUnit(Archer1);
        gc.addUnit(knight1);

        gc.move(3,4);
        gc.attack();
    }
}
