import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

//TASK1 - Write a Java program to get year and months between two dates.

public class HW21_03_DateTime {

    //MAIN
    public static void main(String[] args) {

        //SCANNER

        Scanner sc = new Scanner(System.in); // creating new Scanner object
        System.out.println("Please enter first date : yyyy-mm-dd."); // yyyy-mm-dd LocalDate Format
        String date1 = sc.nextLine();
        System.out.println("Please enter second date : yyyy-mm-dd.");
        String date2 = sc.nextLine();

        //CALCULATE YEARS/MONTHS/DAYS DIFFERENCE

        LocalDate d1 = LocalDate.parse(date1); // parse String date format into LocalDate format
        LocalDate d2 = LocalDate.parse(date2);

        long yearDifference = Period.between(d1, d2).getYears(); // using Period class to calculate difference between two LocalDate instances
        long monthDifference = Period.between(d1, d2).getMonths();
        long daysDifference = Period.between(d1, d2).getDays();


        //PRINT
        System.out.println("Days difference between " + d1 + " and " + d2 + " : " + yearDifference + " year/s difference.");
        System.out.println("Months between " + d1 + " and " + d2 + " : " + monthDifference + " month/s difference.");
        System.out.println("Days between " + d1 + " and " + d2 + " : " + daysDifference + " days/s difference.");
    }
}




/*

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

//TASK2 - Write a Java program to calculate the difference between two dates in days.

public class HW21_03_DateTime {

    //MAIN
    public static void main(String[] args) {

        //SCANNER

        Scanner sc = new Scanner(System.in); // creating new Scanner object
        System.out.println("Please enter first date : yyyy-mm-dd."); //LocalDate Format
        String date1 = sc.nextLine();
        System.out.println("Please enter second date : yyyy-mm-dd.");
        String date2 = sc.nextLine();

        //CALCULATE DIFFERENCE

        LocalDate d1 = LocalDate.parse(date1); // parse String date format into LocalDate Format
        LocalDate d2 = LocalDate.parse(date2);

        long daysDifference = Period.between(d1, d2).getDays();

        //PRINT
        System.out.println("Days difference between " + d1 + " and " + d2 + " : " + daysDifference + " days difference.");
    }
}
 */