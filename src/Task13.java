/*
Exercise 13

        Write a program that reads the text entered by the user, and then:
        1. checks if the word "Java" appears in the text - if so, it prints the message "Found Java" in the console,
        2. checks if the text starts with the word "Java" - if so, it prints the message "Starts with Java" in the console,
        3. check if the text ends with the word "Java" - if so, it prints the message "Ends with Java" in the console,
        4. checks if the text equals the word "Java" - if so, prints the message "Equals Java" in the console,
        5. prints the index of the first occurrence of the word "Java" in the text in the console.
        For example, for the text "Java", the program should write in the console:
        • Found Java
        • Starts with Java
        • Ends with Java
        • Equals Java •0

        and for the text "A java course from scratch is the best way to learn Java", the program should write in the console:
        • Found Java
        • Ends with Java • 52

        Get the data from the user in the console using the Scanner class.
*/

import java.util.Scanner;

//program will check inputted String pattern and will print String into the console if particular conditions are met
public class Task13 {
    //MAIN
    public static void main(String[] args) {

        //ASKING FOR USER INPUT
        Scanner sc = new Scanner(System.in); // create new Scanner class object
        System.out.println("Please enter you text below.");
        String inputText = sc.nextLine();

        //CONDITIONS FOR TEXT OUTPUT

        if (inputText.startsWith("Java")) { //check if String startsWith() "Java"
            System.out.println("Starts with Java.");
        }
        if (inputText.endsWith("Java")) { //check if String endsWith() "Java"
            System.out.println("Ends with Java.");
        }
        if (inputText.equals("Java")) { //check if String equals() to "Java"
            System.out.println("Equals Java.");
        }
        if (inputText.contains("Java")) { // check if String containts "Java", if true -> print indexOf() first occurence of "Java" String
            System.out.println("Found Java " + inputText.indexOf("Java"));

        }
    }
}