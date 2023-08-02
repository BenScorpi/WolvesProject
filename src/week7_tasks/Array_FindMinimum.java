package week7_tasks;

public class Array_FindMinimum {

    public static int findMinimum() {

        int[] numbers = {50, 20, 30, 40, 50};

        int min = numbers[0]; // we use first number with index 0 and assume that  it's the min number, and then compare the rest of the numbers with first one

        for (int i = 1; i < numbers.length; i++) { // that's why we started with i=1(second number)

            if (numbers[i] < min) { //compares the element of the array with current minimum number
                min = numbers[i]; // replace the current minimum number
            }
        }
        return min;
    }

    public static void main(String[] args) {

        System.out.println(findMinimum());
    }
}
