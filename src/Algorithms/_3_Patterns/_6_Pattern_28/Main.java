package Algorithms._3_Patterns._6_Pattern_28;

public class Main {
    public static void main(String[] args) {
        int n = 5;

        for (int row = 1; row <= n * 2; row++) {
            int totalColsInRow = row > n ? 2 * n - row : row; // no of cols = n - (row - n) -> 2n - row
            int noOfSpaces = n - totalColsInRow;

            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print(" ");
            }

            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
