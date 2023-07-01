package week4_tasks;

public class SameLetters {

    //Same letters
    //Write a return method that check if a string is build out of the same letters as another string.
    //  Ex: same("abc", "cab"); ==> true
    //      same("abc", "abb"); ==> false

    public static Boolean sameLetters(String str1, String str2) {
        if (str1.length() == str2.length()) {
            for (int i = 0; i < str1.length(); i++) {
                char ch = str1.charAt(i);
                int index = str2.indexOf(ch);
                if (index != -1) {
                    // Match found, remove the character from str2
                     str2 = str2.substring(0, index) + str2.substring(index + 1);
                } else {
                    // No match found, return false
                    return false;
                }
            }
            // All characters matched, str2 should be empty
            return str2.isEmpty();
        }
        return false;
    }


    public static void main(String[] args) {
        System.out.println(sameLetters("eliffileeeccbb", "ccbbeefileelif"));
    }
}
