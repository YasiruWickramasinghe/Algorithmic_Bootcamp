package Algorithms._4_Recursion._5_Merge_Sort._2_In_Place_MergeSort;

import java.util.Arrays;

/**
 *
 * In-Place Merge Sort
 *
 Description:
    Merge Sort is a divide-and-conquer algorithm that divides the array into two halves,
    recursively sorts them, and then merges the sorted halves.

 Steps:
    1. Divide: Split the array into two halves.
    2. Recursively Sort: Apply Merge Sort to each half.
    3. Merge: Merge the sorted halves into a single sorted array.

 Pseudo Code:

         function main():
         arr = [5, 4, 3, 2, 1]
         mergeSortInPlace(arr, 0, length(arr))
         print(arr)

         function mergeSortInPlace(arr, start, end):
         if end - start == 1:
         return

         mid = (start + end) / 2
         mergeSortInPlace(arr, start, mid)
         mergeSortInPlace(arr, mid, end)
         mergeInPlace(arr, start, mid, end)

         function mergeInPlace(arr, start, mid, end):
         mix = new int[end - start]
         i = start
         j = mid
         k = 0

         while i < mid and j < end:
         if arr[i] < arr[j]:
         mix[k] = arr[i]
         i++
         else:
         mix[k] = arr[j]
         j++
         k++

         while i < mid:
         mix[k] = arr[i]
         i++
         k++

         while j < end:
         mix[k] = arr[j]
         j++
         k++

         for l in range(0, length(mix)):
         arr[start + l] = mix[l]


 **/

public class Main {

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        mergeSortInPlace(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSortInPlace(int[] arr, int start, int end){
        //Base Condition
        //check if array length is 1, if it 1 then that array cannot be divided furthermore, then return the array
        if(end - start == 1){
            return;
        }

        //Determine mid-point for break down the array in two parts
        int mid = (start + end) / 2;


        mergeSortInPlace(arr,start,mid);
        mergeSortInPlace(arr,mid,end);

        mergeInPlace(arr, start, mid, end);
    }

    private static void mergeInPlace(int[] arr, int start, int mid, int end) {
        //create new array to hold the merged arrays
        int[] mix = new int[end- start];

        //first array index initialized
        int i = start;
        //second array index initialized
        int j = mid;
        //merged array(mix) index initialized
        int k = 0;

        //loop thought the two array and check minimum one and put that into mix array
        while(i < mid && j < end){ //if i or j reach the condition then loop end
            if(arr[i] < arr[j]){
                mix[k] = arr[i];
                i++;
            }else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        //it may be possible one of the array is not complete
        //copy the remaining elements
        while (i < mid){
            mix[k] = arr[i];
            i++;
            k++;
        }

        while (j < end){
            mix[k] = arr[j];
            j++;
            k++;
        }
        //update the original array
        for (int l = 0; l < mix.length; l++) {
            arr[start+l] = mix[l];
        }
    }
}
