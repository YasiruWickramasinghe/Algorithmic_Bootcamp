package Algorithms._3_Patterns._2_Pattern_1;

public class Main {
    public static void main(String[] args) {
        int lines = 5;

        for (int row = 0; row < lines; row++) {
            for (int col = 0; col < lines; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
