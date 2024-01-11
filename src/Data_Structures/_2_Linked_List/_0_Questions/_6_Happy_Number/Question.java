package Data_Structures._2_Linked_List._0_Questions._6_Happy_Number;

public class Question {
    //Question
    // Google: https://leetcode.com/problems/happy-number/
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do {
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        } while (slow != fast);

        if (slow == 1) {
            return true;
        }
        return false;
    }
    private int findSquare(int number) {
        int ans = 0;
        while (number > 0) {
            int rem = number % 10 ;
            ans += rem * rem;
            number /= 10;
        }
        return ans;
    }
}
