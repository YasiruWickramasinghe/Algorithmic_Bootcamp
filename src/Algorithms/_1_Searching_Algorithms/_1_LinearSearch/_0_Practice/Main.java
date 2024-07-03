package Algorithms._1_Searching_Algorithms._1_LinearSearch._0_Practice;

// 1) Linear Search

    public class Main {
        public static void main(String[] args) {
            int[] arr = {1,5,4,7,8,9};
            int target = 9;

            int result = linearSearch(arr, target);

            if(result == -1){
                System.out.println("Target value not found");
            } else {
                System.out.println("Target found at index : " + result);
            }
        }

        public static int linearSearch(int[] arr, int target) {

            if(arr.length == 0){
                return -1;
            }

            for (int i = 0; i < arr.length; i++){
                if(target == arr[i]){
                    return i;
                }
            }

            return -1;
        }

    }

// 2) Find min and max in the array

    //public class Main {
    //    public static void main(String[] args){
    //        int[] arr = {12, -4, 68, 9, -54, 41, 18};
    //
    //        search(arr);
    //    }
    //
    //    private static void search(int[] arr) {
    //
    //        int size = arr.length;
    //        if (size == 0) {
    //            System.out.println("Array is Empty");
    //        }
    //
    //        int min = arr[0];
    //        int max = arr[0];
    //
    //        for (int i=0; i < size; i++){
    //            if(arr[i] < min){
    //                min = arr[i];
    //            }
    //
    //            if(arr[i] > max ){
    //                max = arr[i];
    //            }
    //        }
    //
    //        System.out.println("minimum value is : " + min);
    //        System.out.println("maximum value is : " + max);
    //    }
    //}

// search in range

    //public class Main {
    //    public static void main(String[] args) {
    //        int[] arr = {12, -4, 68, 9, -54, 41, 18};
    //        int target = -54;
    //        int startIndex = 2;
    //        int endIndex = 5;
    //
    //        int result = searchInRange(arr, target, startIndex, endIndex);
    //
    //        if(result == -1){
    //            System.out.println("target not found in range");
    //        } else {
    //            System.out.println("target found at index : " + result);
    //        }
    //
    //    }
    //
    //    private static int searchInRange(int[] arr, int target, int startIndex, int endIndex) {
    //
    //        int size = arr.length;
    //
    //        if(size == 0){
    //            System.out.println("Array is Empty");
    //        }
    //
    //        for (int i=startIndex; i<endIndex; i++){
    //            if(target == arr[i]){
    //                return i;
    //            }
    //        }
    //
    //        return -1;
    //    }
    //
    //}

