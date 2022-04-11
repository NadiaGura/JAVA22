package HW_CW_Feb_Mrch;
//TASK1 - Write a Java program to find maximum product of two integers in a given array of integers.
//Example:
//
//        Input :
//        nums = { 2, 3, 5, 7, -7, 5, 8, -5 }
//
//        Output:
//        Pair is (7, 8, Maximum Product: 56)

import java.util.Arrays;
import java.util.Scanner;
//program will take an input from user as an Array of Ints. Will identify two max numbers and will print out multiply result.
public class HW18_03_Arrays {

    //MAIN
    public static void main(String[] args) {

        //SCANNER
        Scanner input = new Scanner(System.in); //Scanner class object to be used for user input

        System.out.println("Please enter how many numbers you would like to add.");
        int n = input.nextInt(); // asking user for an Array size

        System.out.println("Please enter your numbers."); //asking user for input

        //ARRAY TO STORE VALUES
        int[] arrInts = new int[n];

        //SORT AND STORE NUMBERS IN AN ARRAY
        for (int i = 0; i < n; i++) { //traversing through the array of numbers set by the user
            arrInts[i] = input.nextInt();

        }

        //1ST SOLUTION

        Arrays.sort(arrInts); // sorting and Array in ascending order
        System.out.println(Arrays.toString(arrInts));
        //multiply largest numbers
        System.out.println("Multiplication result : " + arrInts[arrInts.length -1] * arrInts[arrInts.length -2]);




/*
        //2ND SOLUTION


        //CHECK FOR LARGEST AND SECOND LARGEST NUMBERS
        int largest1 = arrInts[0];
        int largest2 = arrInts[1];
        int temp = 0;

        if (largest1 < largest2) {
            temp = largest1;
            largest1 = largest2;
            largest2 = temp;
        }

        for (int i = 2; i < n; i++) {

            if (arrInts[i] > largest1) {
                largest2 = largest1;
                largest1 = arrInts[i];
            } else if (arrInts[i] > largest2 && arrInts[i] != largest1) {
                largest2 = arrInts[i];
            }
        }

        //PRINT
        System.out.println(Arrays.toString(arrInts));
        System.out.println("First largest number : " + largest1);    //Display the first largest
        System.out.println("Second largest number :  " + largest2);  //Display the second largest

        //MAXIMUM PRODUCT OF TWO INTEGERS
        System.out.println("Maximum product : " + largest1 * largest2);

 */
    }
}





/*
//TASK2 - Write a Java program to find minimum sub-array sum of specified size in a given array of integers.
// Example:
//
//        Input :
//        nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9,10}
//
//        Output:
//        Sub-array size: 4
//        Sub-array from 0 to 3 and sum is: 10

//TASK2 - program will take an int Array from user (Array and sub Array size) and will find minimum sub-array sum of specified size in a given array of integers.

import java.util.Scanner;

public class HW_CW_Feb_Mrch.HW18_03_Arrays {

    //MAIN
    public static void main(String[] args) {

        //SCANNER
        Scanner input = new Scanner(System.in); //Scanner class object to be used for user input

        System.out.println("Please enter how many numbers you would like to enter.");
        int n = input.nextInt(); // asking user for an Array size

        System.out.println("Please enter sub - array size .");
        int s = input.nextInt(); // asking user for an Array size

        System.out.println("Please enter your numbers."); //asking user for input

        //ARRAY TO STORE VALUES
        int[] arrInts = new int[n];

        //SORT AND STORE NUMBERS IN AN ARRAY
        for (int i = 0; i < n; i++) { //traversing through the array of numbers set by the user
            arrInts[i] = input.nextInt();
        }

        //creating temp var
        int minSum = Integer.MAX_VALUE;
        int res1 = 0;
        int res2 = 0;
        int res2Final = 0;

        //iterating through an array to sum sub-array for a defined sub-array size
        for (int i = 0; i < arrInts.length - 3; i++) {
            int sum = 0; // sum of an array

            for (int j = i; j < s + i; j++) {
                sum += arrInts[j];
            }
            if (sum < minSum) {
                minSum = sum;
                res1 = i;
                res2 = s + i;
                res2Final = res2 - 1;
            }
        }
        //PRINT
        System.out.println("Sub-array from index " + res1 + " to index " + res2Final + " sum of ints is " + minSum);
    }
}
*/