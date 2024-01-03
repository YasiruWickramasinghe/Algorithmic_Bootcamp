package Algorithms._4_Recursion._2_Level_1_Questions._9_Count_Zeros._2_Solution_2_with_Helper_Function;

public class Main {

    public static void main(String[] args) {
        int n = 30210; // 2 zeros
        System.out.println(countZeros(n));
    }
    private static int countZeros(int n) {
        //using helper function
        return helper(n, 0);
    }

    //special pattern, how to pass a number to above calls
    private static int helper(int n, int c) {
        if(n == 0){
            return c;
        }

        int rem = n % 10;

        if(rem == 0){
            return helper(n/10, c+1);
        }
        return helper(n/10, c);
    }
}
