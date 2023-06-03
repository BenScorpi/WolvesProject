package week3_tasks;

public class PrimeNumber {

    public static void main(String[] args) {


        int range = 100;

        for (int j = 2; j <= range; j++) { // num = j

            boolean isPrime = true;

            for (int i = 2; i < j; i++) {

                if (j % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(j + ", ");
            }
        }
    }
        public static boolean isPrime(int n){
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }

    }

/*
  Write a method that can check if a number is prime or not*/