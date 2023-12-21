package Algorithms._1_Searching_Algorithms._2_BinarySearch._3_LeetCode.Kunal._4_First_and_Last_Position_in_Sorted_Array;

import java.util.Arrays;

/**
 * This is facebook interview question
 */

public class Main {

    private static int[] firstAndLastPosition(int[] arr, int target) {
        //if answer not found return {-1, -1}
        int[] ans = {-1, -1};

        //check for first occurrence if target first
        ans[0] = search(arr, target, true);

        if (ans[0] != -1) {
            ans[1] = search(arr, target, false);
        }
        return ans;

    }

    // this function just returns the index value of target
    static int search(int[] arr, int target, boolean findStartIndex) {

        int ans = -1;
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                //potential answer is found (potential mean may be possible)
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {5, 6, 6, 7, 7, 7, 8, 8, 8, 8, 8, 9, 10};
        int target = 8;
        int[] res = firstAndLastPosition(arr, target);

        System.out.println("first and last position is: " + Arrays.toString(res));
    }
}
