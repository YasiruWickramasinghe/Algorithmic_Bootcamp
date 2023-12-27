package Algorithms._3_Patterns._5_Pattern_5;

public class Main {
    public static void main(String[] args) {
        int n = 5;

        for (int row = 1; row < n * 2; row++) {
            int totalColsInRow = row > n ? 2 * n - row : row; // no of cols = n - (row - n) -> 2n - row
            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
