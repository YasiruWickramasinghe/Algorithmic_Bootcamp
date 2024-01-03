package Algorithms._4_Recursion._2_Level_1_Questions._7_Reverse_a_Number._1_Solution_1;

public class Main {

    //outside function we define static
    static int sum = 0;

    private static void reverseNumber(int num) {
        if(num == 0){
            return;
        }
        int remainder = num % 10;
        sum = (sum * 10) + remainder;

        reverseNumber(num / 10);
    }
    public static void main(String[] args) {
        int num = 12345;
        reverseNumber(num);
        System.out.println(sum);
    }
}
