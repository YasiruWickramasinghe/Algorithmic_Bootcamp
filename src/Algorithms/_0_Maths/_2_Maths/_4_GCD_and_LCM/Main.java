package Algorithms._0_Maths._2_Maths._4_GCD_and_LCM;

public class Main {
    public static void main(String[] args) {
        int a = 2;
        int b = 7;

        System.out.println("GCD is: " + gcd(a, b));
        System.out.println("LCM is: " + lcm(a, b));
    }

    static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        return gcd(b % a, a);
    }

    static int lcm(int a, int b) {
        if (a == 0) {
            return b;
        }
        return a * b / gcd(a, b);
    }
}
