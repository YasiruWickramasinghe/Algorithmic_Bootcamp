package Algorithms._4_Recursion._2_Level_1_Questions._5_Sum_of_Digits;

public class Main {
    public static void main(String[] args) {
        int num = 1342; //ans = 1 + 3 + 4 + 2 -> 10
        System.out.println(sumDigits(num));
    }

    private static int sumDigits(int num) {

        if(num == 0){
            return 0;
        }
        return sumDigits(num / 10) + (num % 10);
    }
}
