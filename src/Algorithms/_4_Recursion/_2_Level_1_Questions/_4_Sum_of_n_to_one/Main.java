package Algorithms._4_Recursion._2_Level_1_Questions._4_Sum_of_n_to_one;

public class Main {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(addition(n));
    }

    private static int addition(int n) {
        if(n <= 1){
            return 1;
        }

        return n + addition(n - 1);
    }
}
