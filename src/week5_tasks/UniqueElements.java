package week5_tasks;

public class UniqueElements {

    public static void main(String[] args) {

        System.out.println(uniqueElements("AAABBBCCCDEF"));


    }

    public static String uniqueElements(String word){

        String uniques="";
        for (int i = 0; i <word.length() ; i++) {
            int count=0;

            for (int j = 0; j <word.length() ; j++) {

                if(word.charAt(i)==word.charAt(j)){
                    count++;
                }
            }if(count==1){
                uniques+= word.charAt(i);
            }
        }
        return uniques ;
    }
}
