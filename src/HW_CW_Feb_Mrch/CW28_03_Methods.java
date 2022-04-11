package HW_CW_Feb_Mrch;
//TASK1 - write a method that takes in a string and returns the number of consonants in the String.
//Input should be from the user.

import java.util.Scanner;

public class CW28_03_Methods {

    //METHOD FOR CONSONANT AND VOWEL COUNT THAT WILL PRINT BOTH VALUES BUT WILL RETURN CONSONANT COUNT
    public static int countConsonants(String str) {

        int countV = 0;
        int countC = 0;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                countV++;
            } else {
                countC++;
            }
        }
        System.out.println("Number of consonants in the String : " + countC);
        System.out.println("Number of consonants in the String : " + countV);

        return countC; //Java return one value per method, if multiple values required, return array[].
    }

    //MAIN
    public static void main(String[] args) {

        //SCANNER
        Scanner sc = new Scanner(System.in); // creating new Scanner object
        System.out.println("Please enter your String.");
        String userInput = sc.nextLine();

        userInput.toLowerCase();

        //PRINT
        System.out.println(countConsonants(userInput)); //calling method on userInput var
    }
}




/*
//TASK2 - method that takes an Array of numbers and return a maximum number in an Array. (Don't use Math.max method). Method should return an int.


import java.util.Arrays;
import java.util.Scanner;

public class HW_CW_Feb_Mrch.CW28_03_Methods {

    //METHOD FOR RETURNING MAX NUMBER IN AN ARRAY

    public static int findMax(int[] numbers) { // method that takes an Array of ints

        int maximum = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (maximum < numbers[i]) {
                maximum = numbers[i];
            }
        }
        return maximum;
    }


    //MAIN

    public static void main(String[] args) {

        //SCANNER
        Scanner sc = new Scanner(System.in); // creating new Scanner object
        System.out.println("Please enter how many numbers you would like to enter.");
        int n = sc.nextInt();
        System.out.println("Please enter your numbers.");

        //ARRAY TO STORE VALUES
        int[] arrNumbers = new int[n];

        //SORT AND STORE NUMBERS IN AN ARRAY
        for (int i = 0; i < arrNumbers.length; i++) { //traversing through the array of numbers set by the user
            arrNumbers[i] = sc.nextInt();
        }

        //PRINT
        System.out.println("You numbers entered are : " + Arrays.toString(arrNumbers)); //printing entered Array
        System.out.println("You max number is : " + findMax(arrNumbers)); // findMax() method
    }
}
 */



/*
//TASK3 - method accepts 3 params (double smallNumber, bigNumber, String operator). Based on the arithmetic operator passed,
//perform on of the following operations on the Small and Big number and return a result. Result should be double.

import java.util.Scanner;

public class HW_CW_Feb_Mrch.CW28_03_Methods {

    //METHOD TO RETURN A DOUBLE RESULT ON INPUT NUMBERS

    public static double calculatorMethod(double smallNumber, double bigNumber, String operator) {

        double result = 0;

        switch (operator) { //using switch statement as only one condition is true and there will be no loops or if statements due to previously stated requirements

            //+
            case "+":
                result = smallNumber + bigNumber;

                // uncomment print statements to provide unique print text for each of the cases
                //System.out.println("Sum is " + result);
                break;

            // -
            case "-":
                result = smallNumber - bigNumber;
                //System.out.println("Minus is" + result);
                break;

            // *
            case "*":
                result = smallNumber * bigNumber;
                //System.out.println("Multiplication is " + result);
                break;

            // /
            case "/":
                result = smallNumber / bigNumber;
                //System.out.println("Division is " + result);
                break;

            // %
            case "%":
                result = smallNumber % bigNumber;
                //System.out.println("Modulo is " + result);
                break;

            //default statement if switch condition is not met -> input data i snot valid
            default:
                //System.out.println("Invalid input data, please choose correct operator!");
                break;
        }
        return result;
    }

    //MAIN
    public static void main(String[] args) {

        String operator1; //variable operator
        double num1;  //input and result variables
        double num2;

        //SCANNER
        Scanner input = new Scanner(System.in); //Scanner class object to be used for user input
        System.out.println("Enter first number"); //asking user for number input
        num1 = input.nextDouble();

        System.out.println("Enter second number");//asking user for second number input
        num2 = input.nextDouble();

        System.out.println("Please input arithmetic operator: +, -, *, / or %"); //asking user for an arithmetic operator input
        operator1 = input.next();


        //PRINT
        System.out.println("Your result is " + calculatorMethod(num1, num2, operator1));
    }
}
 */

