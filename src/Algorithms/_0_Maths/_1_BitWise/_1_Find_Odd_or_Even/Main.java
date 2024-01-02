package Algorithms._0_Maths._1_BitWise._1_Find_Odd_or_Even;

public class Main {
    //check number is odd or even using binary
    public static void main(String[] args) {
        int num = 10;

        boolean ans = isOdd(num);

        if(ans){
            System.out.println("Odd");
        }else {
            System.out.println("Even");
        }
    }

    private static boolean isOdd(int num){
        //using decimal number format
        //return num % 2 != 0;

        //using binary number format -> here decimal convert to binary and then check
        return (num & 1) == 1;
    }
}
