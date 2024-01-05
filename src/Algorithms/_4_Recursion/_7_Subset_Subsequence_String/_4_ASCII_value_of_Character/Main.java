package Algorithms._4_Recursion._7_Subset_Subsequence_String._4_ASCII_value_of_Character;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //print  void;
        subsequenceASCII("", "abc");

        //return ArrayList
        System.out.println(subsequenceASCIIArrayList("", "abc"));

    }

    static void subsequenceASCII(String process, String unProcess){
        //Base Condition
        if(unProcess.isEmpty()){
            System.out.println(process);
            return;
        }

        //save first character
        char ch = unProcess.charAt(0);

        //take character
        subsequenceASCII(process + ch, unProcess.substring(1));
        //ignore character
        subsequenceASCII(process, unProcess.substring(1));
        //get the ascii value
        subsequenceASCII(process + (ch + 0), unProcess.substring(1));
    }

    //Return an ArrayList of ASCII Value
    static ArrayList<String> subsequenceASCIIArrayList(String process, String unProcess){
        //Base Condition
        if(unProcess.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(process);
            return list;
        }

        //save first character
        char ch = unProcess.charAt(0);

        //take character
        ArrayList<String> first = subsequenceASCIIArrayList(process + ch, unProcess.substring(1));
        //ignore character
        ArrayList<String> second = subsequenceASCIIArrayList(process, unProcess.substring(1));
        //return ascii value
        ArrayList<String> third = subsequenceASCIIArrayList(process + (ch+0), unProcess.substring(1));

        //combine left and right
        first.addAll(second);
        first.addAll(third);
        return first;
    }

}
