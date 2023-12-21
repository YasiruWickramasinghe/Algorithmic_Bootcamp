package Algorithms._1_Searching_Algorithms._2_BinarySearch._3_LeetCode.Kunal._5_Position_of_an_Element_in_Infinite_Sorted_Array;

/**
 * This is Amazon Interview Question
 */
public class Main {
    public static void main(String[] args) {
        //here in array length should be doubled every time therefore check length of an array here,
        //otherwise give error like index out of the bound, in real world we cant imagine infinite array
        //therefore we use fixed size array
        //if we use this array {2, 3, 5, 6, 7, 8, 10, 11, 12, 15, 20, 23, 30} it give us error index out of the bound

        int[] arr = {2, 3, 5, 6, 7, 8, 10, 11, 12, 15, 20, 23, 30, 41};
        int target = 10;

        int res = ans(arr, target);
        System.out.println("target element found at index: " + res);
    }

    private static int ans(int[] arr, int target) {
        //first find the range
        //start with array length is 2
        int start = 0;
        int end = 1;

        //condition for the target to lie in the range
        while (target > arr[end]) {
            int temp = end + 1; // this is new start
            //double the box value
            //end = previous end + size of box * 2
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return binarySearch(arr, target, start, end);
    }

    private static int binarySearch(int[] arr, int target, int start, int end) {

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
