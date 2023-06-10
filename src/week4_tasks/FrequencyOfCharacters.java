package week4_tasks;

public class FrequencyOfCharacters {


    public static void main(String[] args) {

        System.out.println(frequencyOfChars("AAABBCDD"));

    }

    public static String frequencyOfChars(String str){

        String result="";
        for (int i = 0; i <str.length() ; i++) {
            int count=0;
            char ch=str.charAt(i);
            for (int j = 0; j < str.length(); j++) {

                if(ch==str.charAt(j)){
                    count++;
                }
            }
            if(!result.contains(""+ch)){
                result+=""+ch+count;
            }

        }
        return result;

    }



}
