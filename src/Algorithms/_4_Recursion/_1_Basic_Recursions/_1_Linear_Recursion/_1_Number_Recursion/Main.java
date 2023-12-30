package Algorithms._4_Recursion._1_Basic_Recursions._1_Linear_Recursion._1_Number_Recursion;

public class Main {
    public static void main(String[] args) {
        //write function to takes in a number and print it
        //print first 5 numbers

        print(1);
    }

    private static void print(int n) {
        //if n equals 5, then break the function using return
        if(n == 5){ //base condition for break the function loop call
            System.out.println(n);
            return;
        }
        System.out.println(n);

        //recursive call
        //if you are calling a function again and again, you can treat it as a separate call in the stack

        //this is call tail recursion
        //this is the last function call
        print(n + 1);
    }
}
