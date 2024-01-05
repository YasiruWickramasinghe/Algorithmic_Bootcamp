package Algorithms._4_Recursion._7_Subset_Subsequence_String._1_Skip_a_Character;

public class Main {
    public static void main(String[] args){
        skipCharacter("", "baccdah");
        System.out.println(skipCharacterByReturning("cauddah"));
    }

    //Way 1 - pass the answer String in argument
    public static void skipCharacter(String process, String unProcess){
        if(unProcess.isEmpty()){
            System.out.println(process);
            return;
        }

        char ch = unProcess.charAt(0);

        if(ch == 'a'){
            skipCharacter(process, unProcess.substring(1));
        }else {
            skipCharacter(process + ch, unProcess.substring(1));
        }
    }

    //Way 2 - create the answer variable in function body
    public static String skipCharacterByReturning(String unProcess){
        if(unProcess.isEmpty()){
            return "";
        }

        char ch = unProcess.charAt(0);

        if(ch == 'a'){
            return skipCharacterByReturning(unProcess.substring(1));
        }else {
            return ch + skipCharacterByReturning(unProcess.substring(1));
        }
    }
}
