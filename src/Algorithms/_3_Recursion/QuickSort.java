package Algorithms._3_Recursion;

import java.util.Arrays;

public class QuickSort {
    // Description:
        // Quick Sort is a divide-and-conquer algorithm that works by selecting a 'pivot' (pivot is central point of problem ) element
        // and partitioning the other elements into two sub-arrays according to whether they are less than or greater than the pivot.
        // The sub-arrays are then sorted recursively.

    // Steps:
        // Partitioning: Select a pivot element and partition the array into two sub-arrays. we use divide and conquer algorithm
        // Recursive Sort: Recursively apply Quick Sort to the sub-arrays.
        // Combine: No additional combine step is needed as the sorting is done in-place.


        /*
        Test:

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
      */


    /*
        Pseudo Code:

        function quickSort(A: list, low: int, high: int)
          if low < high
              // Partition the array and get the index of the pivot element
              pivotIndex = partition(A, low, high)

              // Recursively sort the sub-arrays
              quickSort(A, low, pivotIndex - 1)
              quickSort(A, pivotIndex + 1, high)

        end function

        function partition(A: list, low: int, high: int) -> int
          // Choose the rightmost element as the pivot
          pivot = A[high]

          // Initialize the index of the smaller element
          i = low - 1

          // Iterate through the array
          for j from low to high - 1
              // If the current element is smaller than or equal to the pivot
              if A[j] <= pivot
                //increment i value because in start i value is -1
                  i = i + 1
                  // Swap A[i] and A[j]
                  swap(A[i + 1], A[j])

              end if
          end for

          // Swap A[i + 1] and the pivot
          swap(A[i + 1], A[high])

          // Return the index of the pivot
          return i + 1
        end function

        // Test
        array = [7, 4, 10, 3, 2, 11]
        print("Before Sorting Array: ", array)

        quickSort(array, 0, length(array) - 1)
        print("After Sorting Array: ", array)
    */

    public static int[] quickSort(int[] arr, int low, int high){
        if(low < high){
            // Partition the array and get the pivot index
            int pivotIndex = partition(arr,low,high);

            // Recursively sort the sub arrays on both sides of the pivot
            quickSort(arr, low, pivotIndex-1 );
            quickSort(arr,pivotIndex+1 , high);
        }

        return arr;

    }

    private static int partition(int[] arr, int low, int high) {
        // Choose the rightmost element as the pivot
        int pivot = arr[high];

        // Initialize the index of the smaller element
        int i = low - 1;

        // Iterate through the array
        for (int j = low; j < high; j++) {

            // If the current element is smaller than or equal to the pivot
            if (arr[j] < pivot) {
                //increment i value because in start i value is -1
                i++;

                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap arr[i+1] and the pivot
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        System.out.println("within partitioning:" + Arrays.toString(arr));

        // Return the index of the pivot
        return i + 1;
    }

    public static void main(String[] args) {
        int[] arrs = {7, 97 , 4, 11, 10, 51,  3, 75, 2, 7, 48};

        System.out.println("Before Sorting Array: ");
        for(int arr: arrs){
            System.out.print(arr+",");
        }
        System.out.println();

        int[] sortedArrs = quickSort(arrs, 0, arrs.length-1);

        System.out.println("After Sorting Array:");
        for(int arr: sortedArrs){
            System.out.print(arr+",");
        }
    }

}
