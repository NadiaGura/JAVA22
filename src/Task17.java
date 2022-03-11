/*
Exercise 17

Write a program that checks if the brackets are correctly matched in the user-specified arithmetic expression.
The expression is given as a single string.
If the brackets are correctly paired, the program should write to the console the message:  "OK" .
Otherwise, the program should write to the console the message: "Incorrect pairing of brackets."

• Example a:  "2 * (3.4 - (-7) / 2) * (a-2) / (b-1)))", result: "Incorrect pairing of brackets"
• Example b: "(2 * (3.4 - (-7) / 2) * (a-2) / (b-1))" result: "OK"
• Example c: ") 2 * 4 (" result: "Incorrect pairing of brackets"

Get the data from the user in the console using the Scanner class.
 */

import java.util.Scanner;
//program will check correct pairing of brackets based on the start and end of the statement
public class Task17 {
    //MAIN
    public static void main(String[] args) {

        //SCANNER
        Scanner sc = new Scanner(System.in); // create new Scanner class object
        System.out.println("Please enter your arithmetic expression below.");
        String inputBrackets = sc.nextLine(); // using nextLine as in accordance with the requirements arithmetic expression shall be entered as String - Line

        //CHECK IF BRACKETS ARE PAIRED CORRECTLY
        if (inputBrackets.startsWith("(") && inputBrackets.endsWith(")")) {
            System.out.println("OK");
        } else {
            System.out.println("Incorrect pairing of brackets.");
        }
    }
}
