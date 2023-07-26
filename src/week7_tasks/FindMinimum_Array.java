package week7_tasks;

public class FindMinimum_Array {

    public static int minNumArray(int[] nums){

        int min = nums[0];

        for (int each : nums) {
            if(min > each){
                min= each;
            }
        }
        return min;
    }

    public static int maxNumArray(int[] nums){

        int max = nums[0];

        for (int each : nums) {
            if(max<each){
                max=each;
            }
        }
        return max;
    }


    public static void main(String[] args) {
        int[] nums = {0,1,9,-3,8,7,5,-8};

        System.out.println("minNumArray(nums) = " + minNumArray(nums));
        System.out.println("maxNumArray(nums) = " + maxNumArray(nums));
    }
}
