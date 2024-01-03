package Algorithms._4_Recursion._3_Array_Questions._2_Linear_Search;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,5,4,7,9,8};
        int target = 9;

        //target found using boolean
        System.out.println(findTarget(arr,target,0));

        //return the index value
        System.out.println(findIndex(arr,target,0));
    }

    //return true if found the target
    public static boolean findTarget(int[] arr, int target, int index){
        //base condition
        if(index == arr.length){
            return false;
        }

        return arr[index] == target || findTarget(arr, target,index+1);
    }

    //find index number and return
    public static int findIndex(int[] arr, int target, int index){
        //base condition
        if(index == arr.length){
            return -1;
        }

        if(arr[index] == target){
            return index;
        } else {
            return  findIndex(arr, target,index+1);
        }
    }
}
