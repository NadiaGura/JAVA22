package HW_CW_Feb_Mrch;//MATH
//Tasks.Task1 - program will take base and height from user as an input and will calculate the area of triangle(0.5 * base * height)


//public class HW_CW_Feb_Mrch.CW18_03_Math_DateTime_Algr {
//
//    //MAIN
//    public static void main(String[]args){
//
//        //SCANNER
//        Scanner sc = new Scanner(System.in); // creating new Scanner object
//        System.out.println("Please enter base number.");
//        double base = sc.nextDouble();
//        System.out.println("Please enter height number.");
//        double height = sc.nextDouble();
//
//
//        double area = 0.5 * base * height;
//        System.out.println("Triangle area is : " + area);
//
//    }
//}


//TASK2 - program will accept a, b, c, from the user and will calculate a quadratic equation based on the data inputted.
//Quadratic formula x1 : (-b + squareroot(b ^ 2-(4 * a * c)) / x2: (-b - squareroot(b ^ 2 -(4 * a * c))

import java.util.Scanner;

public class CW18_03_Math_DateTime_Algr {

    //MAIN
    public static void main (String[] args){

        //SCANNER
        Scanner sc = new Scanner(System.in); // creating new Scanner object
        System.out.println("Please enter a.");
        double a = sc.nextDouble();
        System.out.println("Please enter b number.");
        double b = sc.nextDouble();
        System.out.println("Please enter c number.");
        double c = sc.nextDouble();

        //EQUATION
        double result = Math.pow(b,2) - 4 * a * c; //determinant value
        //System.out.println(result);
        double sqrt = Math.sqrt(result);

        //ROOT CALCULATION
        double root = 0;
        double root2 = 0;

        if(result == 0){
            double root0 = (-b + sqrt)/(2*a);
            System.out.println(root0);
        }else if (result > 0) { // if determ is greater > 0, apply corresponding formula
            root = (-b + sqrt)/(2*a);
            root2 = (-b - sqrt)/(2*a);
            System.out.println("First result : " + root + ". Second result : " + root2);
        }
    }
}

//TASK1 - Take numbers from user. Sort that each second element is greater than ints to left and right.
/*
import java.util.Arrays;

public class HW_CW_Feb_Mrch.CW18_03_Math_DateTime_Algr {

    //MAIN
    public static void main(String[] args) {

        //ARRAY
        int[] array = {3, 5, 9, 10, 7, 2, 1};
        System.out.println(Arrays.toString(array));
//        Arrays.sort(array);
//        System.out.println(Arrays.toString(array));


        //CHANGING ELEMENTS ORDER
        for (int i = 1; i < array.length; i += 2) {
//            for (int i = 1; i < array.length - 1; i += 2) {
            //check number preceding
            if(array[i-1] > array[i]){
                int temp = array[i-1]; // set to preceding number
                array[i-1] = array[i]; // set preceding value to current value
                array[i] = temp; //
            }
            
            //check for ascending index

            if (i + 1 < array.length && array[i+1] > array[i]) {
                int temp = array[i+1]; // set to preceding number
                array[i+1] = array[i]; // set preceding value to current value
                array[i] = temp; //
                }
            }
        System.out.println("Sorted Array : " + Arrays.toString(array));
//            int var = array[i]; // creating a temp variable
//            array[i] = array[i + 1]; // swapping second index element to first
//            array[i + 1] = var; // second index item now is at the index of the swapped element
        }
        //System.out.println(Arrays.toString(array));
    }

*/


