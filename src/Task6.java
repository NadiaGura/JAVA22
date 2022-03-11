/*Exercise 6

 Write a program that takes from the user two integers A - a (int) and B - b (int),
 where A <B, and then calculates the sum of the sequence of numbers from A to B (A, A + 1, A + 2, ..., B)
 and prints it in the console. When the A<B condition is not met, the program exits by writing "Job completed" in the console.
 For example, for A = 4 and B = 11, the program should write the number 60 in the console.
 Get the data from the user in the console using the Scanner class.
*/

import java.util.Scanner;

//program will take two numbers from user. If certain condition is met, program will calculate and will output sum of the sequence of numbers.
public class Task6 {

    //MAIN
    public static void main(String[] args) {
        Scanner takeInt = new Scanner(System.in); // creating Scanner class object.

        //USER INPUT DATA VARIABLES
        System.out.println("Please insert first number.");
        int a = takeInt.nextInt();
        System.out.println("Please insert second number.");
        int b = takeInt.nextInt();

        int sum = 0;
        if (a < b) { // if required condition is met (a<b), calculate sum of the number range.
            int i;
            for (i = a; i >= a && i <= b; i++) {
                sum += i;
                //System.out.println(i);
            }
            System.out.println(sum);
        } else {
            System.out.println("Job completed.");
        }
    }
}
