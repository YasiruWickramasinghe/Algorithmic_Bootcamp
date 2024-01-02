package Data_Structures._1_Arrays_and_ArrayList;

import java.util.Arrays;
import java.util.Scanner;

class MultiDimension {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    /*
        123
        456
        789
    */

//        int[][] arr = new int[3][]; // no of column no need to specify but no of rows mandatory

//        int[][] arr = {
//                {1,2,3},
//                {4,5},
//                {6,7,8,9}
//        };

        int[][] arr = new int[3][3];

        System.out.println("Enter Numbers:");
        //input
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();
                };
        };

        //output in normal loop
        System.out.println("normal loop");
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            };
            System.out.println();
        };

        //output in normal loop
        System.out.println("using Array class");
        for(int row = 0; row < arr.length; row++){
            System.out.println(Arrays.toString(arr[row]));
        };

        //enhanced for loop
        System.out.println("using enhanced for loop");
        for(int[] ar: arr){
            System.out.println(Arrays.toString(ar));
        };

    }
}
