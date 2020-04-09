package com.ITVDN.AnonymousClassAndEnums.AccountBank;

import java.util.ArrayList;

public class Account {
    private String nameOwner;
    private int account;
    private double money;
    OperationAccount history;

    private class OperationAccount {
        ArrayList<String> archiveOperation;

        OperationAccount() {
            archiveOperation = new ArrayList<>();
        }

        void saveOperation(String info, double money) {
            archiveOperation.add(info + " : " + money + " $.");
        }

        public ArrayList<String> getArchiveOperation() {
            return archiveOperation;
        }
    }

    public Account(String _name,int numberAcc) {
        history = new OperationAccount();
        nameOwner=_name;
        account=numberAcc;
    }
    public void putOnAccount(double _money) {
        money += _money;
        history.saveOperation("Put on Account", _money);
    }

    public double withDraw(double _money) {
        if (money<_money){
            System.out.println("Insufficient funds :-(");
            return 0;
        }else {
            money-=_money;
            history.saveOperation("With Draw in Account", _money);
            return _money;
        }
    }

    public double payment(double _money) {
        if (money<_money){
            System.out.println("Insufficient funds :-(");
            return 0;
        }else {
            money-=_money;
            history.saveOperation("Payment ", _money);
            return _money;
        }
    }

    public double transferToAnotherAcc(double _money) {
        if (money<_money){
            System.out.println("Insufficient funds :-(");
            return 0;
        }else {
            money-=_money;
            history.saveOperation("Transfer to another ", _money);
            return _money;
        }
    }

    public void showHistory(){
        System.out.println("Name owner - " + nameOwner);
        System.out.println("Number account - " + account);
        System.out.println("Balance - " + money);
        System.out.println("All history by acc");
        for (String s:history.getArchiveOperation()){
            System.out.println(s);
        }
    }
}
