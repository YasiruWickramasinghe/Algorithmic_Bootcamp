package Algorithms._1_Searching_Algorithms._2_BinarySearch._3_LeetCode.Kunal._10_Rotation_Count;

public class Main {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int rotations = countRotation(arr);
        System.out.println("No of rotations: " + rotations + " times.");

    }

    private static int countRotation(int[] arr) {
        int pivot = findPivot(arr);
        //int pivot = findPivotWithDuplicates(arr);

        return pivot + 1;
    }


    //find the pivot index
    //this will not work with duplicate values;
    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            //4 cases over here
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
            //basically all the elements after the mid element smaller than start
            if(arr[mid] <=  arr[start]){
                end = mid - 1;
            } else {
                //case 4
                //basically all the elements after the mid element smaller than start
                start = mid + 1;

            }
        }
        return  -1;
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
}
