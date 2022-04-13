package bank_account;

import java.util.Scanner;

public class Account {

    String name;
    private double balance;
    private int acctNum;


    //GETTERS
    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public int getAcctNum() {
        return acctNum;
    }

    //ACCOUNT CONSTRUCTOR
    public Account(String name, double balance, int acctNum) {
        this.name = name;
        this.balance = balance;
        this.acctNum = acctNum;
    }


    //METHOD TO GET ACCOUNT DATA
    public void getAccountData() {
        this.name = getName();
        this.acctNum = getAcctNum();
        this.balance = getBalance();
        System.out.println(name + " , your account number is : " + acctNum + ". Your current account balance is " + balance + ".");
    }


    //METHOD TO DEPOSIT FUNDS (ATM/ INTERNAL DEPOSIT)
    public void depositFunds() {
        this.name = getName();
        this.balance = getBalance();
        this.acctNum = getAcctNum();

        //Scanner
        Scanner sc = new Scanner(System.in); // creating new Scanner object
        System.out.println("Please enter amount you would like to deposit into your account.");
        double amountToDeposit = sc.nextDouble();

        if (amountToDeposit > 0) {
            balance += amountToDeposit;
            System.out.println(name + " you have successfully deposited " + amountToDeposit + " USD into your account with number " + acctNum + ".");
            System.out.println("Your current account balance is " + balance + " USD.");
        } else {
            System.out.println("ERROR! Amount to deposit is not valid.");
        }
    }


    //METHOD TO WITHDRAW FUNDS (ATM)
    public void withdrawFunds() {
        this.name = getName();
        this.balance = getBalance();
        this.acctNum = getAcctNum();

        //Scanner
        Scanner sc = new Scanner(System.in); // creating new Scanner object
        System.out.println(name + " please enter amount you would like to withdraw from your account.");
        double amountToWithdraw = sc.nextDouble();

        if (amountToWithdraw > 0 && amountToWithdraw <= balance) {
            balance -= amountToWithdraw;
            System.out.println(name + " you have successfully withdrawn " + amountToWithdraw + " USD from your account with number " + acctNum + ".");
            System.out.println("Your current account balance is " + balance + " USD.");
        } else {
            System.out.println("ERROR! Amount to deposit is not valid.");
        }
    }


    //METHOD TRANSFER FUNDS TO ANOTHER PERSONS ACCOUNT
    public void transferFunds(Account name, double amountToTransfer) {
        if (balance >= amountToTransfer) {
            name.balance += amountToTransfer;
            balance -= amountToTransfer;
            System.out.println(name + ", you have transferred " + amountToTransfer + " USD. To the following account number " + getAcctNum() + ".");
        } else {
            System.out.println("ERROR! Incorrect data entered or your current account balance is not sufficient for current transfer!");
        }

    }

}







