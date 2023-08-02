package week8_tasks;

import java.util.Arrays;

public class MoveZeros {

    public static void main(String[] args) {

        int[] arr={1,0,0,2,0,4,0,3};

        System.out.println(Arrays.toString(moveToTheEnd(arr)));
    }




    public static int[] moveToTheEnd(int[]arr){

        int []changedArr=new int[arr.length];
        int index=0;

        for (int each : arr) {
            if(each!=0){
              changedArr[index++]=each;
            }

        }

        return changedArr;
    }

}
