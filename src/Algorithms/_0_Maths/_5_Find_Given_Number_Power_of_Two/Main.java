package Algorithms._0_Maths._5_Find_Given_Number_Power_of_Two;

public class Main {
    public static void main(String[] args) {
        int n = 8;

        boolean ans = (n & (n-1)) == 0;

        System.out.println(ans);
    }
}
