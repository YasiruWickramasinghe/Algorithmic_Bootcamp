package Algorithms._1_Searching_Algorithms._2_BinarySearch._3_LeetCode.Kunal._3_Smallest_Letter;

public class Main {
    //find the smallest letter which is greater than target letter
    private static char smallestLetter(char[] letter, char target) {
        int size = letter.length - 1;

        int start = 0;
        int end = size;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < letter[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letter[start % letter.length];
    }

    public static void main(String[] args) {
        // Smallest letter:
        // Given a circularly sorted array of letters and a target letter, find the smallest letter in the array
        // that is greater than the target. If the target is greater than or equal to the last letter in the array,
        // wrapping around from the end to the beginning of the array.

        char[] letter = {'c', 'f', 'm', 's'}; // This array is sorted in acs order therefore we know we can use binary search
        char target = 'q';

        //check if target given 'z', answer should be the first element of array
        //char target = 'z';

        char res = smallestLetter(letter, target);

        if (res >= 0) {
            //print value of ceiling number
            System.out.printf("Smallest letter  which is greater than '%c' is '%c", target, res);
        } else {
            System.out.printf("empty array");
        }

    }
}
