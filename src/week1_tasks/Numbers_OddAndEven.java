package week1_tasks;

public class Numbers_OddAndEven {

    /*
    Write a method which can identifies given number is even or odd
    EX:
    identify 5 -> Odd
    identify 6 -> Even
     */

    public static void oddOrEven(int number) {

        if (number % 2 == 0) {
            System.out.println("Identify " + number + " is even number");
        } else {
            System.out.println("Identify " + number + " is odd number");

        }
    }

    public static void main(String[] args) {

        oddOrEven(5);
        oddOrEven(6);
    }
}
