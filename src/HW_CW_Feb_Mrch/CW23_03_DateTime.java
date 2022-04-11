package HW_CW_Feb_Mrch;
//TASK1 - program will calculate users age based on the date of birth entered by the user

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class CW23_03_DateTime {

    //MAIN
    public static void main(String[] args) {

        //SCANNER

        Scanner sc = new Scanner(System.in); // creating new Scanner object
        System.out.println("Please enter your date of birth: yyyy-mm-dd.");
        String dob = sc.nextLine();

        //CALCULATE DOB

        LocalDate d1 = LocalDate.now();
        LocalDate d2 = LocalDate.parse(dob);// parse String date format into LocalDate format

        int age = Period.between(d2,d1).getYears(); //using Period class to calculate age as a period in years between two dates

        System.out.println("If you are born " + dob + " you are now " + age + " years old.");
    }
}

/*
//TASK2 - program will calculate number of days between two years (beginning of each year is an input)

import java.time.LocalDate;
import java.util.Scanner;
import static java.time.temporal.ChronoUnit.DAYS;

public class HW_CW_Feb_Mrch.CW23_03_DateTime {

    //MAIN
    public static void main(String[] args) {

        //SCANNER

        Scanner sc = new Scanner(System.in); // creating new Scanner object
        System.out.println("Please enter first year: yyyy-mm-dd.");
        String year1 = sc.nextLine();
        System.out.println("Please enter second year: yyyy-mm-dd.");
        String year2 = sc.nextLine();

        //CALCULATE DAYS METHOD1

        LocalDate firstYear = LocalDate.parse(year1); //parsing to LocaleDate format
        LocalDate secondYear = LocalDate.parse(year2);

        long days = DAYS.between(firstYear, secondYear);
        long days2 = Math.abs(DAYS.between (firstYear, secondYear));

        //CALCULATE DAYS METHOD2

//        LocalDate firstYear = LocalDate.of(1999, Month.JANUARY, 1);
//        LocalDate secondYear = LocalDate.of(2000, Month.JANUARY, 1);
//
//        long days = ChronoUnit.DAYS.between(firstYear, secondYear);

        //PRINT

        System.out.println("First year : " + firstYear);
        System.out.println("Second year : " + secondYear);
        System.out.println("Number of days between " + firstYear + " and " + secondYear + " is " + days + " days.");
        System.out.println("Number of days between " + firstYear + " and " + secondYear + " is " + days2 + " days.");
    }
}
 */