package Algorithms._1_Searching_Algorithms._1_LinearSearch._2_Examples._1_Search_Min_And_Max;

public class Main {
    public static void main(String[] args) {
        int[] arr = {12, -4, 68, 9, -54, 41, 18};

        search(arr);

    }

    private static void search(int[] arr) {
        int size = arr.length;
        if (size == 0) {
            System.out.println("Array is Empty");
        }
        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i < size; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }

            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("minimum number is: " + min);
        System.out.println("maximum number is: " + max);
    }
}
