/*
Exercise 19

Write a method that accepts the date format and date as String parameters and returns a LocalDate class object.

 */

import java.time.LocalDate;
import java.util.Scanner;

//converting String date into LocalDate class object.
//LocalDate - immutable class with the following format yyyy-mm-dd
public class Task19 {
    //MAIN
    public static void main(String[] args) {

        //SCANNER
        Scanner sc = new Scanner(System.in); // create new Scanner class object
        System.out.println("Please enter you date below.");
        String date = sc.nextLine(); // using nextLine as user might input text

        //CONVERTING DATE FORMAT INTO LocalDate format
        LocalDate newDate = LocalDate.now(); //creating LocalDate object set to now()
        System.out.println("Current date is " + newDate);
    }
}