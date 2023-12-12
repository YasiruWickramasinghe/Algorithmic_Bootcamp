package Algorithms.Searching_Algorithms;

public class LinearSearch {
    //Description:
        //Linear search is a simple searching algorithm that iterates through each element in a list sequentially until a match is found or the end of the list is reached.

    //Steps:
        //declare an array
        //pass arr and target value to function
        //Iterate array using for loop
        //Compare the target element with the current element in loop.
        //If a match is found, return the index of the element. if not return -1
        //print result in console
    /*
    Pseudo Code:

        function linearSearch(arr, target):
            n = length(arr)
            for i from 0 to n-1
                    if element arr[i] equals target:
                        return i
                    end if
            end for
            return -1
         end function

         //Example

         array = [1, 3, 5, 7, 9, 11]
         target = 7

         result = linearSearch(array, target)
            if result != -1:
                print("Target found at index", result)
            else:
                print("Target not found in the array")
     */

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int target = 4;

        int result = linearSearch(arr, target);

        if (result != -1) {
            System.out.println("Target found at index: " + result);
        }else {
            System.out.println("Target not found in the array");
        }
    }
    public static int linearSearch(int[] arr, int target){
        int length = arr.length;

        for(int i = 0; i < length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
