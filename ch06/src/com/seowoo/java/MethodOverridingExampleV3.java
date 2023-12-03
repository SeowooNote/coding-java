package com.seowoo.java;

public class MethodOverridingExampleV3 {
    public static void main(String[] args) {
        // 1. 문제 상황
        BankAccount bankAccount = new SavingAccount("ACC-101", 500000);
        bankAccount.deposit(100000);
        bankAccount.withdraw(300000);
        System.out.println("- 잔고는 " + bankAccount.getBalance() + " 원 입니다.");

        // 2. 메소드 오버라이딩으로 문제 해결
        SavingAccountV2 savingAccountV2 = new SavingAccountV2("ACC-102", 700000);
        savingAccountV2.deposit(100000);
        System.out.println("- 잔고는 " + savingAccountV2.getBalance() + " 원 입니다.");

        savingAccountV2.expire();
        System.out.println("- 잔고는 " + savingAccountV2.getBalance() + " 원 입니다.");
        savingAccountV2.withdraw(500000);
        System.out.println("- 잔고는 " + savingAccountV2.getBalance() + " 원 입니다.");
    }
}
