package Algorithms._4_Recursion._7_Subset_Subsequence_String._2_Skip_a_String;

public class Main {
    public static void main(String[] args){

        //skip apple
        System.out.println(skipString("bcaappleegy"));

        //skip 'app' not 'apple'
        System.out.println(skipStringNotRequired("bcaappleegappy"));
    }

    public static String skipString(String unProcess){
        if(unProcess.isEmpty()){
            return "";
        }

        if(unProcess.startsWith("apple")){
            return skipString(unProcess.substring(5));
        }else {
            return unProcess.charAt(0) + skipString(unProcess.substring(1));
        }
    }

    //skip a String if it's not a required string
    //ex: skip 'app' not 'apple'
    public static String skipStringNotRequired(String unProcess){
        if(unProcess.isEmpty()){
            return "";
        }

        if(unProcess.startsWith("app") && !unProcess.startsWith("apple")){
            return skipStringNotRequired(unProcess.substring(3));
        }else {
            return unProcess.charAt(0) + skipStringNotRequired(unProcess.substring(1));
        }
    }
}