package Algorithms._4_Recursion._2_Level_1_Questions._1_print_n_to_one;

public class  Main {
    public static void main(String[] args) {
        int n = 5;
        printNumber(n);
    }

    //print n to 1 using recursion function
    public static void printNumber(int n){
        if(n == 0){
            return;
        }
        System.out.print(n + " ");
        printNumber(n-1);
    }
}
