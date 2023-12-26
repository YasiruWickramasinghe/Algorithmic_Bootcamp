package Algorithms._2_Sorting_Algorithms._4_Cycle_Sort._2_LeetCode.Kunal._4_Find_All_Duplicates_in_an_Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> ans = allDuplicateNumbers(arr);
        System.out.println("Disappeared Numbers Are: " + Arrays.toString(ans.toArray()));
    }

    private static List<Integer> allDuplicateNumbers(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctPosition = arr[i] - 1;
            if (arr[i] != arr[correctPosition]) {
                swap(arr, i, correctPosition);
            } else {
                i++;
            }
        }

        //find duplicates values
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) { // because array start from 1 to n
                ans.add(arr[index]);
            }
        }
        return ans;
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

