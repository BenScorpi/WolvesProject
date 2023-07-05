package week5_tasks;

public class ReverseString {

    public static void main(String[] args) {

        System.out.println(reverseString("ABCD"));
    }

    public static String reverseString(String word){

        String reversed="";

        for (int i = word.length()-1;i>=0;i--) {

            reversed+=word.charAt(i);
        }
        return reversed;
    }
}
