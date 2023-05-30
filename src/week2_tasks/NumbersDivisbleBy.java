package week2_tasks;

public class NumbersDivisbleBy {
    public static void main(String[] args) {

        //declaring the varibale
        int number = 15;
        //setting condtion of variable
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {

            }
            boolean isDivisibleBy3 = number % 3 == 0;        // if the remainder of the number divided by 3 is equal to zero, then it's evenly divisible by 3
            boolean isDivisibleBy5 = number % 5 == 0;        // if the remainder of the number divided by 5 is equal to zero, then it's evenly divisible by 5
            boolean isDivisibleBy15 = number % 15 == 0;        // if the remainder of the number divided by 15 is equal to zero, then it's evenly divisible by 15

            System.out.println(number + " is divisible by 3: " + isDivisibleBy3);
            System.out.println(number + " is divisible by 5: " + isDivisibleBy5);
            System.out.println(number + " is divisible by 15: " + isDivisibleBy15);

        }

    }

}