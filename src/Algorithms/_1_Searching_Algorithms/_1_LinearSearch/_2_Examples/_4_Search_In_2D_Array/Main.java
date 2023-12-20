package Algorithms._1_Searching_Algorithms._1_LinearSearch._2_Examples._4_Search_In_2D_Array;

public class Main {
    private static boolean search(int[][] arr, int target) {
        //check whether array is empty
        if (arr.length == 0) {
            return true;
        }

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean search2(int[][] arr, int target) {
        //check whether array is empty
        if (arr.length == 0) {
            return true;
        }

        for (int[] row : arr) {
            for (int col : row) {
                if (col == target) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] arr = {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 12}
        };
        int target = 99;

        //using normal for loop
        //boolean result = search(arr, target);

        ////using enhanced for loop
        boolean result = search2(arr, target);

        if (result) {
            System.out.println("Found: " + result);
        } else {
            System.out.println("Found: " + result);
        }
    }


}
