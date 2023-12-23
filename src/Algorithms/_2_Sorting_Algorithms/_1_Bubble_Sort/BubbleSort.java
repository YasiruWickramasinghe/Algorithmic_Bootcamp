package Algorithms._2_Sorting_Algorithms._1_Bubble_Sort;

import java.util.Arrays;

public class BubbleSort {
    /**
    Description:
        Bubble Sort is a simple sorting algorithm that repeatedly steps through the list, compares adjacent elements,
        and swaps them if they are in the wrong order. The pass through the list is repeated until the list is sorted.
        It is not very efficient for large datasets, but it's easy to understand and implement.

    Steps:
        i)    declare an array
        ii)   pass array to function
        iii)  get length of array
        iv)   then we have to use two for loops, one for passes, another for comparison
        v)    if we have 5 element in array we have 4 passes, first for loop for it,
        vi)   then our second for loop go through the one passes and compare adjacent element, if right element is less than left element then swap that two elements

        vii)  after first for loop initialize the swap flag for each pass
        viii) if swap done swap set to true if not swap is false
        ix)   then after second for loop check if swap is true or false ,if swap true iteration have to done, if swap false therefore array is sorted, no need to compare



            Test :

            Original array: [5, 2, 9, 1, 5]

            Pass 1:
                Compare 5 and 2, swap.     -> [2, 5, 9, 1, 5]
                Compare 5 and 9, no swap.  -> [2, 5, 9, 1, 5]
                Compare 9 and 1, swap.     -> [2, 5, 1, 9, 5]
                Compare 9 and 5, swap.     -> [2, 5, 1, 5, 9]

            Pass 2:
                Compare 2 and 5, no swap.  -> [2, 5, 1, 5, 9]
                Compare 5 and 1, swap.     -> [2, 1, 5, 5, 9]
                Compare 5 and 5, no swap.  -> [2, 1, 5, 5, 9]

            Pass 3:
                Compare 2 and 1, swap.     -> [1, 2, 5, 5, 9]
                Compare 2 and 5, no swap.  -> [1, 2, 5, 5, 9]

            Pass 4:
                    Compare 1 and 2, no swap.  -> [1, 2, 5, 5, 9]

            Sorted array: [1, 2, 5, 5, 9]

    Pseudo Code:

        function bubbleSort(A: list)

          n = length(A)

          for i from 0 to n-1

             # Initialize swap flag for each pass
             swap = False

              for j from 0 to n-i-1
                  if A[j] > A[j+1]
                      swap(A[j], A[j+1])
                  end if
              end for

             # If no swaps were made in this pass, the array is already sorted
             if not swap
                break
             end if

          end for

        end function

        //Test

             array = [45,24,68,27,95,32,15,75,82,64,52,13]
             print("Before Sorting Array: ", arr);

             sortedArr = bubbleSort(arr);
             print("After Sorting Array: ", sortedArr);
     **/

    public static int[] bubbleSort(int[] arr) {

        //run the steps n-1
        for (int i = 0; i < arr.length; i++) {
            boolean swap = false;
            //For each step, max item will come at the last respective index
            for (int j = 1; j < arr.length - i; j++) {
                //
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swap = true;
                }
            }
            //if did't not swap for a particular value of, it's mean array is sorted
            if (!swap) {
                break;
            }
            //System.out.println("efficient way: " + Arrays.toString(arr));
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {5, 2, 9, 1, 7};
        System.out.println("Before Sorting Array: " + Arrays.toString(arr));

        int sortedArr[] = bubbleSort(arr);
        System.out.println("After Sorting Array: " + Arrays.toString(sortedArr));



    }
}
