package week4_tasks;

import com.sun.source.tree.Tree;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SameLetters {
    public static boolean sameLetters(String str1, String str2){
        /*
2. Same letters
Write a return method that check if a string is build out of the same letters as another string.
  Ex: same("abc", "cab"); ==> true
      same("abc", "abb"); ==> false
*/
        Set <Character>set1 = new TreeSet<>();
        for (Character each: str1.toCharArray()){
            set1.add(each);
            }
        Set <Character>set2 = new TreeSet<>();
        for (Character each : str2.toCharArray()) {
            set2.add(each);
        }


        return set1.equals(set2);
    }

    public static void main(String[] args) {
        System.out.println(sameLetters("vesna", "vsna"));
    }
}
