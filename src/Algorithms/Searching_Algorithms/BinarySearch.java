package Algorithms.Searching_Algorithms;

public class BinarySearch {
    //Description:
        //Binary search is an efficient searching algorithm that works on sorted lists. It repeatedly divides the search space in half, reducing the problem size by half with each comparison.
        //binary search is more efficient than linear search.
        //if we search 1000 elements in an array. if targeted value is 1000, then binary search get only approximately 10 steps but linear search get 1000 steps

    //Steps:
        //declare an array
        //pass arr and target value to function
        //declare left to 0 and right to length of array
        //Iterate array until left is less than or equal to right using while loop
        //declare mid-point inside while loop
        //then check targeted element is equal to mid-point, the search is successful, return mid-point
        //if not check mid-point less than targeted value, if true, then set left to mid + 1
        //if not check mid-point greater than targeted value, if true, then set right to mid - 1
        //print result in main console

    /*
    Pseudo Code:

        function binarySearch(array, target):
            left = 0
            right = length(array) - 1

            while left <= right:
                mid = (low + high) / 2

                if array[mid] equals target:
                    return mid  // Target found at index mid
                else if array[mid] < target:
                    low = mid + 1  // Discard the left half
                else
                    high = mid - 1  // Discard the right half
                end if
            end while
            return -1  // Target not found
         end function

         //Test

         array = [1, 3, 5, 7, 9, 11]
         target = 7

         result = binarySearch(array, target)/
            if result != -1:
                print("Target found at index", result)
            else:
                print("Target not found in the array")

     */

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int target = 5;

        int result = binarySearch(arr, target);

        if (result != -1) {
            System.out.println("Target found at index: " + result);
        }else {
            System.out.println("Target not found in the array");
        }
    }
    public static int binarySearch(int[] arr,int target){
        int left = 0;
        int right = arr.length - 1;

        while(left <= right){
            int mid =  (left + right) / 2;

            if(arr[mid] == target){
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return  -1;
    }
}


