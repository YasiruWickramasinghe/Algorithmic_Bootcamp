package Algorithms._4_Recursion._3_Array_Questions._4_Return_an_ArrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2,3,1,4,4,5};
        int target = 4;

        ArrayList<Integer> ans = findAllIndex(arr,target,0, new ArrayList<>());
        System.out.println(ans);

        //same as above but arraylist create separately
            //ArrayList<Integer> list = new ArrayList<>();
            //ArrayList<Integer> ans = findAllIndex(arr,target,0, list);
            //System.out.println(ans);

    }

    //Solution 2 - return the array list with passing the argument

    //find index number and return
    public static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list){
        //base condition
        if(index == arr.length){
            return list;
        }

        if(arr[index] == target){
            list.add(index);
        }
        return findAllIndex(arr, target,index+1, list);
    }
}
