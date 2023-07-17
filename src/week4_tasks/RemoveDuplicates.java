package week4_tasks;

import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicates {
    public static String removeDuplicates(String str){
        Set<Character> set = new TreeSet<>();

        for (Character each : str.toCharArray()) {
           set.add(each);
        }
String result ="";
        for (Character each : set) {
            result+=""+each;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("removeDuplicates(\"aaabbbdbbcbbb\") = " + removeDuplicates("aaabbbdbbcbbb"));
    }
}
