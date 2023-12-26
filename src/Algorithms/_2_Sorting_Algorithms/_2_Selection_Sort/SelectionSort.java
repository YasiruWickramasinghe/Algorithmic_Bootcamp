package Algorithms._2_Sorting_Algorithms._2_Selection_Sort;

import java.util.Arrays;

public class SelectionSort {
    /**
    Description:
        Selection Sort divides the input array into two parts: the sorted and the unsorted. In each iteration,
         it finds the maximum element from the unsorted part and swaps it with the last element of the unsorted part.
         This process is repeated until the entire array is sorted.

    Steps:
        Initialization: The entire array is considered unsorted initially.
        Find Maximum: Find the minimum or maximum element from the unsorted part of the array.
        Swap: Swap the maximum element with the last element of the array. (Only swap if the maximum element is not already at its correct position)
        Repeat: Repeat steps 2-4 until the entire array is sorted.

            //Test :

            Original array: [7, 4, 10, 3, 2, 11]

            Pass 1:
                Find the minimum element in the unsorted part (index 0 to 5): 2 (at index 4).
                Swap 7 and 2.               -> [2, 4, 10, 3, 7, 11]

            Pass 2:
                Find the minimum element in the unsorted part (index 1 to 5): 3 (at index 3).
                Swap 4 and 3.               -> [2, 3, 10, 4, 7, 11]

            Pass 3:
                Find the minimum element in the unsorted part (index 2 to 5): 4 (at index 3).
                Swap 10 and 4.              -> [2, 3, 4, 10, 7, 11]

            Pass 4:
                Find the minimum element in the unsorted part (index 3 to 5): 7 (at index 4).
                Swap 10 and 7.              -> [2, 3, 4, 7, 10, 11]

            Pass 5:
                Find the minimum element in the unsorted part (index 4 to 5): 10 (at index 4).
                Swap 10 and 10 (no change). -> [2, 3, 4, 7, 10, 11]

            Sorted array: [2, 3, 4, 7, 10, 11]

    Pseudo Code:

     function selectionSort(arr):
        for i from 0 to length of arr - 1:
            lastIndex = length of arr - i - 1
            maxIndex = getMaxIndex(arr, 0, lastIndex)

            if maxIndex != lastIndex:
                swap(arr, maxIndex, lastIndex)

        return arr

     function getMaxIndex(arr, startIndex, lastIndex):
        max = startIndex
        for i from startIndex to lastIndex:
            if arr[max] < arr[i]:
                max = i
        return max

     function swap(arr, first, second):
        temp = arr[first]
        arr[first] = arr[second]
        arr[second] = temp

     main():
        arr = [7, 4, 10, 3, 2, 11]
        sortedArr = selectionSort(arr)
        print("Sorting Array: " + sortedArr)

        //Test

             array = [45, 24, 68, 27, 95, 32, 15, 75, 82, 64, 52, 13]
             print("Before Sorting Array: ", array);

             selectionSort(array);
             print("After Sorting Array: ", array);
   **/

    public static void main(String[] args) {
        int arr[] = {7, 4, 10, 3, 2, 11};
        int sortedArr[] = selectionSort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(sortedArr));
    }

    private static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            //find the max item in the remaining array and swap with correct index
            int lastIndex = arr.length - i - 1;
            int maxIndex = getMax(arr,0, lastIndex);

            // Only swap if the maximum element is not already at its correct position
            if (maxIndex != lastIndex) {
                swap(arr, maxIndex, lastIndex);
            }
        }
        return arr;
    }

    private static int getMax(int[] arr, int startIndex, int lastIndex) {
        int max = startIndex;
        for (int i = startIndex; i <= lastIndex; i++) {
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }

    private static void swap(int[] arr,int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }



    /*

    public static int[] selectionSort(int[] arr){
        int size = arr.length;

        //check whether array is empty
        if(size == 0){
            return new int[0];
        }

        for(int i = 0; i < size-1; i++){
            //set minimum to i
            int minIndex = i;

            for(int j = i+1; j < size; j++){
                //check minimum number
                if(arr[minIndex] > arr[j]){
                    minIndex = j;
                }
            }

            //swapping
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
            System.out.println("normal way - Pass "+ i + ": "+Arrays.toString(arr));
        }
        return arr;
    }
    */

    /**
    //More Efficient way in selection sort

     This Selection Sort algorithm, as implemented in the example, has already sorted the array after Pass 4. Pass 5 is just a redundant pass without any swaps,

    steps

    End of the first for loop check minIndex is equal to the i
    if minIndex and i value are same no swapping happened, therefore no need to swap

        Pseudo Code:

        Pseudo Code:

        function selectionSort(A: list)

         n = length(A)

         // check whether array is empty
         if n equals 0
            return new empty array
         end if

          for i from 0 to n-1
              // Assume the current index is the minimum
              minIndex = i

              // Find the minimum element in the unsorted part
              for j from i+1 to n-1
                  if A[j] < A[minIndex]
                      minIndex = j
                  end if
              end for

              # Swap only if the minimum is found at a different index
                if minIndex is not equal to i
                    swap(A[i], A[minIndex])
                end if

          end for
        end function

    **/
    /*
    public static int[] efficientSelectionSort(int[] arr) {
        int size = arr.length;

        for (int i = 0; i < size - 1; i++) {
            //set minimum to i
            int minIndex = i;

            for (int j = i + 1; j < size; j++) {
                //check minimum number
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }


            // Swap only if the minimum is found at a different index
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;

                System.out.println("efficient way: Pass " + i + ": " + Arrays.toString(arr));
            }

        }
        return arr;
    }

     */

    /*
    public static void main(String[] args) {
        int arr[] = {7, 4, 10, 3, 2, 11};
        System.out.println("Before Sorting Array: " + Arrays.toString(arr));

        int sortedArr[] = selectionSort(arr);
        System.out.println("After Sorting Array: " + Arrays.toString(sortedArr));

        //to check this efficient way sorting comment sorted array above and uncomment this

        //int sortedArrEfficientWay[] = efficientSelectionSort(arr);
        //System.out.println("After Sorting Array with Efficient Way: " + Arrays.toString(sortedArrEfficientWay));

    }
     */
}
