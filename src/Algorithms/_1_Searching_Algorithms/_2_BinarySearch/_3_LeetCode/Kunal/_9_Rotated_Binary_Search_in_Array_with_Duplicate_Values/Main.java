package Algorithms._1_Searching_Algorithms._2_BinarySearch._3_LeetCode.Kunal._9_Rotated_Binary_Search_in_Array_with_Duplicate_Values;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2,9,2,2,2,2};
        int target = 9;
        System.out.println(search(arr, target));

    }
    //find the answer using pivot
    public static int search(int[] arr, int target) {
        int pivot = findPivotWithDuplicates(arr);

        //if you did't find a pivot, it means the array is not rotated
        if(pivot == -1){
            //just do normal binary search
            return binarySearch(arr, target, 0, arr.length-1);
        }
        // if pivot is found, you have found 2 asc sorted arrays
        // 3 cases
        if(arr[pivot] == target){
            return  pivot;
        } else if(target >= arr[0]){
            return binarySearch(arr, target, 0, pivot-1);
        } else {
            return binarySearch(arr, target, pivot+1, arr.length-1);
        }
    }

    //find the pivot index if array has duplicate values
    static int findPivotWithDuplicates(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            //3 cases over here
            //case 1
            //here also check mid < end otherwise there can be error like "Index out of the bound"
            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            //case 2
            //here also check mid > start otherwise there can be error like "Index out of the bound"
            if(mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }
            //case 3
            //if element at middle, start or end are equal then just skip the duplicates
            if(arr[mid] ==  arr[start] && arr[mid] ==  arr[end] ){
                //skip the duplicates
                //what if these elements at start and end were the pivots ?
                //check if start is pivot
                if(arr[start] > arr[start+1]){
                    return start;
                }
                start++;

                //check whether end is pivot
                if(arr[end] < arr[end-1]){
                    return end - 1;
                }
                end--;
            }
            //left side is sorted, so pivot should be in right
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end]) ){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return  -1;
    }

    //binary search
    public static int binarySearch(int[] arr, int target, int left, int right) {
        int length = arr.length;

        //check whether array is empty
        if (length == 0) {
            return -1;
        }

        while (left <= right) {
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
}
