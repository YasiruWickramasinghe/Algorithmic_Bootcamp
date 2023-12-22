package Algorithms._1_Searching_Algorithms._2_BinarySearch._2_Matrix_2DArray._1_Search_In_Matrix_Sorted_by_Row_Col_Manner;

import java.util.Arrays;

public class SortedRowColManner {
    public static void main(String[] args) {

        //This sorted by row and column wise manner
        int[][] arr = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };

        int target = 39;

        System.out.println("ans : " + Arrays.toString(search(arr, target)));
    }

    static int[] search(int[][] matrix, int target) {
        int row = 0;
        int col = matrix.length - 1;

        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                return new int[]{row, col};
            }
            if (matrix[row][col] < target) {
                row++;
            } else {
                col--;
            }
        }
        return new int[]{-1, -1};
    }
}
