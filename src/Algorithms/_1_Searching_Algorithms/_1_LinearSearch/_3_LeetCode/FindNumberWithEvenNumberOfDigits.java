package Algorithms._1_Searching_Algorithms._1_LinearSearch._3_LeetCode;

public class FindNumberWithEvenNumberOfDigits {
    //solution 1
    private static int evenNumberDigits(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }

        int evenDigits = 0;

        for (int num : arr) {
            if (even(num)) {
                evenDigits++;
            }
        }
        return evenDigits;
    }

    //function to check whether number contain even digits
    private static boolean even(int num) {

        int numberOfDigits = digits(num);

//        if(numberOfDigits % 2 == 0) {
//            return true;
//        }
//        return false;

        return numberOfDigits % 2 == 0;

    }

    private static int digits(int num) {
        int count = 0;

        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }

    private static int digits2(int num) {
        return (int) (Math.log10(num)) + 1;
    }

    //solution 2
    /*
    private static int evenNumberDigits2(int[] arr) {
        if(arr.length == 0){
            return -1;
        }


        int evenDigits = 0;
        for (int i = 0; i < arr.length; i++) {

            int count = 0;
            while(arr[i] != 0){
                arr[i] = arr[i] / 10;
                count++;
            }

            if(count % 2 == 0){
                evenDigits++;
            }

        }
        return evenDigits;
    }
    */


    public static void main(String[] args) {
        int[] arr = {12, 372, 221, 6522, 72};
        int res = evenNumberDigits(arr);
        System.out.println("Even number digits contains: " + res + " numbers of array");

        //optimized way to find digits
        System.out.println("This number has " + digits2(154248) + " digits");
    }

}
