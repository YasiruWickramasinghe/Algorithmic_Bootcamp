package Algorithms._3_Patterns._8_Pattern_17;

public class Main {
    public static void main(String[] args) {
        int n = 5;

        for (int row = 1; row <= 2 * n; row++) {
            int totalColsInRow = row > n ? 2 * n - row : row;

            //spaces
            for (int spaces = 0; spaces < n- totalColsInRow; spaces++) {
                System.out.print("  ");
            }

            //row till 1
            for (int col = totalColsInRow; col >= 1; col--) {
                System.out.print(col + " ");
            }

            //2 till row
            for (int col = 2; col <= totalColsInRow; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
