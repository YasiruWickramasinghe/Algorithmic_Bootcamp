package Algorithms._3_Patterns._7_Pattern_30;

public class Main {
    public static void main(String[] args) {
        int n = 5;

        for (int row = 1; row <= n; row++) {

            //spaces
            for (int spaces = 0; spaces < n-row; spaces++) {
                System.out.print("  ");
            }

            //row till 1
            for (int col = row; col >= 1; col--) {
                System.out.print(col + " ");
            }

            //2 till row
            for (int col = 2; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
