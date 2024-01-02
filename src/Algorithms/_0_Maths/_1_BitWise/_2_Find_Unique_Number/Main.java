package Algorithms._0_Maths._1_BitWise._2_Find_Unique_Number;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2,3,3,4,2,6,4};

        System.out.println("Unique Number is: "+uniqueNumber(arr));
    }

    private static int uniqueNumber(int[] arr) {
        int unique = 0;

        for (int n: arr) {
            unique ^= n;
        }
        return unique;
    }
}
