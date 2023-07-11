package week6_tasks;

public class SumOfDigitsInString {
    //String -- sum of digits in a string
    //Write a method that can return the sum of the digits in a string

    public static int sumOfDigits(String str){
        int sum = 0;

        for (char each : str.toCharArray()) {
            if (Character.isDigit(each)){
                sum += Integer.parseInt(each + "");
            }
        }

        return sum;

    }

    public static void main(String[] args) {
        System.out.println(sumOfDigits("asfaf23423"));
    }
}
