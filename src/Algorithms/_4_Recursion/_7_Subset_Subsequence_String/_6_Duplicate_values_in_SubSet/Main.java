package Algorithms._4_Recursion._7_Subset_Subsequence_String._6_Duplicate_values_in_SubSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,2};
        List<List<Integer>> ans = subsetDuplicate(arr);
        for(List<Integer> list : ans){
            System.out.println(list);
        }
    }

    static List<List<Integer>> subsetDuplicate(int[] arr){
        //sort the array
        Arrays.sort(arr);

        //outerList, Data_Structures._4_Trees._1_Binary_Trees.Main List
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        //initialize start and end point
        int start = 0;
        int end = 0;

        for(int i = 0; i < arr.length; i++){
            start = 0;

            //if current and previous element is same, s = e + 1
            if(i > 0 && arr[i] == arr[i-1]){
                start = end + 1;
            }
            end = outer.size() - 1;
            int n = outer.size();
            for (int j = start; j < n; j++) {
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }

        return outer;
    }
}
