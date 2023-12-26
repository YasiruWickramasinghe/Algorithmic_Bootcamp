package Algorithms._2_Sorting_Algorithms._4_Cycle_Sort._2_LeetCode.Kunal._3_Find_the_Duplicate_Number;

public class Main {
    //Question from microsoft
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 2};
        int ans = duplicateNumber(arr);
        System.out.println("Disappeared Number is: " + ans);
    }

    private static int duplicateNumber(int[] arr) {
        int i = 0;
        while (i < arr.length) {

            if(arr[i] != i + 1) {
                    int correctPosition = arr[i] - 1;
                    if (arr[i] != arr[correctPosition]) {
                        swap(arr, i, correctPosition);
                    } else {
                        return arr[i];
                    }
                }else {
                    i++;
                }
            }
        return  -1;
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
