package week7_tasks;

import java.util.Arrays;

public class AscendingArray {
    public static int[] ascendingArray(int... nums){

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length-1; j++) {
                if(nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
       return nums;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(ascendingArray(3,4,6,2,5,8,2,5,6,7)));
    }
}
