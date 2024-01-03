package Algorithms._4_Recursion._2_Level_1_Questions._9_Count_Zeros._1_Solution_1;

public class Main {
    static int count = 0;
    private static void countZeros(int n) {
        if(n == 0){
            return;
        }
        int rem = n % 10;

        if(rem == 0){
            count += 1;
        }

        countZeros(n/10);
    }

    public static void main(String[] args) {
        int n = 30201407; // 3 zeros
        countZeros(n);
        System.out.println(count);
    }

}
