/*
Exercise 3

Write a program that, based on the variable: income (double), will calculate the amount of personal income tax due and write it to the console.
The tax is calculated according to the following rules:

        • up to 85,528.00 tax is 18% of the base minus 556.02,
        • from 85,528.00 tax is 14,839.02 + 32% of the surplus over 85,528.00.

Get the income from the user in the console using the Scanner class.
*/

import java.util.Scanner;

//program will calculate personal income tax based on user income input data and applicable tax rate base on the provided requirements.
public class Task3 {

    //MAIN
    public static void main(String[] args) {
        Scanner scanIncomeData = new Scanner(System.in); // creating a Scanner class object

        //INPUTTING PERSONAL INCOME DATA
        System.out.println("Please enter your annual income amount.");
        double income = scanIncomeData.nextDouble();
        //System.out.println(income);
        if (income <= 0) { // income could not be <= 0. Provide user with ERROR and response msg.
            System.out.println("ERROR!" + '\n' + "Income data is not valid, please enter valid personal annual income amount.");
        }

        //CALCULATING PERSONAL INCOME TAX BASED ON ANNUAL INCOME DATA AND TAX RATE
        double taxRate;
        double personalIncomeTax;
        if (income > 0 && income < 85528) { //calculating income tax on income until 85528
            taxRate = 0.18;
            System.out.println("Your income tax rate is 18%.");
            personalIncomeTax = income * taxRate;
            System.out.println("Your calculated personal income tax is " + personalIncomeTax + ".");

        } else if (income >= 85528) { //calculating income tax over 85528 • from 85,528.00 tax is 14,839.02 + 32% of the surplus over 85,528.00. => (32% on income - 85,528.00) + 14,839.02
            taxRate = 0.32;
            personalIncomeTax = (income - 85528) * taxRate + 14839.02;
            System.out.println("Your income tax rate is 32% on your surplus over base annual income + 14,839.02.");
            System.out.println("Your calculated personal income tax is " + personalIncomeTax + ".");

        }
    }
}

