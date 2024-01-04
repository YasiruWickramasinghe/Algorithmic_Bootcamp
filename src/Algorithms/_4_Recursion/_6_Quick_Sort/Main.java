package Algorithms._4_Recursion._6_Quick_Sort;

import java.util.Arrays;

/**
 Description:
 Quick Sort is a divide-and-conquer algorithm that works by selecting a 'pivot' (pivot is central point of problem ) element
 and partitioning the other elements into two sub-arrays according to whether they are less than or greater than the pivot.
 The sub-arrays are then sorted recursively.

 Steps:
 Partitioning: Select a pivot element and partition the array into two sub-arrays. we use divide and conquer algorithm
 Recursive Sort: Recursively apply Quick Sort to the sub-arrays.
 Combine: No additional combine step is needed as the sorting is done in-place.

 Pseudocode:

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

public class Main {
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
