package Algorithms._2_Sorting_Algorithms._4_Cycle_Sort._2_LeetCode.Kunal._5_Set_Mismatch;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,2,4};
        int[] ans = setMismatch(arr);
        System.out.println("Mismatch Number and duplicate  is : " + Arrays.toString(ans));
    }

    static int[] setMismatch(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctPosition = arr[i] - 1;
            if (arr[i] != arr[correctPosition]) {
                swap(arr, i, correctPosition);
            } else {
                i++;
            }
        }

        // search for the missing and repeated numbers
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                return new int[]{arr[index], index + 1};
            }
        }
        return new int[] {-1, -1};
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
