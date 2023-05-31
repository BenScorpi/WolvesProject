package week2_tasks;

public class DivisibleBy3_5_15 {

    public static void main(String[] args) {

        int n = 100;

        String divisibleBy15 = "";
        String divisibleBy5 = "";
        String divisibleBy3 = "";


        for (int i = 1; i <= n; i++) {

            if (i % 15 == 0 && i % 3 == 0) {
                divisibleBy15 += i + " ";
            }

            if (i % 5 == 0 && i % 15 != 0) {
                divisibleBy5 += i + " ";
            }

            if (i % 3 == 0 && i % 15 != 0) {
                divisibleBy3 += i + " ";
            }

        }

        System.out.println("Divisible By 15: " + divisibleBy15);
        System.out.println("Divisible By 5: " + divisibleBy5);
        System.out.println("Divisible By 3: " + divisibleBy3);

    }
}

/*write a program that can print the numbers between 1-100
that can be divisible by 3,5,15
if the number can be divisible by 3,5,15 then it should displayed
in DivisibleBy15 section
if the number can be divisible by 3 but can't be divisible by 15
then it should displayed in DivisibleBy3 section
if the number can be divisible by 5 but can't be divisible by 16
then should be displayed in DivisibleBy5 section
 */
