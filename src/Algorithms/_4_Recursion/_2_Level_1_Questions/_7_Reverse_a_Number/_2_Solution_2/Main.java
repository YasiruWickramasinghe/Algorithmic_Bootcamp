package Algorithms._4_Recursion._2_Level_1_Questions._7_Reverse_a_Number._2_Solution_2;

public class Main {
    public static void main(String[] args) {
        int num = 12345;
        int sum = 0;
        System.out.println(reverseNumber(num));
    }

    private static String reverseNumber(int num) {
        if(num <= 0){
            return "0";
        }
        //int remainder = num % 10;
        //sum = sum + remainder;

        num = num / 10;

        return reverseNumber(num / 10) + "num % 10";
    }
}
