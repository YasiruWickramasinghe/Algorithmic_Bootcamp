package Algorithms._4_Recursion._1_Intro_to_Basic._2_Fibonacci_Number;

public class Main {
    public static void main(String[] args) {
        int num = 7;
        int fibonacciNumber = fibonacci(num);
        System.out.println("Number "+ num + ", fibonacci number is: " + fibonacciNumber);
    }

    static int fibonacci(int n){
        //base condition
        if(n < 2){
            return n;
        }


        return fibonacci(n-1) + fibonacci(n-2);
    }
}
