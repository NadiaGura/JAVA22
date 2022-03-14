/*
Exercise 16

Write a program that receives text from the user and then creates a string that is the inverted text and displays it in the console.
For example, for the text "Cat", the program should write the text "taC" in the console.
Get the data from the user in the console using the Scanner class.
 */

import java.util.Scanner;
//program will print inverted String received from the user
public class Task16 {
    //MAIN
    public static void main(String[] args) {

        //SCANNER
        Scanner sc = new Scanner(System.in); // create new Scanner class object
        System.out.println("Please enter you text below. Yor text will be reversed in the next line.");
        String inputText = sc.nextLine(); // using nextLine as user might input text

        //CREATING INVERSION USING STRING BUILDER CLASS
//        StringBuilder inversedString = new StringBuilder(inputText); // using StringBuilder as this class objects (Strings) can be modified
//        System.out.println(inversedString.reverse()); // using reverse() method to invert a String

        //CREATING INVERSION USING FOR LOOP ITERATION
        String invertedString = "";
        for (int i = inputText.length() - 1; i>=0; i--){ //iterating thorugh the lenght of the String
            invertedString = invertedString + inputText.charAt(i); // adding each letter(char)
        }
        System.out.println("Your word spelled backwards is - " + invertedString);
    }
}


