package com.kbu.java.ch07_classAndObject.SimpleAccount;

public class Account{

    private String accountNumber;
    private String owner;
    private long balnace;

    public Account(int accountNumber){
        this.accountNumber = String.format("%d", accountNumber);
    }

    public long deposit(long money){
        balnace =+ money;
        return balnace;
    }
    public long withdraw(long money){
        if (balnace >= money){
            balnace =- money;    
        } 
        return balnace;
        
    }

}