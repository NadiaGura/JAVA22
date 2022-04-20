package Collections;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class MainCollection {
    //MAIN
    public static void main (String [] args) {

        //SET - storing UNIQUE elements. can't take in duplicates

        //Items created inside any Collection are transformed into objects.

        //HashSet: non ordered data. Implementation of the Set Interface that doesn't store items in any ordered fashion.
        // Items order may be randomized.
//        Set<Integer> numbers = new HashSet<>();
//        numbers.add(1);
//        numbers.add(2);
//        numbers.add(3);
//        numbers.add(4);


//        Set<String> numbers = new HashSet<>();
//        numbers.add("Bob");
//        numbers.add("Mike");
//        numbers.add("Sam");
//        numbers.add("Rob");
//        System.out.println(numbers);

        //TreeSet - implementation of the Set interface that compares and returns a sorted set of data from the input.
        //no duplicates will be included into the Set.
        Set<String> names = new TreeSet<>();
        names.add("Bob");
        names.add("Mike");
        names.add("Sam");
        names.add("Rob");
        names.add("Rob");
        System.out.println(names);

        //LinkedHashSet - implementation of the Set interface.
        //Maintains an order of input of the data stored in it.
        //will remove duplicated, but will maintain order that data was inputted.


        Set<String> names2 = new LinkedHashSet<>();
        names2.add("Bob");
        names2.add("Mike");
        names2.add("Sam");
        names2.add("Rob");
        names2.add("Rob");
        System.out.println(names2);


        //program takes in 6 numbers from the user and returns that data in a sorted format.

        //SCANNER CLASS
        Scanner input = new Scanner(System.in); //Scanner class object to be used for user input
        System.out.println("Please enter how many numbers you would like to enter.");
        int n = input.nextInt(); // asking user for an Array size
        System.out.println("Please enter your numbers."); //asking user for input

        //SET TO STORE VALUES
        Set<Integer> stored = new TreeSet<>();

        //input with iteration
        for (int i = 0; i < n; i++){
         stored.add(input.nextInt()); //TreeSet add() method with scanner input
         }

//        int n1 = input.nextInt(); //var to store inputted elements
//        int n2 = input.nextInt();
//        int n3 = input.nextInt();
//        int n4 = input.nextInt();
//        int n5 = input.nextInt();
//        int n6 = input.nextInt();

        //adding inputted items into TreeSet
//        stored.add(n1); //add() method
//        stored.add(n2);
//        stored.add(n3);
//        stored.add(n4);
//        stored.add(n5);
//        stored.add(n6);

        //PRINT
        System.out.println(stored);





        }
}
