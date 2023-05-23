package week1_tasks;

public class Week1Project {

    public static void main(String[] args) {

        int num1 = 5;
        int num2 = 6;

        boolean isEven = num1 % 2 == 0; // When we divide a number by 2, if the remainder is 0, mean the number is even

        // When we divide a number by 2, if the remainder is NOT 0, mean the number is odd

        boolean isOdd = !isEven; //If the number is not even, then is odd

        System.out.println(num1 + " is an evan number: " + isEven );
        System.out.println(num2 + " is an odd number: " + isOdd);



    }


}

