package week2_tasks;

public class NumberSwap {

    public static void main(String[] args) {
            int a = 35;
            int b = 57;

            System.out.println("a = " + a);
            System.out.println("b = " + b);

            // Swapping the values without using a third variable
            a = a + b;
            b = a - b;
            a = a - b;

            System.out.println("a = " + a);
            System.out.println("b = " + b);
        }
    }

