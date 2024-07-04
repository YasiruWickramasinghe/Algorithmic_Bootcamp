package Algorithms._1_Searching_Algorithms._2_BinarySearch._1_BaseAlgorithm;

public class BinarySearch {
    /**
     * Description:
     * Binary search is an efficient searching algorithm that works on sorted lists. It repeatedly divides the search space in half, reducing the problem size by half with each comparison.
     * binary search is more efficient than linear search.
     * if we search 1000 elements in an array. if targeted value is 1000, then binary search get only approximately 10 steps but linear search get 1000 steps

     * Steps:
         * i)    declare an array
         * ii)   pass arr and target value to function
         * iii)  declare left to 0 and right to length of array
         * iv)   Iterate array until left is less than or equal to right using while loop
         * v)    declare mid-point inside while loop
         * vi)   then check targeted element is equal to mid-point, the search is successful, return mid-point
         * vii)  if not check mid-point less than targeted value, if true, then set left to mid + 1
         * viii) if not check mid-point greater than targeted value, if true, then set right to mid - 1
         * ix)   print result in main console

     * Pseudo Code:

         * function binarySearch(array, target):
             n = length(arr)
                 // check whether array is empty
                 if n equals 0
                 return -1
                 end if

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
     **/

    public static int binarySearch(int[] arr, int target) {
        int length = arr.length;

        //check whether array is empty
        if (length == 0) {
            return -1;
        }

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {

            //might be possible that (start + end) exceed the range of integer
            //int mid = (left + right) / 2;

            //this will work
            // left + (right - left) / 2    ->  (2left + right - left) / 2   ->  (left + right) / 2
            int mid = left + (right - left) / 2;


            if (target > arr[mid]) {
                left = mid + 1;
            } else if (target < arr[mid]) {
                right = mid - 1;
            } else {
                //answer
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {-18, -12, -3, 0, 2, 2, 3, 15, 25, 29, 87};
        int target = 25;

        int result = binarySearch(arr, target);

        if (result != -1) {
            System.out.println("Target found at index: " + result);
        } else {
            System.out.println("Target not found in the array");
        }
    }
}


