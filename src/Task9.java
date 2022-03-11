/*Exercise 9

Write a program that retrieves an integer string from the user.
Downloading data ends with the number 0 (not included in the data).
Then, the program calculates the sum of the largest and smallest of the given numbers and their arithmetic average and prints them in the console.
For example, for a series of given numbers: 1, -4, 2, 17, 0, the program should write in the console the numbers: 13, 6.5.
Get the data from the user in the console using the Scanner class.
*/

//program will take String from the user using Scanner method. Downloaded data should ent with 0 (not included in the data).
// Program will calculate and print sums of smallest and largest numbers and average of smallest and largest number.

import java.util.Scanner;
public class Task9 {

    //MAIN
    public static void main(String[]args){

        Scanner takeNumber = new Scanner(System.in); // create new Scanner class object
       // System.out.println("Please enter your number.");
        //int n = takeNumber.nextInt();
        int n;

        //CONDITION FOR USER INPUT
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        //char choice;

        //do request user input while "calculate" is not entered
        do{
            System.out.println("Please enter your number.");
            n = takeNumber.nextInt();

            if(n > max){ //setting n as max if it is bigger than previous max number
                max = n;
            }
            if(n<min){ //setting n as min if it is smaller than previous min number
                min = n;
            }
            //System.out.println("Do you want to continue? Y/N?");
            //choice = takeNumber.next().charAt(0);

        }while( n != 0);
        //while(choice == 'Y' || choice == 'y');
        int sum = min + max;
        double average = (min+max)/2;

        System.out.println("Your largest number " + max);
        System.out.println("Your smallest number " + min);
        System.out.println("Calculating sum of the smallest and largest numbers " + sum);
        System.out.println("Calculating average of the smallest and largest numbers " + average);

    }
}
