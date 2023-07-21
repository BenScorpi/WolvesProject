package week7_tasks;

public class FindMinimum {

    public static void main(String[] args) {

        int[]array={3,1,7,5,-6};
        minimum(array);
    }

    public static void minimum(int[]arr){

        int min=arr[0];

        for(int each:arr){

            if(each<min){
             min=each;
         }
     }
        System.out.println("Minimum number in the array = "+min);

    }


}
