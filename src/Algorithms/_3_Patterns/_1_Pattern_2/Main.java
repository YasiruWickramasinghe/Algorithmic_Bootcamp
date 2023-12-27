package Algorithms._3_Patterns._1_Pattern_2;

public class Main {
    /**
     *  pattern:
     *              *
     *              **
     *              ***
     *              ****
     *              *****
     *
     *  How to Approach :
     *
     *      1) no of line = no of rows = no of time outer loop run
     *
     *      2) identify every row no -:
     *          *) how many stars are there
     *          *) type of elements in column (star or number)
     *
     *      3) what do you need to print (star or number)
     */
    public static void main(String[] args) {

        int n = 5; // no of rows

        //outer loop, no of rows
        for (int row = 1; row <= n; row++) {
            //for every row, run col
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            //when row is printed, add new line
            System.out.println();
        }
         
    }
}
