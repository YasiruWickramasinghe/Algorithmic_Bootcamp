package Algorithms._4_Recursion._3_Array_Questions._5_Return_the_list_without_passing_the_argument;

import java.util.ArrayList;

//this is not optimized therefore don't use this

public class Main {
    public static void main(String[] args) {
        int[] arr = {2,3,1,4,4,5};
        int target = 4;

        System.out.println(findAllIndex(arr,target,0));
    }

    //Solution 2 - return the array list without passing the argument

    //find index number and return
    public static ArrayList<Integer> findAllIndex(int[] arr, int target, int index){
        //create new arraylist
        ArrayList<Integer> list = new ArrayList<>();

        //base condition
        if(index == arr.length){
            return list;
        }

        //this will contain answer for that function call only
        if(arr[index] == target){
            list.add(index);
        }

        //here after returning save the answers to this array list
        ArrayList<Integer> ansFromBelowCalls  = findAllIndex(arr, target,index+1);

        //coming back means after returning above recursive function this will happen, added to the list all answers
        list.addAll(ansFromBelowCalls);
        return list;
    }
}