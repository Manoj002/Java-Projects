package com.rajeshpatkar;

public class PiggyBank {

    private int balance;
    private int lt;

    public int getBalance() {
        return balance;
    }

    public int getLt() {
        return lt;
    }

    @Override
    public String toString() {
        return "PiggyBank{" + "balance=" + balance + ", lt=" + lt + '}';
    }

    public PiggyBank() {
    }

    public void deposit(int v) {
        balance = balance + v;
        lt = v;
    }

    public void withdraw(int v) {
        if (balance >= v) {
            balance = balance - v;
            lt = -v;
        }
    }

}