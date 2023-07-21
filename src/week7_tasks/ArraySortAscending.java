package week7_tasks;

import java.util.Arrays;

public class ArraySortAscending {

    public static void main(String[] args) {

        int[] arr = {2, 4, 1, 7, 10};
        System.out.println(Arrays.toString(sortedArrayAscending(arr)));
    }

    public static int[] sortedArrayAscending(int[] array) {


        for (int i = 0; i < array.length; i++) {
            int temp = 0;
            for (int j = i + 1; j < array.length; j++) {

                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }


}
