package Algorithms._3_Patterns._9_Pattern_31;

public class Main {
    public static void main(String[] args) {
        int n = 4;
        int originalN = n;
        n = n * 2;

        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                //int atEveryIndex = Math.min(Math.min(row,col), Math.min(n-row, n-col)); // another example
                int atEveryIndex = originalN -  Math.min(Math.min(row,col), Math.min(n-row, n-col));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }
}
