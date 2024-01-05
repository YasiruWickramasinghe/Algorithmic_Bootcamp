package Algorithms._4_Recursion._7_Subset_Subsequence_String._3_SubSequences;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //print  void;
        subsequence("", "abc");

        //Print ArrayList
        System.out.println(subsequenceArrayList("", "abc"));
    }

    static void subsequence(String process, String unProcess){
        //Base Condition
        if(unProcess.isEmpty()){
            System.out.println(process);
            return;
        }

        //save first character
        char ch = unProcess.charAt(0);

        //take character
        subsequence(process + ch, unProcess.substring(1));
        //ignore character
        subsequence(process, unProcess.substring(1));
    }

    //Return an ArrayList of String
    static ArrayList<String> subsequenceArrayList(String process, String unProcess){
        //Base Condition
        if(unProcess.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(process);
            return list;
        }

        //save first character
        char ch = unProcess.charAt(0);

        //take character
        ArrayList<String> left = subsequenceArrayList(process + ch, unProcess.substring(1));
        //ignore character
        ArrayList<String> right = subsequenceArrayList(process, unProcess.substring(1));

        //combine left and right
        left.addAll(right);
        return left;
    }

}
