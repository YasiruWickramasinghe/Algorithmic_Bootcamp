package Algorithms._1_Searching_Algorithms._2_BinarySearch._0_Practice;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 7, 9, 12};
        int target = 6;

        int result = binarySearch(arr, target);

        if(result == -1){
            System.out.println("target not found");
        }else {
            System.out.println("ceiling of number " + target + " found at index  " + result + ", that value is " + arr[result]);
        }
    }

    public static int binarySearch(int[] arr, int target){

        int size = arr.length;

        if(size == 0){
            System.out.println("Empty Array");
        }

        int left = 0;
        int right = size - 1;

        while(left <= right){
            int mid = left + (right - left) / 2;

            if(arr[mid] == target){
                return mid;
            }

            if(arr[mid] > target){
                right = mid - 1;
            }

            if(arr[mid] < target){
                left = mid + 1;
            }

        }

        return left;
    }
}
