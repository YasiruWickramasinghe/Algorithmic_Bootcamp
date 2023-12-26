package Algorithms._2_Sorting_Algorithms._4_Cycle_Sort._2_LeetCode.Kunal._2_Find_All_Numbers_Disappeared_in_an_Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    //Google question
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        List<Integer> ans = allDisappearedNumbers(arr);
        System.out.println("Disappeared Numbers Are: " + Arrays.toString(ans.toArray()));
    }

    private static List<Integer> allDisappearedNumbers(int[] arr) {
        int i = 0;
        while(i < arr.length){
            int correctPosition = arr[i] - 1; // because array start index 1
            if(arr[i] != arr[correctPosition]){
                swap(arr, i , correctPosition);
            }else {
                i++;
            }
        }

        //just find missing numbers
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if(arr[index] != index+1 ){ // index = index + 1 because array start index 1 // index = value - 1 therefore, value = index + 1
                ans.add(index+1);
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
