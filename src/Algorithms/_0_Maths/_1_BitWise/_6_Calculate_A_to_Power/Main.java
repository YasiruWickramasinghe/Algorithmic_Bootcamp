package Algorithms._0_Maths._1_BitWise._6_Calculate_A_to_Power;

public class Main {
    public static void main(String[] args) {
        int base = 2;
        int power = 4;

        int ans = 1;

        while(power > 0){
            if((power & 1) == 1){
                ans *= base;
            }
            base *= base;
            power = power >> 1;
        }

        System.out.println(ans);
    }
}
