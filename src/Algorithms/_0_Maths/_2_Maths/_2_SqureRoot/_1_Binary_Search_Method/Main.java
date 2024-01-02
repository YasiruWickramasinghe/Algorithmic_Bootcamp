package Algorithms._0_Maths._2_Maths._2_SqureRoot._1_Binary_Search_Method;

public class Main {
    public static void main(String[] args) {
        //number to check
        int n = 40;

        //how many digits you want
        int p = 3; //precision value
        
        System.out.printf("%.3f", sqrt(n,p));
    }

    //Time: O(log(N))
    private static double sqrt(int n, int p) {
        //apply binary search first
        int start = 0;
        int end = n;

        double root = 0.0;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(mid * mid == n){
                return  mid;
            }

            if(mid * mid > n){
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }

        double increment = 0.1;

        for (int i = 0; i < p; i++) {
            while(root * root <= n){
                root += increment;
            }

            //go back, because get exact sqrt
            root -= increment;
            increment /= 10;
        }
        return root;
    }
}
