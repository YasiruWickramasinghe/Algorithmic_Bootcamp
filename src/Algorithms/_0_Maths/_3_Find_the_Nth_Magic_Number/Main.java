package Algorithms._0_Maths._3_Find_the_Nth_Magic_Number;

public class Main {

    /**
     *  The program defines a magicNumber function that takes two parameters: num (the Nth magic number to find) and base (the base for the magic number calculation).
     *  The function uses a while loop to iterate through the bits of the given number (num).
     *  Inside the loop, it extracts the last bit of the number (last) using bitwise AND operation and right shifts the number to get the next bit.
     *  The last bit is then multiplied by the current base and added to the result (ans).
     *  The base is updated for the next iteration by multiplying it with 5.
     *  The loop continues until the given number becomes zero.
     *  The final result is the calculated Nth magic number, which is then displayed in the main method.
     */

    public static void main(String[] args) {
        int num = 7; // Input: Nth magic number to find
        int base = 5; // Input: Base for the magic number calculation

        // Display the result
        System.out.println("Magic number is : " + magicNumber(num, base));
    }

    // Function to calculate the Nth magic number
    public static int magicNumber(int num, int base) {
        int ans = 0;

        // Loop until the given number becomes zero
        while (num > 0) {
            // Extract the last bit of the number using bitwise AND operation
            int last = num & 1;

            // Right shift the number to get the next bit
            num = num >> 1;

            // Multiply the last bit with the current base and add it to the result
            ans += last * base;

            // Update the base for the next iteration
            base = base * 5;
        }

        // Return the calculated magic number
        return ans;
    }
}
