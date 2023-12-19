package Algorithms.Sorting_Algorithms;

import java.util.Arrays;

public class BubbleSort {
    /**
    Description:
        Bubble Sort is a simple sorting algorithm that repeatedly steps through the list, compares adjacent elements,
        and swaps them if they are in the wrong order. The pass through the list is repeated until the list is sorted.
        It is not very efficient for large datasets, but it's easy to understand and implement.

    Steps:
        i)   declare an array
        ii)  pass array to function
        iii) get length of array
        iv)  then we have to use two for loops, one for passes, another for comparison
        v)   if we have 5 element in array we have 4 passes, first for loop for it,
        vi)  then our second for loop go through the one passes and compare adjacent element, if right element is less than left element then swap that two elements



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

         // check whether array is empty
         if n equals 0
            return new empty array
         end if

          for i from 0 to n-1
              for j from 0 to n-i-1
                  if A[j] > A[j+1]
                      swap(A[j], A[j+1])
                  end if
              end for
          end for

        end function

        //Test

             array = [45,24,68,27,95,32,15,75,82,64,52,13]
             print("Before Sorting Array: ", arr);

             sortedArr = bubbleSort(arr);
             print("After Sorting Array: ", sortedArr);
     **/

    public static int[] bubbleSort(int[] arr){
        int length = arr.length;

        //check whether array is empty
        if(length == 0){
            return new int[0];
        }

        for(int i = 0; i < length; i++){
            for(int j = 0; j < length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            System.out.println("normal way: "+Arrays.toString(arr));
        }
        return arr;
    }

    //More Efficient way in bubble sort

        // This Bubble Sort algorithm, as implemented in the example, has already sorted the array after Pass 3. Pass 4 is just a redundant pass without any swaps, which is a characteristic of the Bubble Sort algorithm.

        //steps

            //after first for loop initialize the swap flag for each pass
            //if swap done swap set to true if not swap is false
            //then after second for loop check if swap is true or false ,if swap true iteration have to done, if swap false therefore array is sorted, no need to compare
        /*
        Pseudo Code:

        function bubbleSort(A: list)
            n = length(A)
            for i from 0 to n-1

                # Initialize swap flag for each pass
                swap = False

                for j from 0 to n-i-1
                    if A[j] > A[j+1]
                        swap(A[j], A[j+1])

                        # Set the swap flag to true
                        swap = True

                    end if
                end for

                # If no swaps were made in this pass, the array is already sorted
                if not swap
                    break
                end if

            end for
        end function

         */

    public static int[] efficientBubbleSort(int[] arr){
        int length = arr.length;

        for(int i = 0; i < length; i++){
            boolean swap = false;
            for(int j = 0; j < length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap = true;
                }
            }
            if(!swap){
                break;
            }
            System.out.println("efficient way: "+Arrays.toString(arr));
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {5, 2, 9, 1, 5};
        System.out.println("Before Sorting Array: " + Arrays.toString(arr));

        int sortedArr[] = bubbleSort(arr);
        System.out.println("After Sorting Array: " + Arrays.toString(sortedArr));

        //to check this efficient way sorting comment sorted array above and uncomment this

        /*
        int sortedArrEfficientWay[] = efficientBubbleSort(arr);
        System.out.println("After Sorting Array with Efficient Way: " + Arrays.toString(sortedArrEfficientWay));
        */
    }
}
