package week1_tasks;

public class DivideWithoutOperator {
    //Numbers == Divide without / operator. Write a method that cna divide 2 numbers without using the division operator.

    public static void main(String[] args) {
        int number1 = 500;
        int number2 = 5;

        int count = 0;

        while (number1 >= number2) {
            number1 -= number2;
            count++;
        }
        System.out.println(count);
    }
}
