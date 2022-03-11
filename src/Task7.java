/*
Exercise 7

Write a program that takes a positive integer N - n (int) from the user,
and then displays all powers of the number 2 in the console that are not greater than the number given (each number should be displayed in new line.
For example, for the number 71 the program should write in the console the numbers: 1 2 4 8 16 32 64, in new line each.
Get the data from the user in the console using the Scanner class.
*/

//program will take positive int from the user and then will calculate and will output all powers of the number 2 that will be less than number given by the user.

import java.util.Scanner;

public class Task7 {
    //MAIN
    public static void main(String[] args) {

        Scanner takeInt = new Scanner(System.in); // creating new Scanner object

        //INPUT NUMBER FROM USER
        System.out.println("Please insert positive number.");
        int n = takeInt.nextInt();
        //System.out.println(n);

        //CALCULATING AND DISPLAYING ALL POWER OF NUMBER 2 IN THE CONSOLE THAT ARE NOT GREATER THAT NUMBER GIVEN
        if (n == 0) { //Provide user with ERROR msg and response code if 0 is received.
            System.out.println("0 could not be inserted. Please enter other number in order to proceed.");
        } else {
            int i;
            for (i = 1; i < n; i *= 2) { //traverse and multiply numbers from the range by 2.
                System.out.println(i);
            }
        }
    }
}
