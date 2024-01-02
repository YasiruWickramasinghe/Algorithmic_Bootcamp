package Algorithms._4_Recursion._2_Level_1_Questions._0_Valuable_Concept;

public class Main {
    public static void main(String[] args) {
        concept(5);
    }

    static void concept (int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);

        //uncomment and see
        // concept(--n); // this will pass the value first and then subtract
        // concept(n--); // this will subtract value first then pass the value
    }
}
