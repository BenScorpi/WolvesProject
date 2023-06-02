package week3_tasks;

public class ReverseNegative {

    public static void main(String[] args) {

        System.out.println(reverseNegative(-356));

    }

    public static int reverseNegative(int num) {


        int reverse =0;

        while(num <0)
        {
            int remainder = num % 10;

            reverse = reverse * 10 + remainder;

            num=num/10;

        }
       return reverse;
    }
}