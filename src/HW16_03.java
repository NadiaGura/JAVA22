/*
Task1 - You're given a string of words from the user.
You need to find the word "Nemo", and return a string like this: "I found Nemo at [the order of the word you find Nemo]!".
If you can't find Nemo, return "I can't find Nemo :(".

Task2 - Create a program that takes an array and returns the difference between the biggest and smallest numbers.

Task3 - Create a program that takes an array of Strings
(You can initialise the variable without user input) and checks if the last item matches the rest of the array concatenated together.
For example,  ["i", "love", "tesh", "ilovetesh"] will return true.
 */



//Task1 - program will request String input from a user. If String will contain "Nemo" -> print out "I found Nemo at [the order of the word you find Nemo]!".
//If "Nemo" is not found -> print out "I can't find Nemo :(".

import java.util.Scanner;

public class HW16_03 {

    //MAIN
    public static void main(String[] args) {

        //SCANNER
        Scanner sc = new Scanner(System.in); // creating new Scanner object
        System.out.println("Please insert your String.");
        String lookingForNemo = sc.nextLine();

        //CONDITION FOR SORTING STRING AND IDENTIFYING SUBSTRING
        if (lookingForNemo.contains("Nemo")) {
            System.out.println("I found Nemo at " + lookingForNemo.indexOf("Nemo") + " index.");
        } else {
            System.out.println("I can't find Nemo :(");
        }
    }
}


/*

//Task2 - program will take an array from user and will return the difference between the biggest and smallest numbers.

import java.util.Arrays;
import java.util.Scanner;

public class HW16_03 {
    //MAIN
    public static void main(String[] args) {

        //SCANNER
        Scanner input = new Scanner(System.in); //Scanner class object to be used for user input

        System.out.println("Please enter how many numbers you would like to enter.");
        int n = input.nextInt(); // asking user for an Array size
        System.out.println("Please enter your numbers."); //asking user for input

        //ARRAY TO STORE VALUES
        int[] arr = new int[n]; // creating an Array with n elements

        //var for smallest and largest numbers
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        //ADD ELEMENTS INTO ARRAY. IDENTIFY SMALLEST AND BIGGEST NUMBERS. CALCULATE DIFFERENCE BETWEEN SMALLEST AND LARGEST NUMBERS.
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt(); // storing inputted elements in an Array

            if (arr[i] < min) {  //identify smallest number
                min = arr[i];
            } else if (arr[i] > max) { //identify largest number
                max = arr[i];
            }
        }

        //PRINT
        System.out.println("Your numbers are : " + Arrays.toString(arr));
        System.out.println("Your smallest number is : " + min);
        System.out.println("Your largest number is : " + max);
        System.out.println("Difference between largest and smallest numbers is : " + (max - min));
    }
}
*/


/*

//Task3 - Create a program that takes an array of Strings
//(You can initialise the variable without user input) and checks if the last item matches the rest of the array concatenated together.
//For example,  ["i", "love", "tesh", "ilovetesh"] will return true.

import java.util.Arrays;
import java.util.Scanner;

public class HW16_03 {

    //MAIN
    public static void main(String[] args) {

        //SCANNER
        Scanner sc = new Scanner(System.in); //Scanner class object to be used for user input

        System.out.println("Please enter how many words you would like to enter.");
        int n = sc.nextInt(); // asking user for an Array size

        System.out.println("Please enter your words."); //asking user for input

        //ARRAY TO STORE VALUES
        String arr[] = new String[n]; // creating an Array with n elements


        //ADD ELEMENTS INTO AN ARRAY
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next(); // storing inputted elements in an Array
        }

        System.out.println("Your entered String Array elements are : " + Arrays.toString(arr));

        //DIVIDING LAST ELEMENT AND COMPARING IT TO CONCAT OF REST OF THE ELEMENTS (ELEMENTS FROM O TO PENULTIMATE ELEMENT INDEX)
        String concat = ""; //var for concatenated elements
        String last = arr[arr.length - 1]; // last index item var

        //traversing through an Array in order to concat elements
        for (int j = 0; j < arr.length - 1; j++) {
            concat += arr[j];
        }

        System.out.println("Concatenated elements from first to penultimate are : " + concat);
        System.out.println("Last Array String is : " + last);


        //COMPARING LAST ELEMENT WITH THE REST OF AN ARRAY ELEMENTS CONCAT TOGETHER
        if (concat.equalsIgnoreCase(last)) {
            System.out.println("Compared elements are equal.");
        } else {
            System.out.println("Compared elements are not equal.");
        }
    }
}
*/