package Algorithms._0_Maths._2_Maths._1_Prime_Number._2_Sieve_of_Eratosthenes;

public class Main {
    public static void main(String[] args) {
        int n = 40;
        boolean[] primes = new boolean[n + 1];

        //print all prime number less than given number
        sieve(n, primes);
    }

    //false in array means number is prime
    private static void sieve(int n, boolean[] primes) {

        for (int i = 2; i * i <= n; i++) {
            if (!primes[i]) {
                for (int j = i * 2; j <= n; j += i) {
                    primes[j] = true;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if (!primes[i]) {
                System.out.print(i + " ");
            }
        }

    }
}
