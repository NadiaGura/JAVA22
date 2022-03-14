//HW Tasks from 9th March 2022 Lesson.

//Task1        Write a program that returns true interactively, if a user enters a string containing any of these characters: 'u', 'w', '6', 'i', 'b', 'q'
//Task2        Write a program that accepts a String from a user and prints an interactive response telling the user if the word is the same when spelt backwards. For example, bread when spelt backwards is daerb, which isn't quite the same.
//Task3        Write a program that accepts any of the primary colors as a String and returns the complimentary color of that color to the user.


//TASK1 program that returns true interactively, if a user enters a string containing any of these characters: 'u', 'w', '6', 'i', 'b', 'q'

import java.util.Scanner;
public class HW09_03 {

   // MAIN
    public static void main(String[] args) {

        //SCANNER CLASS
        Scanner input = new Scanner(System.in); //Scanner class object to be used for user input
        System.out.println("Please enter your word."); //asking user for input
        String enter = input.nextLine();

        //CONDITION IN ACCORDANCE WITH SET REQUIREMENTS. CHECK IF STRING CONTAINS PARTICULAR LETTER (SUBSTRING)

        if (enter.toLowerCase().contains("u")) {
            System.out.println("True");
        } else if (enter.toLowerCase().contains("w")) {
            System.out.println("True");
        } else if (enter.toLowerCase().contains("6")) {
            System.out.println("True");
        } else if (enter.toLowerCase().contains("i")) {
            System.out.println("True");
        } else if (enter.toLowerCase().contains("b")) {
            System.out.println("True");
        } else if (enter.toLowerCase().contains("q")) {
            System.out.println("True");
            //default statement if is-else condition is not met
        } else {
            System.out.println("False");
        }
        }
}




/*
//Task2        Write a program that accepts a String from a user and prints an interactive response telling the user if the word is the same when spelt backwards.
// For example, bread when spelt backwards is daerb, which isn't quite the same.
import java.util.Scanner;

public class HW09_03 {

    //MAIN
    public static void main(String[] args) {
        //SCANNER
        Scanner sc = new Scanner(System.in); // create new Scanner class object
        System.out.println("Please enter you text below.");
        String inputText = sc.nextLine(); // using nextLine as user might input text

        String invertedString = "";

        //CREATING INVERSION USING FOR LOOP ITERATION
        for (int i = inputText.length() - 1; i>=0; i--){ //iterating thorugh the lenght of the String
            invertedString = invertedString + inputText.charAt(i); // adding each letter(char)
        }

        System.out.println("Your word spelled backwards is - " + invertedString);

        if(inputText.equalsIgnoreCase(invertedString)){
            System.out.println("Congrats, your Strings are the same!");
        }else{
            System.out.println("Sorry, your String spelled backwards is not the same as original one.");
        }
        //System.out.println(inputText.equalsIgnoreCase(invertedString));
    }
}
 */


/*
import java.util.Scanner;

//Task3  program that accepts any of the primary colors as a String and returns the complimentary color of that color to the user.

public class HW09_03 {

    //MAIN
    public static void main(String[] args) {
        //SCANNER
        Scanner sc = new Scanner(System.in); // create new Scanner class object
        System.out.println("Please enter you color below. Please choose of the primary colors (red, green, blue)");
        String color = sc.nextLine().toLowerCase(); // using nextLine as user might input text, toLowerCase() to ignore the size of the letters inputted by the user in the String

        //CREATING INVERSION USING FOR LOOP ITERATION
        switch (color) {

            //red
            case "red":
                System.out.println("Complimentary color to red is green.");
                break;

            //yellow
            case "yellow":
                System.out.println("Complimentary color to yellow is purple.");
                break;

            //blue
            case "blue":
                System.out.println("Complimentary color to blue is orange.");
                break;

            //default
            default:
                System.out.println("Color entered in not a primarily color. Please choose from the above mentioned colors (red, yellow, blue).");
                break;
        }
    }
}
 */