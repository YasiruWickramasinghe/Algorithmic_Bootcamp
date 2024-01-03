package Algorithms._4_Recursion._4_Patterns_and_Basic_Sort._1_Triangle_1;

public class Main {
    public static void main(String[] args) {
        triangle(4,0);
    }

    static void triangle(int row, int col){
        if(row == 0){
            return;
        }
        if(col < row){
            System.out.print("*");
            triangle(row, col+1);
        }else {
            System.out.println();
            triangle(row-1, 0);
        }
    }
}
