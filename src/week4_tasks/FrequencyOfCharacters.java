package week4_tasks;

import java.util.Arrays;
import java.util.Collections;

public class FrequencyOfCharacters {

    //Frequency of Characters
    //Write a return method that can find the frequency of characters
    //  Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
    public static String frequencyOfCharacters(String str){
        String result = "";
        for (String each : str.split("")) {
            int frequency = Collections.frequency(Arrays.asList(str.split("")), each);
            if (!result.contains(each)) {
                result += each + frequency;
            }

        }




        return result;
    }

    public static void main(String[] args) {
        System.out.println("frequencyOfCharacters(\"aaaabbbcccc\") = " + frequencyOfCharacters("aaaabbbcccc"));
    }
}
