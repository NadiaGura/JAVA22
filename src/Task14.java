/*
Exercise 14

        Write a program that reads the text entered by the user, and then for that text converts all comma occurrences to the text "-MAKARENA" and displays in the console.
        For example, for the text
        , The program should write in the console
        "Lorem ipsum dolor sit amet, consectetur
        adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore
        magna aliqua."

        "Lorem ipsum
        dolor sit amet-MAKARENA consectetur adipiscing elit-MAKARENA sed
        .

        Get the data from the user in the console using the Scanner class.
*/

import java.util.Scanner;

public class Task14 {
    //MAIN
    public static void main(String[] args) {

        //ASKING FOR USER INPUT
        Scanner sc = new Scanner(System.in); // create new Scanner class object
        System.out.println("Please enter you text below: ");

        String input = sc.nextLine(); //method continues to search to the end of the line

        //CONVERTING COMMA TO MAKARENA
        String input2 = input.replace(",", "-MAKARENA");
        System.out.println(input2);
    }
}
