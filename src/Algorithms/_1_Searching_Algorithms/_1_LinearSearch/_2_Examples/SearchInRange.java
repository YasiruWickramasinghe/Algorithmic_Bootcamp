package Algorithms._1_Searching_Algorithms._1_LinearSearch._2_Examples;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {12, -4, 68, 9, -54, 41, 18};
        int target = -54;
        int startIndex = 2;
        int endIndex = 5;

        int result = search(arr, target, startIndex, endIndex);

        if (result != -1) {
            System.out.println("target found  at index: " + result);
        } else {
            System.out.println("target not found!");
        }
    }

    private static int search(int[] arr, int target, int start, int end) {
        int size = arr.length;
        if (size == 0) {
            return -1;
        }

        for (int i = start; i <= end; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
