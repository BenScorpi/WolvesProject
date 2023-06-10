package week4_tasks;

public class SameLetters {

    public static void main(String[] args) {
        System.out.println(hasSameChar("abc", "aca"));

    }
    public static boolean hasSameChar(String str1, String str2){
        for(char c : str1.toCharArray()){
            if(str2.indexOf(c) < 0 ) return false;
        }
        for(char c : str2.toCharArray()){
            if(str1.indexOf(c) < 0 ) return false;
        }
        return true;
    }
}

