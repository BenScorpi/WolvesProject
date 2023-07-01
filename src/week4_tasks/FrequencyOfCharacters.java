package week4_tasks;

public class FrequencyOfCharacters {

    //1. Frequency of Characters
    //Write a return method that can find the frequency of characters
    //  Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
    public static String frequencyOfCharacters(String str){

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            if (result.contains(str.charAt(i)+"")){
                continue;
            }
            result += "" + str.charAt(i) + count;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("frequencyOfCharacters(\"AAABBCDD\") = " + frequencyOfCharacters("AAABBCDD"));
    }
}
