package week7_tasks;

import java.util.Arrays;

public class ArraySortDescending {

    public static void main(String[] args) {

        int[]arr={3,1,7,4,9};
        System.out.println(Arrays.toString(sortedArrayDescending(arr)));
    }

    public static int[] sortedArrayDescending(int[]array){

        for (int i = 0; i < array.length; i++) {
            int temp=0;

            for (int j = i+1; j <array.length ; j++) {

                if(array[i]<array[j]){
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        
        return array;
    }


}
