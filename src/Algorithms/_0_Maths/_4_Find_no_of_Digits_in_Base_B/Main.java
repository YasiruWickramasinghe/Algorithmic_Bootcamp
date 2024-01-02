package Algorithms._0_Maths._4_Find_no_of_Digits_in_Base_B;

public class Main {
    public static void main(String[] args) {
        int n = 10;

        int b = 2;

        int ans = (int)(Math.log(n) / Math.log(b)) + 1;

        System.out.println(ans);
    }
}
