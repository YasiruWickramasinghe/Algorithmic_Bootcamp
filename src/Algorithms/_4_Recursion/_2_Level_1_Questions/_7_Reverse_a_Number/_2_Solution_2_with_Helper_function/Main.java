package Algorithms._4_Recursion._2_Level_1_Questions._7_Reverse_a_Number._2_Solution_2_with_Helper_function;

public class Main {
    private static int reverseNumber(int n) {
        //sometimes you might need some additional variables in the argument
        //in that case, make another function
        int digits = (int)(Math.log10(n) + 1);
        return helper(n, digits);
    }

    private static int helper(int n, int digits) {
        if(n%10 == n){
            return n;
        }
        int rem = n%10;
        return rem * (int)(Math.pow(10, digits-1)) + helper(n/10, digits-1);
    }

    public static void main(String[] args) {
        int n = 12345;
        System.out.println(reverseNumber(n));;
    }
}
