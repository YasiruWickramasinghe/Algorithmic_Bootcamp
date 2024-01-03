package Algorithms._4_Recursion._3_Array_Questions._1_Sorted_Array;

public class Main {
    public static void main(String[] args) {
        int[] arr = {10,15,17,28,65,97};

        System.out.println(isSorted(arr, 0));
    }
    public static boolean isSorted(int[] arr, int index){
        //base condition
        if(index == arr.length -1){
            return true;
        }

        return arr[index] < arr[index+1] && isSorted(arr, index + 1);
    }
}
