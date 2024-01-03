package Algorithms._4_Recursion._4_Patterns_and_Basic_Sort._2_Triangle_2;

public class Main {
    public static void main(String[] args) {
        triangle(4,0);
    }

    static void triangle(int row, int col){
        if(row == 0){
            return;
        }
        if(col < row){
            triangle(row, col+1);
            System.out.print("*");
        }else {
            triangle(row-1, 0);
            System.out.println();
        }
    }
}
