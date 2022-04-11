package HW_CW_Feb_Mrch;
//TASK1 - Ask for user input for a right-angled triangle. Calculate right-angled triangle area.

//import java.util.Scanner;
//
//public class HW_CW_Feb_Mrch.CW21_03_Math {
//
//    //MAIN
//    public static void main (String[] args){
//
//        //SCANNER
//        Scanner sc = new Scanner(System.in); // creating new Scanner object
//        System.out.println("Please enter side A.");
//        double a = sc.nextDouble();
//        System.out.println("Please enter side B.");
//        double b = sc.nextDouble();
//        System.out.println("Please enter side C.");
//        double c = sc.nextDouble();
//
//        //TRIANGLE AREA
//
//        double side = (a+b+c)/2;
//        double area = Math.sqrt(side*(side-a)*(side-b)*(side-c));
//
//        //PRINT
//        System.out.println("Your triangle area is : " + area);
//    }
//}


//TASK2 - program will return fibonacci sequence up to a specific length by the user.

//import java.util.Scanner;
//
//public class HW_CW_Feb_Mrch.CW21_03_Math {
//
//    //MAIN
//    public static void main (String[] args){
//
//        //SCANNER
//        Scanner sc = new Scanner(System.in); // creating new Scanner object
//        System.out.println("How many numbers you would like to display?");
//        int fibNum = sc.nextInt();
//
//        //FIBONACCI NUMBERS - SECOND NUMBER AS A SUM TO PREVIOUS NUMBER
//        int i =0;
//        int num1 = 0;
//        int num2 = 1; // second number is greater than the first one
//
//        //PRINT
//        System.out.println("Your numbers are : " );
//
//        while(i < fibNum){ //while number count is smaller than the amount entered by the user, sum two subsequent numbers
//
//            System.out.println(num1 + " ");
//
//            int sum = num1 + num2; // var sum equals to sum of two subsequent numbers
//            num1=num2;
//            num2=sum;
//            i++;
//
//        }
//    }
//}

//DATE
 // Date date = new Date();
//System.out.println(date);


//TASK - program will define whether the year inputted by the user is a leap year.

import java.time.YearMonth;
import java.util.Scanner;

public class CW21_03_Math {

    //MAIN
    public static void main(String[] args) {

        //SCANNER

        Scanner sc = new Scanner(System.in); // creating new Scanner object
        System.out.println("Please enter a year you would like to check.");
        int year = sc.nextInt();

        //YEAR MONTH CLASS. CHECK HOW MANY DAYS IS IN FEBRUARY IN ORDER TO DEFINE THE LEAP YEAR.

        YearMonth yearMonth = YearMonth.of(year, 2);
        int daysInFebruary = yearMonth.lengthOfMonth();
        System.out.println("In " + year + " year, in February there are " + daysInFebruary + " days.");

        //IF-ELSE STATEMENT. PRINT.

        if (daysInFebruary == 29) {
            System.out.println("Year " + year + "is a leap year.");
        } else {
            System.out.println("Year " + year + "is NOT a leap year.");
        }
    }
}

//TASK4 - program will return the number of amount of hours between two(o'clock) times entered by the user.

//import java.text.DateFormat;
//import java.text.SimpleDateFormat;
//import java.time.LocalDate;
//import java.util.Date;
//import java.util.Scanner;
//
//public class HW_CW_Feb_Mrch.CW21_03_Math {
//        //MAIN
//    public static void main(String[] args) {
//
//        //SCANNER
//        Scanner sc = new Scanner(System.in); // creating new Scanner object
//        System.out.println("Please enter your time.");
//        String time = sc.nextLine();
//
//        System.out.println("Please enter your second time.");
//        String time2 = sc.nextLine();
//
////        LocalDate localDate = LocalDate.now();
////        System.out.println("Local date is " + localDate);
//
//        DateFormat formatTime = new SimpleDateFormat("dd-mm-yyyy");
//       Date date = formatTime.parse(time);
//
//    }
//}

//        System.out.print("Enter the start hour: ");
//                String userStart = scanner.nextLine(); // 5:00 AM
//
//                System.out.print("Enter the end hour: ");
//                String userEnd = scanner.nextLine(); // 8:00 AM
//
//                // Get the value of the hours
//                int startHour = Integer.parseInt(userStart.split(":")[0]);
//                int endHour = Integer.parseInt(userEnd.split(":")[0]);
//
//                // If a time entered is in the morning assign it 12 else assign it 24
//                // to make it easy to compare numerically.
//                int amPmOne = userStart.split(" ")[1].equals("AM") ? 12 : 24;
//                int amPmTwo = userEnd.split(" ")[1].equals("AM") ? 12 : 24;
//
//                // subtract and find out the difference
//                int difference =(endHour+amPmTwo) - (startHour+amPmOne);
//                if (amPmOne < amPmTwo && startHour > endHour) difference +=12;
//
//
//        System.out.println(difference == 0 ? "No time has passed." : difference + " hours");