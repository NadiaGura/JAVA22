package HW_CW_Feb_Mrch;
//Tasks.Task1 - Ask for int as a user input. Store and print numbers in a range that even numbers will be stored and displayed first and then odd numbers.

import java.util.Arrays;
import java.util.Scanner;

public class CW16_03 {


    //MAIN
    public static void main(String[] args) {

        //SCANNER
        Scanner input = new Scanner(System.in); //Scanner class object to be used for user input

        System.out.println("Please enter how many numbers you would like to add.");
        int n = input.nextInt(); // asking user for an Array size

        System.out.println("Please enter your numbers."); //asking user for input

        //ARRAY TO STORE VALUES
        int[] arrInts = new int[input.nextInt()];


        //SORT AND STORE NUMBERS IN AN ARRAY
        for (int i = 0; i <= arrInts.length; i++) { //traversing through the array of numbers set by the user
            arrInts[i] = input.nextInt();
        }

        int[] arr2 = new int[arrInts.length];
        int count = 0;
        for(int i = 0; i < arrInts.length; i++){
            if(arrInts[i] %2 ==0){
                count++;
                arr2[count-1] = arrInts[i];
            }
        }
        for(int i = 0; i < arrInts.length; i++) {
            if (arrInts[i] % 2 != 0) {
                count++;
                arr2[count - 1] = arrInts[i];
            }
        }
        System.out.println("Sorted array : " + Arrays.toString(arr2));
    }
}
//
//            int evenCount = 0;
//            int oddCount = 0;
//
////SEPARATE ODD AND EVEN NUMBERS
//
//            if (arrInts[i] % 2 == 0) { // even
//                //arrInts[i] = input.nextInt();
//                evenCount++;
//                //arrInts[0]++;
//                System.out.println("Even numbers : " + arrInts[0]);
//            } else {
//                // arrInts[i] = input.nextInt();
//                oddCount++;
//                //arrInts[1]++;
//                System.out.println("Odd numbers : " + arrInts[1]); // if number is odd print it into the console
//            }
//          int [] evenNumbers = new int[evenCount];
//            int [] oddNumbers = new int[oddCount];
//
//            for(int i = 0; i < arrInts.length; i++){
//                int evenIndex = 0;
//                int oddIndex = 0;
//                if(arrInts[i] % 2 ==0 ){
//                    evenNumbers[evenIndex] = arrInts[i];
//                    evenIndex++;
//                } else if (arrInts[i] % 2 != 0){
//                    oddNumbers[oddIndex] = arrInts[i];
//                    oddIndex++;
//                }




//
//        //TASK2 - request numbers from user. Return second largest number.
//
//        //SCANNER
//        Scanner input = new Scanner(System.in); //Scanner class object to be used for user input
//
//        System.out.println("Please enter how many numbers you would like to enter.");
//        int n = input.nextInt(); // asking user for an Array size
//        System.out.println("Please enter your numbers."); //asking user for input
//
//        //ARRAY TO STORE VALUES
//        int[] arr = new int[n]; // creating an Array with n elements
//
//
//        int first = 0;
//        int secondLargest = 0;
//
//        //ADD ELEMENTS INTO ARRAY AND FIND SECOND BIGGER NUMBER
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = input.nextInt(); // storing inputted elements in an Array
//
//            //find second bigger number
//            if(first<arr[i]){
//                secondLargest=first;
//                first=arr[i];
//            }
//            else if(secondLargest<arr[i]){
//                secondLargest=arr[i];
//            }
//        }
//         //Array.sort(arr);
//        //PRINT
//        System.out.println("Your numbers are : " + Arrays.toString(arr));
//        System.out.println("Second largest number : " + secondLargest);

/*
        //TASK3 - In a list of numbers entered by the user check whether there are no multiples by 3.

        //SCANNER
        Scanner input = new Scanner(System.in); //Scanner class object to be used for user input

        System.out.println("Please enter how many numbers you would like to enter.");
        int n = input.nextInt(); // asking user for an Array size
        System.out.println("Please enter your numbers."); //asking user for input

        //ARRAY TO STORE VALUES
        int[] arr = new int[n]; // creating an Array with n elements


        //ADD ELEMENTS INTO ARRAY AND FIND IF THERE ARE MULTIPLIES BY 3
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt(); // storing inputted elements in an Array

            if (arr[i] % 3 == 0){
                System.out.println("Number is multiplier of 3. Number is " + arr[i]);
            }else{
                System.out.println("Number is not a multiplier to 3.");
            }
            //System.out.println("Your numbers are : " + Arrays.toString(arr));
        }
        System.out.println("Your numbers are : " + Arrays.toString(arr));
    }
}


*/