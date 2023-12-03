package com.seowoo.java;

public class InheritanceBasic03 {
    public static void main(String[] args) {
        // 1. 부모 클래스로 선언
        BankAccount bankAccount = new SavingAccount("ACC-2023-12", 500000);
        System.out.println(("계좌의 잔고는? ") + bankAccount.getBalance() + "원");

        bankAccount.deposit(100000);
        bankAccount.withdraw(50000);
        System.out.println("입출금 후 계좌의 잔고는? " + bankAccount.getBalance() + "원");

        // bankAccount.getMaturedAmount() 호출 불가 -> 부모 클래스 선언

        // 2. 자식 클래스로 선언
        SavingAccount savingAccount = new SavingAccount("ACC-2024-01", 5000000);
        System.out.println("계좌의 잔고는? " + savingAccount.getBalance() + "원");

        savingAccount.deposit(5000000);
        System.out.println("정기 예금 만기 금액은? " + savingAccount.getMaturedAmount() + "원");
    }
}
