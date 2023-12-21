package Algorithms._1_Searching_Algorithms._2_BinarySearch._3_LeetCode.Kunal._1_Ceiling_of_a_Number;

public class Main {
    private static int ceilingOfANumber(int[] arr, int target) {
        int size = arr.length - 1;

        //check if array is empty
        if(size == 0){
            return -1;
        }

        //check if target value is greater than to last element of array
        if(target > arr[size]){
            return -1;
        }

        int start = 0;
        int end = size;

        while(start <= end){
            //find middle point
            int mid = start + (end - start) / 2;

            if(target > arr[mid]){
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else{
                return mid;
            }
        }
        //In while loop if we didn't find target value while loop break because start < end then start become the greater value after target value
        return start;
    }

    public static void main(String[] args) {
        // Ceiling of a Number:
            // The ceiling of a number in an array is the smallest number in the array that is greater than or equal to the given number.

        int[] arr = {-45, -21,-3, 17, 21, 49, 98}; // This array is sorted in acs order therefore we know we can use binary search
        int target = 18;

        // if ceiling target value is greater than to last element of array then have to return -1
        //int target = 99;

        int res = ceilingOfANumber(arr, target);

        if(res != -1){
            //print value of ceiling number
            System.out.printf("Ceiling of %d is at index %d and its value is: %d%n", target, res, arr[res]);
        } else {
            System.out.println("No Ceiling number found. This target element greater than the last element of array");
        }
    }
}
