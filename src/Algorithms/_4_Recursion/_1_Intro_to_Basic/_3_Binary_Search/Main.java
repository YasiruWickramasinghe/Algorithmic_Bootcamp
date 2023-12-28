package Algorithms._4_Recursion._1_Intro_to_Basic._3_Binary_Search;

public class Main {
//this is example for divide and conquer recurrence

    /**
     *
     * //Description:
     *         //Binary search is an efficient searching algorithm that works on sorted lists. It repeatedly divides the search space in half, reducing the problem size by half with each comparison.
     *         //binary search is more efficient than linear search.
     *         //if we search 1000 elements in an array. if targeted value is 1000, then binary search get only approximately 10 steps but linear search get 1000 steps
     *
     *     //Steps:
     *         //declare an array
     *         //pass array, target value, left and right to function
     *         //check left index is less than or equal to right index using if condition
     *         //declare mid-point inside while loop
     *         //then check targeted element is equal to mid-point using if condition, the search is successful, return mid-point
     *         //if not check mid-point less than targeted value, if true, then recall the binarySearch function passing with array, target value, mid+1 and right
     *         //if not check mid-point greater than targeted value, if true, then recall the binarySearch function passing with array, target value, left and mid-1
     *         //print result in main console
     *
     *
    pseudo code:

      function binarySearch(arr, target, start, end):
             // Base case: if the start index is greater than the end index, the target is not in the array
            if start > end:
            return -1

          // Calculate the middle index
          mid = start + (end - start) / 2

              // Three cases

                // Case 1: The target is found at the middle index
                if arr[mid] == target:
                    return mid

                // Case 2: The target is in the left half, so recursively search the left side
                else if target < arr[mid]:
                    return binarySearch(arr, target, start, mid - 1)

                // Case 3: The target is in the right half, so recursively search the right side
                else:
                    return binarySearch(arr, target, mid + 1, end)




      // Example usage
          arr = [11, 24, 26, 28, 35, 48, 65, 78, 79, 83, 85, 94, 97]
          target = 79
          start = 0
          end = length(arr) - 1
          result = binarySearch(arr, target, start, end)

      if result != -1:
          print("Index number:", result)
      else:
          print("Did not find the target value!")


     */

    public static void main(String[] args) {
        int[] arr = {11, 24, 26, 28, 35, 48, 65, 78, 79, 83, 85, 94, 97};
        int target = 79;

        int start = 0;
        int end = arr.length - 1;

        int ans = search(arr, target, start, end);

        if (ans != -1) {
            System.out.println("Index number: " + ans);
        } else {
            System.out.println("Did not find the target value!");
        }
    }

    static int search(int[] arr, int target, int start, int end) {

        // this two can't declare inside this method because this call itself, if we declare all time start and end will same
        //int start = 0;
        //int end = arr.length -1;

        //brake the recursion
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        //three time check condition
        if (arr[mid] == target) {
            return mid;
        } else if (target < arr[mid]) {
            //hey search my left hand side
            return search(arr, target, start, mid-1);
        } else {
            //hey search my right hand side
            return search(arr, target, mid+1, end);
        }

    }
}
