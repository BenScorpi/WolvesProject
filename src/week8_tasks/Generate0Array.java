package week8_tasks;

import java.util.Arrays;

public class Generate0Array {
    public static int[] generateArray(int N) {
        int[] arr = new int[N];

        int sum = 0;
        for (int i = 0; i < N - 1; i++) {
            arr[i] = -N + i;
            sum += arr[i];
        }

        arr[N - 1] = -sum;

        return arr;
    }

    public static void main(String[] args) {
        int N = 4;
        int[] arr = generateArray(N);
        System.out.println("Generated Array: " + Arrays.toString(arr));
    }
}
