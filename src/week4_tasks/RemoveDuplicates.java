package week4_tasks;

public class RemoveDuplicates {

    public static void main(String[] args) {


        System.out.println(removeDup("AAABBBCCC"));

    }

    public static String removeDup(String str){

        String uniques="";

        for(String each:str.split("")){
            if(!uniques.contains(each)){
                uniques+=each;
            }
        }return uniques;
    }


}
