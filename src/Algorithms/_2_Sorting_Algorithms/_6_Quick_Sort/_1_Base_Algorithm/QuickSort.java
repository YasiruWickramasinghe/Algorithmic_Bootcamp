package Algorithms._2_Sorting_Algorithms._6_Quick_Sort._1_Base_Algorithm;

import java.util.Arrays;

public class QuickSort {

    /**
     Description:
         Quick Sort is a divide-and-conquer algorithm that works by selecting a 'pivot' (pivot is central point of problem ) element
         and partitioning the other elements into two sub-arrays according to whether they are less than or greater than the pivot.
         The sub-arrays are then sorted recursively.

     Steps:
         Partitioning: Select a pivot element and partition the array into two sub-arrays. we use divide and conquer algorithm
         Recursive Sort: Recursively apply Quick Sort to the sub-arrays.
         Combine: No additional combine step is needed as the sorting is done in-place.



        //Test:

        Original array: [7, 4, 10, 3, 2, 11]

        Pass 1:
            Choose 11 as the pivot and partition the array.
            -> [4, 7, 10, 3, 2, 11] (Partitioned: [4, 7, 10, 3, 2], Pivot: 11)

            Recursively sort the left sub-array: [4, 7, 10, 3, 2]
            Pass 1.1:
                Choose 10 as the pivot and partition the sub-array.
                -> [4, 7, 10, 3, 2] (Partitioned: [4, 7], Pivot: 10)
                Recursively sort the left sub-array: [4, 7]
                -> [4, 7]

                Recursively sort the right sub-array: [3, 2]
                Pass 1.2:
                    Choose 2 as the pivot and partition the sub-array.
                    -> [2, 3] (Partitioned: [2], Pivot: 3)
                    Recursively sort the left sub-array: [2]
                    -> [2]

                    Recursively sort the right sub-array: [3]
                    -> [3]

                Combine sorted sub-arrays: [2, 3]
                -> [2, 3, 4, 7, 10]

            Combine sorted sub-arrays: [2, 3, 4, 7, 10, 11]
            -> [2, 3, 4, 7, 10, 11]

        Sorted array: [2, 3, 4, 7, 10, 11]


        Pseudo Code:

     procedure quickSort(arr, low, high)
     if low >= high
     return
     start = low
     end = high
     mid = start + (end - start) / 2
     pivot = arr[mid]  // Choose any random number, last element, or middle element as the pivot

     while start <= end
     while arr[start] < pivot
     start++
     while arr[end] > pivot
     end--

     if start <= end
     swap arr[start] and arr[end]
     start++
     end--

     // Now pivot is at correct index, sort two halves
     quickSort(arr, low, end)
     quickSort(arr, start, high)

     procedure main
     arr = {5, 4, 3, 2, 1}
     quickSort(arr, 0, length(arr) - 1)
     print(arr)

    **/

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        quickSort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void quickSort(int[] arr, int low, int high){
        if(low >= high){
            return;
        }

        int start = low;
        int end = high;
        int mid = start + (end - start) / 2;
        int pivot = arr[mid]; // he we can use any random number or last element or mid any element

        while(start <= end){

            //also reason why if it already sorted it will not swap
            while (arr[start] < pivot){
                start++;
            }
            while (arr[end] > pivot){
                end--;
            }

            //swap
            if(start <= end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }

        //now pivot is at correct index please sort two halves now
        quickSort(arr, low, end);
        quickSort(arr,start, high);
    }

}
