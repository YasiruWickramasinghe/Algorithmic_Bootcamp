package Algorithms._2_Sorting_Algorithms;

import java.util.Arrays;

public class InsertionSort {

    /**
        Description:
            Insertion Sort builds the sorted array one element at a time by repeatedly taking elements from the unsorted part
            and inserting them into their correct position in the sorted part. It is like sorting a hand of playing cards.

        Steps:

            Initialization: The first element is considered the sorted part, and the rest is unsorted initially.
            Insertion: Take an element from the unsorted part and insert it into its correct position in the sorted part.
            Move Boundary: Move the boundary between the sorted and unsorted parts one step to the right.
            Repeat: Repeat steps 2-3 until the entire array is sorted.

             create array
             define for loop and loop through the whole array - i started from 1
             then inside for loop create key variable and save it to the i value
             then create j variable and j is equal to i - 1
                {7, 4, 10, 3, 2, 11};
                 j  i
             then create while loop and check j is less than 0 and A[j] is grater than the key value
             if yes, then shifting A[j] to A[j+1] also reduce the value of j
            then after while loop set A[j] to key value


            //Test :

            Original array: [7, 4, 10, 3, 2, 11]

            Pass 1:
                Take 4 from the unsorted part and insert it into its correct position in the sorted part.
                -> [4, 7, 10, 3, 2, 11]

            Pass 2:
                Take 10 from the unsorted part and insert it into its correct position in the sorted part.
                -> [4, 7, 10, 3, 2, 11] (no shifting)

            Pass 3:
                Take 3 from the unsorted part and insert it into its correct position in the sorted part.
                -> [3, 4, 7, 10, 2, 11]

            Pass 4:
                Take 2 from the unsorted part and insert it into its correct position in the sorted part.
                -> [2, 3, 4, 7, 10, 11]

            Pass 5:
                Take 11 from the unsorted part and insert it into its correct position in the sorted part.
                -> [2, 3, 4, 7, 10, 11] (no shifting)

            Sorted array: [2, 3, 4, 7, 10, 11]


    Pseudo Code:

        function insertionSort(A: list)

         n = length(A)

         // check whether array is empty
         if n equals 0
            return new empty array
         end if

          for i from 1 to n-1
              // Take an element from the unsorted part
              key = A[i]

              // Insert the element into its correct position in the sorted part
              j = i - 1
              while j >= 0 and A[j] > key
                  A[j + 1] = A[j]
                  j = j - 1
              end while
              A[j + 1] = key
          end for
        end function

        //Test
             array = [7, 4, 10, 3, 2, 11]
             print("Before Sorting Array: ", array);

             insertionSort(array);
             print("After Sorting Array: ", array);
       **/

    public static int[] insertionSort(int[] arr) {
        int size = arr.length;

        //check whether array is empty
        if (size == 0) {
            return new int[0];
        }

        //I started from 2nd element then check left side elements
        for (int i = 1; i < size; i++) {
            //save i value to key
            int key = arr[i];

            //{7, 4, 10, 3, 2, 11};
            // j  i
            //j is 1 number less than i value
            int j = i - 1;

            //check jey value is less than j value and check j is not less than 0, if yes then shift j value to the j+1 potion
            while (j >= 0 && arr[j] > key) {
                //move j value to j+1 potion
                arr[j + 1] = arr[j];
                //then reduce j value by one
                j = j - 1;
            }
            //after all replace the key value position j
            arr[j + 1] = key;

            System.out.println("Pass: " + i + ": " + Arrays.toString(arr));
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arrs = {7, 4, 10, 3, 2, 11};

        System.out.println("before sorting");
        for (int arr : arrs) {
            System.out.print(arr + ",");
        }
        System.out.println();

        int[] sortedArrs = insertionSort(arrs);

        System.out.println("after sorting");
        for (int sortedArr : sortedArrs) {
            System.out.print(sortedArr + ",");
        }


    }
}


