package HW_CW_Feb_Mrch;

import java.util.Scanner;


//TASK1 -  Using recursion, write a method that takes a number as a parameter and
//returns the total sum between one and that number;
//upToNumber(8) -> 1 + 2 + ... + 8

public class HW30_03_Recursion {

    //METHOD TO RETURN SUM OF NUMBERS USING RECURSION

    public static int sumNumber(int a) {

//        //method using iteration (without recursion)
//        int sum = 0;
//        for (int i = 1; i <= a; i++) {
//            sum += i;
//        }
//        return sum;

        if (a == 1) {   //base case
            return 1;
        }
        return a + sumNumber(a - 1);

    }

    //MAIN

    public static void main(String[] args) {

        //SCANNER
        Scanner sc = new Scanner(System.in); // creating new Scanner object
        System.out.println("Please enter your number.");
        int number = sc.nextInt();


        //PRINT

        //for method using iteration
        // sumNumber(number);   //calling method on pass1 and pass2 var

        int sum = sumNumber(number);
        System.out.println(sum);
    }
}



/*
//TASK2 - Using recursion, write a method that tasks a string as a parameter and returns the reverse of the string.

import java.util.Scanner;

public class HW_CW_Feb_Mrch.HW30_03_Recursion {

    //METHOD TO REVERSE STRING USING RECURSION

    public static String reversedString(String a) {

        if ((a.isEmpty()) || (a == null)) {   // base case if String is empty or null will return empty String
            return a;
        }
        return reversedString(a.substring(1)) + a.charAt(0); //reversing String by char index
    }

    //MAIN

    public static void main(String[] args) {

        //SCANNER
        Scanner sc = new Scanner(System.in); // creating new Scanner object
        System.out.println("Please enter your String.");
        String input = sc.nextLine();


        //PRINT
        System.out.println(input + " spelled backwards is  " + reversedString(input));

    }
}
*/

