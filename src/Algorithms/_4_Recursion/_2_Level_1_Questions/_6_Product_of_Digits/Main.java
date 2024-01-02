package Algorithms._4_Recursion._2_Level_1_Questions._6_Product_of_Digits;

public class Main {
    public static void main(String[] args) {
        int num = 1342; //ans = 1 * 3 * 4 * 2 -> 24
        System.out.println(prodDigits(num));
    }

    public static int prodDigits(int num){
        if(num%10 == num){
            return num;
        }

        return (num % 10) * prodDigits(num / 10);
    }
}
