package week2_tasks;

public class ConsecutiveNumbers {
    public static void consecutiveNumbers(int N) {
        for (int i = 1; i <= N; i++) {
            boolean divisible = false;
            StringBuilder result = new StringBuilder();

            if (i % 2 == 0) {
                result.append("Codility");
                divisible = true;
            }
            if (i % 3 == 0) {
                result.append("Test");
                divisible = true;
            }
            if (i % 5 == 0) {
                result.append("Coders");
                divisible = true;
            }

            if (divisible) {
                System.out.println(result);
            } else {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        consecutiveNumbers(30);
    }

}


