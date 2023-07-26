package week7_tasks;

import java.util.Arrays;

public class DescendingArray {
    //Question3: Array - Sort Descending
    //Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
    //Ex: int[] arr = {10,20,7, 8, 90};
    // arr = Sort(arr); ==> {90, 20, 10, 8, 7};

    public static int[] descendingOrder(int... nums){


        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length-1; j++) {
                if(nums[j] <nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;

                }
            }
        }
        return nums;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(descendingOrder(2,3,5,6,1,5,7)));
    }
}
