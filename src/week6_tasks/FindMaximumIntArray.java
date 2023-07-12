package week6_tasks;

public class FindMaximumIntArray {
    public static int maximumNumber (int[] intArray){
        int max = intArray[0];
        for (int i : intArray) {
            if(i>max){
                max=i;
            }
        }


        return max;
    }

    public static void main(String[] args) {
        System.out.println("maximumNumber(new int[]{1,2,5,6,2}) = " + maximumNumber(new int[]{1, 2, 5, 6, 2}));
    }

}
