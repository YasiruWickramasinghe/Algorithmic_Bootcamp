package Algorithms._4_Recursion._2_Level_1_Questions._8_Palindrome_Number;

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

    static boolean palindrome(int n){
        return(n == reverseNumber(n));
    }

    public static void main(String[] args) {
        int n = 123321;
        System.out.println(palindrome(n));
    }
}
