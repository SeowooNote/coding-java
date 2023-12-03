package com.seowoo.java;

public class BankAccount {
    protected String accountNumber;
    protected int balance;

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        balance = 0;
        System.out.println(accountNumber + " 계좌가 생성되었습니다. (잔고: " + balance + " 원)");
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        if(amount > balance) {
            System.out.println("잔고가 없습니다.");
            return;
        }

        balance -= amount;
    }

    public int getBalance() {
        return balance;
    }
}
