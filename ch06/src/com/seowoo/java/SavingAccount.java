package com.seowoo.java;

public class SavingAccount extends BankAccount {
    
    private static final double SAVING_ACCOUNT_INTEREST_RATE = 0.02; // 2%

    public SavingAccount(String accountNumber, int deposit) {
        super(accountNumber);
        super.balance = deposit;
        System.out.println(accountNumber + " 계좌가 생성되었습니다. (잔고: " + deposit + " 원)");
    }

    public int getMaturedAmount() {
        double res = super.balance * (1 + SAVING_ACCOUNT_INTEREST_RATE);
        return (int) res;
    }

}
