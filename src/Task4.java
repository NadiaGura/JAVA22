/*
Exercise 4
        Write a program which, based on the variables: amount -
        (double) and number of installments - numberOfInstallments(int), will
       calculate the monthly loan installment and write it to the console. The parameters have restrictions:

        • the loan amount must be between 100.00 and 10,000.00,
        • the number of installments must be between 6 and 48.

        If the loan amount exceeds the acceptable range, the loan amount should be set at 5,000.00. If the number of installments exceeds the acceptable range, the number of installments should be set to 36.
        The calculated monthly installment should also include interest. To simplify the calculations, assume that you add X percent to the loan amount depending on the number of installments:

        • 6-12 installments - 2.5%,
        • 13-24 installments - 5.0%,
        • 25-48 installments - 10.0%,

        and then calculate the installment amount based on the number of installments.
        Get the data from the user in the console using the Scanner class.
*/

import java.util.Scanner;

//class will calculate monthly installment method getting user data from Scanner class (amount and monthly installment input).
//formula for calculating monthly payment = (amount * interest rate)/ numberIfInstallments
public class Task4 {

    //MAIN
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in); //declaring Scanner class object

        // ASKING USER TO INPUT LOAN AMOUNT
        System.out.println("Please enter your loan amount.");
        double amount = userInput.nextDouble();
        //System.out.println(amount);

        if (amount < 100.00) { // loans < 100 could not be granted, provide with ERROR msg and response code.
            System.out.println("Loan amount is too small. Please enter an amount that is bigger than 100.00.");
        } else if (amount > 10000.00) { //loans > 10 000.00 will be assigned and calculated as 5 000.00 loan. Provide user with response msg.
            amount = 5000.00;
            System.out.println("Loan amount is greater than allowed amount, your amount will be set to: ");
            System.out.println(amount);
        }


        //ASKING USER TO INPUT INSTALLMENT DATA
        System.out.println("Please enter your monthly installment quantity.");
        int numberOfInstallments = userInput.nextInt();
        //System.out.println(numberOfInstallments);

        if (numberOfInstallments < 6) { //min installment amount 6 months. Provide user with ERROR msg and response code.
            System.out.println("ERROR!" + '\n' + "Number of installments is below the allowed limit, please choose appropriate amount from 6 to 48 months");
        } else if (numberOfInstallments > 48) {// max installment amount 48 months. If above, set numberOfInstallments to 36. Provide user with response msg.
            numberOfInstallments = 36; // installments set to default 3 years
            System.out.println("Number of monthly installments is not valid, amount will be set to ");
            System.out.println(numberOfInstallments);
        }


        //CALCULATING INTEREST RATE
        System.out.println("Your interest rate is:");
        double interestRate = 0;

        if (numberOfInstallments < 6) { // numberOfInstallments below min amount, provide user with response msg.
            System.out.println("Please enter appropriate installment amount, unable to calculate interest rate");
        } else if (numberOfInstallments >= 6 && numberOfInstallments <= 12) { // interest rate set in accordance with task requirements
            interestRate = 1.025;
            System.out.println("2.5%");
        } else if (numberOfInstallments > 12 && numberOfInstallments <= 24) {
            interestRate = 1.05;
            System.out.println("5.0%");
        } else if (numberOfInstallments > 24 && numberOfInstallments <= 48) {
            interestRate = 1.1;
            System.out.println("10.0%");
        }


        //CALCULATING MONTHLY INSTALLMENT AMOUNT
        System.out.println("Your monthly payment:");
        double monthlyLoan = (amount * interestRate) / numberOfInstallments;
        System.out.println(monthlyLoan);

    }
}

