package Algorithms._4_Recursion._2_Level_1_Questions._2_print_one_to_n;

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
        printNumber(n-1);
        System.out.print(n + " ");
    }
}
