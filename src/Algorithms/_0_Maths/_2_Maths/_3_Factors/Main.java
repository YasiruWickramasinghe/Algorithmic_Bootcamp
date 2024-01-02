package Algorithms._0_Maths._2_Maths._3_Factors;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int n = 20;

        //Normal way
        //factors(n);

        //Optimized way
        //optimizedFactors(n);

        //Sorted Order in Optimized way
        sortedOptimizedFactors(n);
    }

    //Time : O(n)
    private static void factors(int n) {

        for (int i = 1; i <= n; i++) {
            if(n % i == 0){
                System.out.print(i + " ");
            }
        }
    }

    //Time : O(sqrt(n))
    private static void optimizedFactors(int n) {

        //loop run till sqrt of the current number
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if(n % i == 0){
                //here if we get number like 36, ut give us 6 two times like this -> 1 36 2 18 3 12 4 9 6 6
                //therefore we check that also
                if(n/i == i){
                    System.out.print(i + " ");
                } else {
                    //but this didn't give us sorted order
                    System.out.print(i + " " + n/i + " ");
                }
            }
        }
    }

    //Time : O(sqrt(n))
    //Space : O(sqrt(n)) // because we use new array
    private static void sortedOptimizedFactors(int n) {
        ArrayList<Integer> list = new ArrayList<>();

        //loop run till sqrt of the current number
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if(n % i == 0){
                //here if we get number like 36, ut give us 6 two times like this -> 1 36 2 18 3 12 4 9 6 6
                //therefore we check that also
                if(n/i == i){
                    System.out.print(i + " ");
                } else {
                    //but this didn't give us sorted order
                    System.out.print(i + " ");
                    list.add(n/i);
                }
            }
        }
        //print reverse order
        for (int i = list.size() - 1; i >= 0 ; i--) {
            System.out.print(list.get(i) + " ");
        }
    }
}
