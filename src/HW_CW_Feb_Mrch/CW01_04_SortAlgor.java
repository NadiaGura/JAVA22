package HW_CW_Feb_Mrch;
//INSERTION SORT - algorithm sorts numbers by comparing the values at the indexes with previous elements to sort the element.
//We place the value at the index where there are no lesser values than the element.

import java.util.Arrays;

public class CW01_04_SortAlgor {

//    //SORTING ALGORITM
//
//    for(
//    int i = 1;
//    i<numbers.length;i ++)
//
//    {
//        int valueToSort = numbers[i];
//        int j;
//
//
//        //the loop below is to store the numbers at the point
//        //where there are no less numbers than that  value
//        for (j = i; j > 0 && numbers[j - 1] > valueToSort; j--) {
//            numbers[j] = numbers[j - 1];
//        }
//        numbers[j] = valueToSort;
//    }
//    System.out.println(Arrays.toString(numbers));



    //SELECTION SORT - find the minimum element and swap that min element with the current element.
    //repeat the whole process untill the Array is fully sorted.

    public static void main(String[] args) {
        int[] numbers = {1,5,2,9,4,15};

        for (int i = 0; i < numbers.length; i++) {
            int index = i;

            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[index]) {
                    index = j;//swap if number is less that i
                }
            }
            int smallerNumber = numbers[index];
            numbers[index] = numbers[i];
            numbers[i] = smallerNumber;
        }
System.out.println(Arrays.toString(numbers));

        //merge sort
        int[]values = {3,1,7,4,26,4};
        mergeSort(0, values.length-1, values);
        System.out.println(Arrays.toString(values));
    }

    //MERGE SORT - divide the Array into subarray of about half size in each iteration/repetition
//until each subarray has only one element. Merge each subarray repeatedly to create sorted arrray.
// This is goind to repeat itself until we have only one sorted array. This is the sorted array.
    public static void mergeSort(int start, int end, int[] numbers) {

int mid = (start +end)/2;

if(start <end) {

    //sort the left half
    mergeSort(start, mid, numbers);
    //sort the right half
    mergeSort(mid +1, end, numbers);
    //merge
    merge(start, mid, end, numbers);
}
    }

    public static void merge(int start, int end, int mid, int[] numbers){

        //initialize a temp array and index
        int[] tempArray = new int[numbers.length];

        int tempArrayIndex = start; //temporary index

        //initialize the start index and mud index to be used as counters
        int startIndex = start;
        int midIndex = mid+1;

        //while loop to iterate until the smaller array reaches the end
        while (startIndex <= mid && midIndex <= end){
            if(numbers[startIndex] < numbers[midIndex]){
                //++ increases the value of index by 1. Being used to keep while loop from giving us an infinite loop.
                tempArray[tempArrayIndex++] = numbers[startIndex++];
            }else{
                tempArray[tempArrayIndex++] = numbers[midIndex++];
            }
        }
        //copy the remaining elements into an array
        while (startIndex<= mid){
            tempArray[tempArrayIndex++] = numbers[startIndex++];
        }
        while (midIndex<= mid){
            tempArray[tempArrayIndex++] = numbers[midIndex++];
        }
        //copy vaue of our temp array into the actual array after we are done sorting it.
        if(end+1 - start >=0) {
            //java method to copy an array

            System.arraycopy(tempArray, start, numbers,start,end + 1 - start );
        }
    }
}


//OOP INTRO
//Class - a blueprint of describing an object.
