package com.ITVDN.AnonymousClassAndEnums.AccountBank;

public class APIAcc {
    public static void main(String[] args) {
        Account account = new Account("DD",1236);
        account.putOnAccount(2000);
        account.payment(205.5);
        account.withDraw(523.5);
        account.transferToAnotherAcc(588);
        account.showHistory();
    }
}
