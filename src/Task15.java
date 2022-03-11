/*
Exercise 15
Write a program that reads the text entered by the user and then divides it into individual words.
Then counts the number of occurrences of words regardless of case and writes them to the console in alphabetical order.
For example, for the text

"Ala likes cats, but she is not liked by the Cats.", the program should write in the console:

• ala - 1
• but - 1
• by - 1
• cats - 2
• is - 1
• liked - 1
• likes - 1
• not - 1
• she - 1
• the - 1

Assume that any punctuation marks may appear in the text.
Get the data from the user in the console using the Scanner class.
 */
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//program will divide inputted text into separate words and will output them into console in an alphabetic order and will count their occurrence
public class Task15 {
    //MAIN
    public static void main(String[] args) {

        //SCANNER
        Scanner sc = new Scanner(System.in); // create new Scanner class object
        System.out.println("Please enter you text below.");
        String input = sc.nextLine(); // using nextLine as we are expecting to receive phrase rather than word as an input

        //SEPARATING STRING BY THE WORDS AND COUNTING OCCURRENCE IN THE STRING
        Pattern pattern = Pattern.compile("\\w+"); //splitting words
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()){
            System.out.println(matcher.group());
        }
        }
    }
