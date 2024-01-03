package Algorithms._4_Recursion._3_Array_Questions._3_Linear_Search_on_multiple_occurrences;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2,3,1,4,4,5};
        int target = 4;

        //call the function
        findAllIndex(arr,target,0);

        //print the value of arraylist
        System.out.println(list);
    }

    //using external arraylist outside the function

        //create array list and save the indexes
        static ArrayList<Integer> list = new ArrayList<>();
        //find index number and print
        public static void findAllIndex(int[] arr, int target, int index){
            //base condition
            if(index == arr.length){
                return;
            }

            if(arr[index] == target){
                list.add(index);
            }
            findAllIndex(arr, target,index+1);
        }
}
