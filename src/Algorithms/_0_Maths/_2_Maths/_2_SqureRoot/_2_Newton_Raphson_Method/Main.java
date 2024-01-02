package Algorithms._0_Maths._2_Maths._2_SqureRoot._2_Newton_Raphson_Method;

public class Main {
    public static void main(String[] args) {
        double n = 40;
        System.out.printf("%.3f", newtonSQRT(n));
    }

    private static double newtonSQRT(double n) {
        double x = n;
        double root;

        while(true){
            root = 0.5 * (x + (n/x));

             if(Math.abs(root - x) < 1){
                 break;
             }

             x = root;
        }
        return root;
    }
}
