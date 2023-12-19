package Algorithms._1_Searching_Algorithms._1_LinearSearch._1_BaseAlgorithm;

public class LinearSearch {
    /**
    Description:
        Linear search is a simple searching algorithm that iterates through each element in a list sequentially until a match is found or the end of the list is reached.

    Steps:
        i)   declare an array
        ii)  pass arr and target value to function
        iii) Iterate array using for loop
        iv)  Compare the target element with the current element in loop.
        v)   If a match is found, return the index of the element. if not return -1
        vi)  print result in console

    Pseudo Code:

        function linearSearch(arr, target):
            n = length(arr)

            // check whether array is empty
            if n equals 0
                return -1
            end if

            for i from 0 to n-1
                    if element arr[i] equals target:
                        return i
                    end if
            end for
            return -1
         end function

         //Test

         array = [1, 3, 5, 7, 9, 11]
         target = 7

         result = linearSearch(array, target)
            if result != -1:
                print("Target found at index", result)
            else:
                print("Target not found in the array")
     **/

    //using for loop
    public static int linearSearch(int[] arr, int target) {
        int length = arr.length;

        //check whether array is empty
        if (length == 0) {
            return -1;
        }

        for (int i = 0; i < length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }


    /*
    //using foreach loop
    public static int linearSearch2(int[] arr, int target){
        int length = arr.length;

        //check whether array is empty
        if(length == 0){
            return -1;
        }

        for(int i: arr){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
     */

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int target = 4;

        int result = linearSearch(arr, target);
        //int result = linearSearch2(arr, target);

        if (result != -1) {
            System.out.println("Target found at index: " + result);
        } else {
            System.out.println("Target not found in the array");
        }
    }
}
