package Pr_2;

public class SumArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        // Использование цикла for:
        int sumFor = 0;
        for (int number : numbers) {
            sumFor += number;
        }
        System.out.println("Сумма чисел в массиве с использованием цикла for: " + sumFor);

        // Использование цикла while:
        int sumWhile = 0;
        int i = 0;
        while (i < numbers.length) {
            sumWhile += numbers[i];
            i++;
        }
        System.out.println("Сумма чисел в массиве с использованием цикла while: " + sumWhile);

        // Использование цикла do-while:
        int sumDoWhile = 0;
        int j = 0;
        do {
            sumDoWhile += numbers[j];
            j++;
        } while (j < numbers.length);
        System.out.println("Сумма чисел в массиве с использованием цикла do-while: " + sumDoWhile);
    }
}
