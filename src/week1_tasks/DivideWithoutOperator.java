package week1_tasks;

public class DivideWithoutOperator {
    public static int divideWithoutOperator(int num1, int num2) {

        if(num2 == 0){
            System.err.println("Can not be divided by 0");
            return 0;
        }
        int result = 0;
        int sign = ((num1 < 0 || num2 < 0) ? -1 : 1);
        int absNum1 = Math.abs(num1);
        int absNum2 = Math.abs(num2);

        while (absNum1 >= absNum2) {
            absNum1 -= absNum2;
            result++;
        }

        return result * sign;
    }

}
