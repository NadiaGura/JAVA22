package Collections;

import java.util.*;

public class CollectionsLists {

    //MAIN
    public static void main(String[]args){


        //LIST - ordered implementation of the Set interface.
        //Contains indexes that allow us to retrieve data store at a particular position on the list.
        //allows us to define a resizable array object to suit our needs.
        //can accept duplicates - will be stored at a certain index.
        //don't have to define a size at object instantiation.
        //ArrayList -> 0(1);

        List<String> names = new ArrayList<>();

        names.add("Bob");
        names.add("Mike");
        names.add("Sam");
        names.add("Rob");
        names.add("Rob");

        for(int i = 0; i < names.size(); i++){ //returning each item
            System.out.println(names.get(i));
        }

        System.out.println(names.get(3)); //return item at 3 index

        //LinkedList - nodes that are joined or linked to each other.
        //LinkedList -> O(n) -> slower than ArrayList

        List<String> names2 = new LinkedList<>();

        names2.add("Bob");
        names2.add("Mike");
        names2.add("Sam");
        names2.add(2, "Rob"); //put Rob at 2 index
        names2.add("Rob");

        for(int i = 0; i < names2.size(); i++){ //returning each item
            System.out.println(names2.get(i));
        }

        System.out.println(names2.get(2));



        //TASK - method will accept/process scores - int of 20 students and will return a max score using an Arraylist

        //ArrayList to store values
        List<Integer> scores = new ArrayList<>();

//        //SCANNER CLASS
//        Scanner input = new Scanner(System.in); //Scanner class object to be used for user input
//        System.out.println("Please enter number of students.");
//        int n = input.nextInt(); // asking user for an ArrayList size
//        System.out.println("Please enter student scores."); //asking user for an input
//
//        //input with iteration
//        for (int i = 0; i < n; i++){
//            scores.add(input.nextInt());
//        }

        scores.add(4);
        scores.add(5);
        scores.add(3);
        scores.add(3);
        scores.add(5);


        //FIND MAX WITH ITERATION

        int max = scores.get(0);
        for(int i = 0; i < scores.size(); i++){
            if(scores.get(i) > max) // if i > max -> max will be set to i
                max = scores.get(i);
        }

        System.out.println("Max score is - " + max);
        System.out.println("Max - " + Collections.max(scores));




        //QUEUE - an interface for building LIFO and FIFO queues
        //FIFO - First In First Out (Start of the queue)
        //LIFO - Last In Last Out (End of the line)

        Queue<String> names3 = new LinkedList<>();

        names3.offer("Bob");
        names3.offer("Mike");
        names3.offer("Sam");
        names3.offer("Rob");
        names3.offer("Rob");

        System.out.println(names3.offer("James")); // return boolean if operation is successful
        System.out.println(names3.element()); // return first item of the queue but doesn't remove if from the queue
        //if queue is empty returns NoSuchElementException

      //the peek() works like element(), but doesn't throw an exception is the queue is empty
        System.out.println(names3.peek());
        System.out.println(names3.remove());
        //pool() removes first element of the queue and returns it. Returns null if the queue is empty.
    }
}
