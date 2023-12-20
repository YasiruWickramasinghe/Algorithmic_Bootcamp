package Algorithms._1_Searching_Algorithms._1_LinearSearch._3_LeetCode.Kunal._2_Richest_Customer_Wealth;

public class Main {

    private static int MaxWealth(int[][] arr) {

        int maxWealth = Integer.MIN_VALUE;

        for (int person = 0; person < arr.length; person++) {
            int count = 0;

            for (int account = 0; account < arr[person].length; account++) {
                count += arr[person][account];
            }

            if (count > maxWealth) {
                maxWealth = count;
            }
        }
        return maxWealth;

        //using enhanced  for loop
        /*
            for (int[] ints : arr) {
                int count = 0;

                for (int anInt : ints) {
                    count += anInt;
                }

                if (count > maxWealth) {
                    maxWealth = count;
                }
            }
            return maxWealth
         */
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1, 5},
                {7, 8},
                {11, 2}
        };

        System.out.println("Richest wealth is: " + MaxWealth(arr));
    }


}
