package Pr_2;

import java.util.Arrays;
import java.util.Random;

public class RandomArray {
    public static void main(String[] args) {
        int[] arr = generateRandomArray();

        System.out.println("Исходный массив:");
        printArray(arr);

        Arrays.sort(arr);

        System.out.println("Отсортированный массив:");
        printArray(arr);
    }

    private static int[] generateRandomArray() {
        int[] arr = new int[8];
        Random random = new Random();

        for (int i = 0; i < 8; i++) {
            arr[i] = random.nextInt(100);
        }

        return arr;
    }

    private static void printArray(int[] arr) {
        for (int j : arr) {
            System.out.println(j);
        }
    }
}
