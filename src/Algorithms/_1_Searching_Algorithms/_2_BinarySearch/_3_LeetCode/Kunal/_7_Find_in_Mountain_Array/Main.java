package Algorithms._1_Searching_Algorithms._2_BinarySearch._3_LeetCode.Kunal._7_Find_in_Mountain_Array;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 12, 23, 56, 62, 42, 31, 2};
        int target = 1;

        int mountain = search(arr, target);

        System.out.println(mountain);
    }

    private static int search(int[] arr, int target) {
        //get the peak index
        int peak  = peakOfMountain(arr);

        //search in first half/ acs order half
        int firstTry = orderAgnosticBinarySearch(arr, target, 0, peak);
        if(firstTry != -1){
            return firstTry;
        }

        //search in first half/ acs order half
        return orderAgnosticBinarySearch(arr, target, peak+1, arr.length-1);
    }

    private static int peakOfMountain(int[] arr) {
        int length = arr.length;

        //check whether array is empty
        if (length == 0) {
            return -1;
        }

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            int mid = left + (right - left) / 2;

            if (arr[mid] > arr[mid + 1]) {
                //you are in des part of array
                //this may be the ans, but look at left
                //this why end != mid - 1
                right = mid;
            } else if (arr[mid] < arr[mid + 1]){
                //you are in asc part of array
                left =  mid + 1;
            }
        }
        return right; // we can return start or end because both are equal
    }

    public static int orderAgnosticBinarySearch(int[] arr, int target, int left, int right) {

        boolean isAsc = arr[left] < arr[right];

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if(arr[mid] == target){
                return mid;
            }
            if(isAsc){
                if (target < arr[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }
        return -1;
    }
}
