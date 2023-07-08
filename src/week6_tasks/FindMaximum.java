package week6_tasks;

public class FindMaximum {

    public static void main(String[] args) {
        int [] arr={3,16,8,9};
        max(arr);
    }


    public static void max(int[]arr){

        int maxNum=arr[0];

        for (int i = 0; i < arr.length ; i++) {

            if(arr[i]>maxNum){
                maxNum=arr[i];
            }
        }

        System.out.println("Maximum number in the array: "+maxNum);

    }
}
