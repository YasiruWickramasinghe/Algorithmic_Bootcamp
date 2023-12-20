package Algorithms._1_Searching_Algorithms._2_BinarySearch._1_BaseAlgorithm;

public class OrderAgnosticBinarySearch {

    public static int orderAgnosticBinarySearch(int[] arr, int target) {
        int length = arr.length;

        //check whether array is empty
        if (length == 0) {
            return -1;
        }

        int left = 0;
        int right = arr.length - 1;

        //check whether ascending or descending order
            //if(arr[left] < arr[right]){
            //    isAsc = true;
            //} else {
            //    isAsc = false;
            //}
        boolean isAsc = arr[left] < arr[right];

        while (left <= right) {

            //might be possible that (start + end) exceed the range of integer
            //int mid = (left + right) / 2;

            //this will work
            // left + (right - left) / 2    ->  (2left + right - left) / 2   ->  (left + right) / 2
            int mid = left + (right - left) / 2;

            if(arr[mid] == target){
                return mid;
            }
            if(isAsc){
                System.out.println("asc");
                if (target < arr[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                System.out.println("desc");
                if (target > arr[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }
        return -1;


    }


    public static void main(String[] args) {
        //this algorithms first check whether Array is sorted at ascending order or descending order
        //then perform the task

        //ascending array
            int arr[] = {-18, -12, -3, 0, 2, 2, 3, 15, 25, 29, 87};
            int target = 25;

        //descending array
            //int arr[] = {18, 12, 3, 0, -2, -21, -55, -75, -79, -87};
            //int target = -75;


        int result = orderAgnosticBinarySearch(arr, target);

        if (result != -1) {
            System.out.println("Target found at index: " + result);
        } else {
            System.out.println("Target not found in the array");
        }
    }
}
