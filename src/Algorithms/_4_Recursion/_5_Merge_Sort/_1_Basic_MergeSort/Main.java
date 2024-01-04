package Algorithms._4_Recursion._5_Merge_Sort._1_Basic_MergeSort;

import java.util.Arrays;

/**
 Description:
    Merge Sort is a divide-and-conquer algorithm that divides the array into two halves,
    recursively sorts them, and then merges the sorted halves.

 Steps:
    1. Divide: Split the array into two halves.
    2. Recursively Sort: Apply Merge Sort to each half.
    3. Merge: Merge the sorted halves into a single sorted array.

 Pseudo Code:

     MergeSort(arr):
        // Base Condition
        if length of arr is 1:
            return arr

        // Determine mid-point for breaking down the array into two parts
        mid = length of arr / 2

        // Recursively apply MergeSort on the left and right halves
        first = MergeSort(copy of the left half of arr from 0 to mid-1)
        second = MergeSort(copy of the right half of arr from mid to end)

        // Merge the sorted halves using the merge function
        result = merge(first, second)
     return result

     Merge(first, second):
        // Create a new array to hold the merged arrays
        mix = new array of size (length of first + length of second)

        // Initialize indices for the first, second, and merged arrays
        i = 0
        j = 0
        k = 0

        // Loop through the two arrays and compare elements
        while i < length of first and j < length of second:
            if first[i] < second[j]:
                mix[k] = first[i]
                i++
            else:
                mix[k] = second[j]
                j++
            k++

        // Copy the remaining elements from the left array, if any
        while i < length of first:
            mix[k] = first[i]
            i++
            k++

        // Copy the remaining elements from the right array, if any
        while j < length of second:
            mix[k] = second[j]
            j++
             k++

     return mix

        main:
        // Initialize the input array
        arr = [5, 4, 3, 2, 1]

        // Call MergeSort on the array
        result = MergeSort(arr)

        // Print the sorted array
        print result

 **/

public class Main {

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        arr = mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] mergeSort(int[] arr){
        //Base Condition
        //check if array length is 1, if it 1 then that array cannot be divided furthermore, then return the array
        if(arr.length == 1){
            return arr;
        }

        //Determine mid-point for break down the array in two parts
        int mid = arr.length / 2;

        //create new two arrays to store that arrays
        int[] first =  mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] second = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(first, second);
    }

    private static int[] merge(int[] first, int[] second) {
        //create new array to hold the merged arrays
        int[] mix = new int[first.length + second.length];

        //first array index initialized
        int i = 0;
        //second array index initialized
        int j = 0;
        //merged array(mix) index initialized
        int k = 0;

        //loop thought the two array and check minimum one and put that into mix array
        while(i < first.length && j < second.length){ //if i or j reach the condition then loop end
            if(first[i] < second[j]){
                mix[k] = first[i];
                i++;
            }else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        //it may be possible one of the array is not complete
        //copy the remaining elements
        while (i < first.length){
            mix[k] = first[i];
            i++;
            k++;
        }

        while (j < second.length){
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }
}
