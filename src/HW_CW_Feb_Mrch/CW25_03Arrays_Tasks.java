package HW_CW_Feb_Mrch;/*
TASK1 - program will take weight and height of 5 people from the user and return the average BMI of the group.

TASK2 - given a String from the user return the character and count of the character that occurs most in the String.

Tasks.Task3 - ["Bananas", "Bread", "Fish"] cost of the items is the following [12, 5,10], your cash is 20 USD. Which of the items can you safely
buy without extra money. Priority - Bananas - least, Fish - second, Bread - First.
You can buy --- and --- and you have --- USD left.

Tasks.Task4 (Date) - receive year, month, day from the user separately. Determine if date is a magic date (m * d = 1 digit number that matches the last digits of the year or m*d is a 2-digit number
that matches last 2 digits of the year || m* d is a 3-digit number that matches last 3 digits of the year.)
 */

//TASK1 - program will take weight and height of 5 people from the user and return the average BMI of the group. BMI = weight / height*height

import java.util.Arrays;
import java.util.Scanner;

public class CW25_03Arrays_Tasks {

    //MAIN
    public static void main(String[] args) {

        //SCANNER

        Scanner sc = new Scanner(System.in); // creating new Scanner object
        System.out.println("Please enter how many people you would like to check.");
        int n = sc.nextInt();
        System.out.println("Please enter height for " + n + " persons in meters.");
        double height = sc.nextDouble();
        System.out.println("Please enter weight for " + n +  " persons in kg.");
        double weight = sc.nextDouble();

        //ARRAY TO STORE VALUES
        double[] arrHeight = new double[n];
        //double[] arrWeight = new double[n];

        //SORT AND STORE NUMBERS IN AN ARRAY
        for (int i = 0; i < n; i++) { //traversing through the array of numbers set by the user
            arrHeight[i] = sc.nextDouble();
        }
        System.out.println(Arrays.toString(arrHeight));

        double[] arrWeight = new double[n];
        for (int j = 0; j < n; j++) { //traversing through the array of numbers set by the user
            arrWeight[j] = sc.nextDouble();
        }
        System.out.println(Arrays.toString(arrWeight));

        //CALCULATING AVERAGE HEIGHT AND WEIGHT, BMI
        double sumHeight = 0;
        double sumWeight = 0;
        double bmi = 0;

        for(int i = 0; i <n; i++){
            sumHeight +=arrHeight[i];
        }

        double avHeight = sumHeight/n;
        System.out.println("Average height : " + avHeight);

        for(int i = 0; i <n; i++){
            sumWeight +=arrWeight[i];
        }
        double avWeight = sumWeight/n;
        System.out.println("Average weights : " + avWeight);

        bmi = avWeight/avHeight*avHeight;
        System.out.println("BMI : " + bmi);

    }
}

