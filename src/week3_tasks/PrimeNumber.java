package week3_tasks;

public class PrimeNumber {

    public static void main(String[] args) {
        int number = 87; // Change the number to test here

        //declared any number less than 1 is not a prime
        if (number <= 1) {
            System.out.println(number + " is not a prime number.");
        //intiated with else-if statement, so if number is equal to and greater than 1 its prime.
        } else {
            boolean isPrime = true;

            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break; // break code
                }
            }

            if (isPrime) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is not a prime number.");
            }
        }
    }
}





