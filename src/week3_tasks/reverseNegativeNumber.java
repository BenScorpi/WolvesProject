package week3_tasks;

public class reverseNegativeNumber {
    public static int reverseNegativeNumber(int number) {

        //used if-else for to determine if number is negative. If negative it would return -number,otherwise will be positive.
        if (number < 0) {
            return -number;
        } else {
            return number;
        }
    } public static void main(String[] args) {
        int negativeNumber = -50; //number input
        int reversedNumber = reverseNegativeNumber(negativeNumber); //
        System.out.println("Reversed Number: " + reversedNumber);//printing reverse negative number
    }


}