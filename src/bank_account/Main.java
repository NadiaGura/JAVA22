package bank_account;
/*
Write a class called Account, which models a bank account of a customer,
is designed as shown in the following class diagram.
The methods credit(amount) and debit(amount) add or subtract the given amount to the balance.
The method transferTo(anotherAccount, amount) transfers the given amount from this Account to the given anotherAccount.
 */
public class Main {



        //MAIN
        public static void main(String[] args) {
            Account a = new Account("Mike", 10000,12345);
            Account b = new Account("Alex", 1000,67891);

            //calling Account class methods

            a.getAccountData();
            b.getAccountData();
            a.withdrawFunds();
            a.depositFunds();


            a.transferFunds(b, 5000);
            a.getAccountData();
            b.getAccountData();

        }
}
