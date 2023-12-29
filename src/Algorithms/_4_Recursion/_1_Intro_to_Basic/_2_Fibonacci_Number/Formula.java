package Algorithms._4_Recursion._1_Intro_to_Basic._2_Fibonacci_Number;

public class Formula {

    public static void main(String[] args) {

        for (int i = 0; i < 11; i++) {
            System.out.println(fiboFormula(i));
        }

        //System.out.println(fiboFormula(50));
    }

    //find nth fibonacci number using golden ratio
    static long fiboFormula(long n){
        return (long)(Math.pow(((1 + Math.sqrt(5)) / 2), n) / Math.sqrt(5));
    }

}
