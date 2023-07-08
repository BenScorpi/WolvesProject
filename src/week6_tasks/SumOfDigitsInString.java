package week6_tasks;

public class SumOfDigitsInString {

    public static void main(String[] args) {

        String str="2JFK58KS!";
        System.out.println(sumOfDigits(str));
    }


    public static int sumOfDigits(String str){

        int sum=0;
        for(char ch:str.toCharArray()){
            if(Character.isDigit(ch)){
                sum+=Integer.parseInt(ch+"");
            }
        }
        return sum;

    }
}
