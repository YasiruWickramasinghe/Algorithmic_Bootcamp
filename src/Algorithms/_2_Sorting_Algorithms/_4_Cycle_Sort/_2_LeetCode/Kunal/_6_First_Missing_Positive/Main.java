package Algorithms._2_Sorting_Algorithms._4_Cycle_Sort._2_LeetCode.Kunal._6_First_Missing_Positive;

public class  Main {
    //Amazon question
    public static void main(String[] args) {
        int[] arr = {1,2,0};
        int ans = firstMissingPositive(arr);
        System.out.println("First Missing Positive Number is : " + ans);
    }

    static int firstMissingPositive(int[] arr) {
        int i = 0;
        while(i < arr.length){
            int correctPosition = arr[i] - 1;
            if(arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correctPosition]){
                swap(arr, i , correctPosition);
            } else {
                i++;
            }
        }

        //search for first missing number
        for (int index = 0; index <  arr.length; index++) {
            if(arr[index] != index + 1){
                return index + 1;
            }
        }
        return arr.length + 1;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
