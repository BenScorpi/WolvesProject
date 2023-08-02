package week6_tasks;

public class FindMaximum {

    //Array -- Find Maximum
    //Write a method that can find the maximum number from an int Array

    public static int maxNumber(int[] numbers){

        int maxNum = numbers[0];

        for (int each : numbers) {
            if (each > maxNum){
                maxNum = each;
            }
        }

        return maxNum;
    }

    public static void main(String[] args) {

        int[] numbers = {0,2,3,-9,1,4,-4,-7,5};

        System.out.println(maxNumber(numbers));
    }
}
