package Algorithms._2_Sorting_Algorithms._4_Cycle_Sort._2_LeetCode.Kunal._1_Missing_Number;

public class Main {
    //This is Amazon Question
    public static void main(String[] args) {
        int[] arr = {4,0,2,1}; // Array in the range 0 to n // Important! correct index is (value) like array[i]
        //int[] arr = {4,5,2,1}; // Array in the range 1 to n // Important! correct index is (value - 1) like array[i] - 1
        int ans = missingNumber(arr);
        System.out.println("Missing Number is : " + ans);
    }

    static int missingNumber(int[] arr) {
        int i = 0;
        while(i < arr.length){
            int correctPosition = arr[i]; // because array start index 0 // here correct index is that index because here array start from 0, not 1 if it start from 1 then correctIndex is arr[i] - 1;
            if(arr[i] < arr.length && arr[i] != arr[correctPosition]){
                swap(arr, i , correctPosition);
            } else {
                i++;
            }
        }

        //search for first missing number
        for (int index = 0; index <  arr.length; index++) {
            if(arr[index] != index){ // index = index because array start index 0
                return index;
            }
        }

        //case 2
        return arr.length;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
