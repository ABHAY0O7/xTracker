package com.example.xtracker;

public class Expense {

    public int balance;
    public void add(int amount){
        this.balance+=amount;
    }
    public int get(){
        return balance;
    }
}
