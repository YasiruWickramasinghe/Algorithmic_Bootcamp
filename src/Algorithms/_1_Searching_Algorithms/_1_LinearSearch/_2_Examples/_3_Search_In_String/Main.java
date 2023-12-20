package Algorithms._1_Searching_Algorithms._1_LinearSearch._2_Examples._3_Search_In_String;

public class Main {

    //Search Character in string using for loop
    public static boolean stringLinearSearch(String str, char target) {
        int length = str.length();

        //check whether array is empty
        if (length == 0) {
            return false;
        }

        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == target) {
                return true;
            }
        }
        return false;
    }

    //Search Character in string using enhanced for loop
    public static boolean stringLinearSearch2(String str, char target) {
        int length = str.length();

        //check whether array is empty
        if (length == 0) {
            return false;
        }

        for (char ch : str.toCharArray()) {
            if (ch == target) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "orange";
        char target = 'c';

        System.out.println("Using For loop");
        System.out.println("Found: " + stringLinearSearch(str, target));

        System.out.println("Using enhanced For loop");
        System.out.println("Found: " + stringLinearSearch2(str, target));
    }
}
