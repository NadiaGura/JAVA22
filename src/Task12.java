/*
Exercise 12

Write a program that counts how many times each of the numbers has appeared in the prepared table and prints a summary in the console. An array can contain ** only ** numbers from 1 to 10.
        For example, for the table [6 5 4 5 10 5 8 3 10 6 6 6 4 3 2 8 1 3 4 7] , the program should write in the console the number of occurrences of each number:
        • 1- 1
        • 2- 1
        • 3- 3
        • 4- 3
        • 5- 3
        • 6- 4
        • 7- 1
        • 8- 2
        • 9- 0
        • 10 - 2
        An array containing numbers is prepared as the variable numbers.
*/
public class Task12 {

    //COUNT METHOD
    static void count(int[] arr, int n) { //starting counting from 0 to 10

        int i = 0;
        n = 10;

        while (i < n) { //traversing an array elements that are <10
            //if element already processed -> continue
            if (arr[i] <= 0) {
                i++;
                continue;
            }

            int index = arr[i] - 1; //find an element index, -1 as indexing starts from 0

            if (arr[index] > 0) {//if array of elements contains elements that has not been encountered before ->
                arr[i] = arr[index];//storing that element
                arr[index] = -1;//store initial count of elements
            } else { //ef element has been counted, decrement
                arr[index]--;
                arr[i] = 0;
                i++;
            }
        }
        for (int j = 0; j < 10; j++)
            System.out.println(j + 1 + " - " + Math.abs(arr[j]));
    }

  //MAIN
    public static void main(String[] args) {
        //declaring and initializing an Array
        Task12 countOccurences = new Task12();
        int arr[] = {6, 5, 4, 5, 10, 5, 8, 3, 10, 6, 6, 6, 4, 3, 2, 8, 1, 3, 4, 7};
        countOccurences.count(arr, arr.length);
    }
}
