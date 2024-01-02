package Algorithms._0_Maths._2_Maths._1_Prime_Number._1_Prime_Number_Basic;

public class Main {
    public static void main(String[] args) {
        int number = 13;

        //1) check all number and get prime or not
            //for (int i = 0; i <= number; i++) {
            //    System.out.println(i + " " + isPrime(i));
            //}

        //2) check given number prime or not
            System.out.println(number + " is Prime Number: " + isPrime(number));
    }

    private static boolean isPrime(int number) {

        //check if the number is less than or equal to 1
        if(number <= 1){
            return false;
        }

        //set start to 2, because loop should start 2
        int start = 2;

        //check until sqrt of given number, because

        //ex: 36
            //1  * 36
            //2  * 18
            //3  * 12
            //4  * 9
            //6  * 6
            //36 * 1 // after this we can ignore, because all are repeat, therefore we check until the sqrt of given number
            //18 * 2 // check until sqrt of 36 = 6
            //12 * 3
            //9  * 4

        while(start * start <= number){ // [start <= sqrt(number)], this is equal for this [start * start <= number]
            if(number % start == 0){
                return false;
            }
            start++;
        }
        return true;
    }
}
