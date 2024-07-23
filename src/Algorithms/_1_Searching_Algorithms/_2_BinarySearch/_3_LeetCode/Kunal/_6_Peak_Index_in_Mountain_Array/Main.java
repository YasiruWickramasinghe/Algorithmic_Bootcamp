package Algorithms._1_Searching_Algorithms._2_BinarySearch._3_LeetCode.Kunal._6_Peak_Index_in_Mountain_Array;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 4, 3, 2};

        int mountain = peakOfMountain(arr);

        System.out.println(arr[mountain]);
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
        //in the end, start == end and pointing to largest number because of the 2 check above
        //start and end are always trying to find max element in the above 2 checks
        //hence, when they are pointing to just one element, that is the maximum value
        //more elaboration : at every point of time for start and end, they have the best possible answer till that time
        //we are saying only one item is remaining, hence cuz of above line that is the best possible answer
        return right; // we can return start or end because both are equal
    }
}
