package HW_CW_Feb_Mrch;/*
Tasks.Task1 -  Write a program that receives some numbers based on the user’s choice and then returns the largest number of the ones the user entered.

Tasks.Task2 -  Write a program that accepts a String from the user and returns an array of integers representing the counts of each vowel in the String.
The array returned by your method should hold 5 elements: the first is the count of As, the second is the count of Es, the third Is, the fourth Os, and the fifth Us.
*/
import java.util.Arrays;
import java.util.Scanner;

//Tasks.Task1 - program will receive an int as a user input and will return the largest number entered.

public class HW14_03Arrays {

    //MAIN
    public static void main(String[] args) {

        //SCANNER CLASS
        Scanner input = new Scanner(System.in); //Scanner class object to be used for user input

        System.out.println("Please enter how many numbers you would like to enter.");
        int n = input.nextInt(); // asking user for an Array size

        System.out.println("Please enter your numbers."); //asking user for input


        //ARRAY TO STORE VALUES
        int[] array = new int[n]; // creating an Array with n elements

        int largest = array[0]; // creating variable for storing largest number

        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt(); // storing inputted elements in an Array

            if (array[i] > largest) { //identify largest number
                largest = array[i];
            }
        }

        //PRINT
        System.out.println("Number of elements you've entered : " + n);
        System.out.println("Your numbers are : " + Arrays.toString(array));
        System.out.println("Largest element entered is  : " + largest);
    }
}



/*
import java.util.Arrays;
import java.util.Scanner;

//TASK2 - Program will Ask for user input as a String, count all vowels in String -> will store them in an Array -> will print vowel count.

public class HW_CW_Feb_Mrch.HW14_03Arrays {

    //MAIN
    public static void main(String[] args) {

        //SCANNER CLASS
        Scanner input = new Scanner(System.in); //Scanner class object to be used for user input
        System.out.println("Please enter your word."); //asking user for input
        String enter = input.nextLine().toLowerCase();

        //ARRAY TO STORE VALUES
        int[] arrayVowels = new int[5]; // creating an Array to store number for 5 vowels

        for (int i = 0; i < enter.length(); i++) {
            char vowel = enter.charAt(i);

            if (vowel == 'a') {
                arrayVowels[0]++;
            } else if (vowel == 'o') {
                arrayVowels[1]++;
            } else if (vowel == 'u') {
                arrayVowels[2]++;
            } else if (vowel == 'e') {
                arrayVowels[3]++;
            } else if (vowel == 'i') {
                arrayVowels[4]++;
            }
        }

        //PRINT
        System.out.println("You String contains " + arrayVowels[0] + " 'a' vowels.");
        System.out.println("You String contains " + arrayVowels[1] + " 'o' vowels.");
        System.out.println("You String contains " + arrayVowels[2] + " 'u' vowels.");
        System.out.println("You String contains " + arrayVowels[3] + " 'e' vowels.");
        System.out.println("You String contains " + arrayVowels[4] + " 'i' vowels.");
    }
}
*/