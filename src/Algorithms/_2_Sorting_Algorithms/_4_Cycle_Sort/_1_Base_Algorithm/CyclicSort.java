package Algorithms._2_Sorting_Algorithms._4_Cycle_Sort._1_Base_Algorithm;

import java.util.Arrays;

public class CyclicSort {
/**
    Cyclic Sort is an in-place sorting algorithm that works well when the input elements are in a limited range. The basic idea is to iterate through the array and place each element in its correct position. It is called "cyclic" sort because it involves moving elements to their correct position in a cyclic manner.

    Here's a simple explanation of the algorithm:

    1) Iterate through the array.
    2) For each element, check if it is in the correct position.
    3) If not, swap it with the element at its correct position.
    4) Repeat until all elements are in their correct positions.

 **/

    public static void main(String[] args) {
        // Input array
        int[] arr = {5, 4, 3, 2, 1};

        // Perform cyclic sort on the array
        cyclicSort(arr);

        // Print the sorted array
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    // Function to perform cyclic sort on the given array
    static void cyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            // Calculate the correct index for the current element
            // (correct index = value - 1, as indexing starts from 0)
            int correctPosition = arr[i] - 1;

            // Check if the element is at its correct position
            if (arr[i] != arr[correctPosition]) {
                // Swap the current element with the element at its correct position
                swap(arr, i, correctPosition);
            } else {
                // Move to the next element if the current one is already at the correct position
                i++;
            }
        }
    }

    // Function to swap elements at the given indices in the array
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
