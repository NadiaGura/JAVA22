package HW_CW_Feb_Mrch;
//TASK1 - method compares two Strings as passwords and compares them on equality (returns boolean)

import java.util.Scanner;

public class CW30_03_Methods {

    //METHOD TO COMPARE STRINGS. RETURNS BOOLEAN

    public static boolean checkEquals(String a, String b) {

        if(a.equalsIgnoreCase(b) == true){
            System.out.println("Your password is correct.");
        }else{
            System.out.println("Your password is NOT correct.");
        }
        return a.equalsIgnoreCase(b);
    }


    //MAIN

    public static void main(String[] args) {

        //SCANNER
        Scanner sc = new Scanner(System.in); // creating new Scanner object
        System.out.println("Please enter password.");
        String pass1 = sc.nextLine();
        System.out.println("Please repeat password.");
        String pass2 = sc.nextLine();


        //PRINT
        checkEquals(pass1, pass2);//calling method on pass1 and pass2 var
    }
}


/*
//TASK2 - method to calculate simple interest and return it. Simple interest = initialBalance(1 + annualInterestRate* time) time in years.

import java.util.Scanner;

public class HW_CW_Feb_Mrch.CW30_03_Methods {

    //METHOD TO CALCULATE SIMPLE INTEREST

    public static double simpleInterest(double initialBalance, double annInterestRate, double years) {

        //double result = initialBalance *  (annInterestRate * years);
        double result = (initialBalance * annInterestRate * years)/100;
        return result;
    }

    //MAIN

    public static void main(String[] args) {

        //SCANNER
        Scanner sc = new Scanner(System.in); // creating new Scanner object
        System.out.println("Enter your Initial Balance.");
        double balance = sc.nextDouble();
        System.out.println("Enter your Interest Rate.");
        double r = sc.nextDouble();
        System.out.println("Enter your time period in years.");
        double t = sc.nextDouble();


        //PRINT
        System.out.println("Your Simple Interest is " + simpleInterest(balance, r, t) + " USD on a loan in " + t + " years."); //calling method on balance, r, t var
    }
}
*/

/*
//TASK3 - method to accept int and return whether that int is prime.

import java.util.Scanner;

public class HW_CW_Feb_Mrch.CW30_03_Methods {

    //METHOD TO IDENTIFY PRIME NUMBER

    public static boolean checkPrime(int a) {

        if (a <= 1) {
            System.out.println(a + " is NOT prime number.");
            return false;
        }
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                System.out.println(a + " is NOT prime number.");
                return false;
            }
        }
        System.out.println(a + " is prime number.");
        return true;
    }


    //MAIN

    public static void main(String[] args) {

        //SCANNER
        Scanner sc = new Scanner(System.in); // creating new Scanner object
        System.out.println("Please enter your number.");
        int number = sc.nextInt();

        //CALLING METHOD
        checkPrime(number);   //calling method on number var
    }
}
 */