package Pr_2;

public class Factorial {
    public static int calculateFactorial(int number) {
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        int number = 5;
        int factorial = calculateFactorial(number);
        System.out.println("Факториал числа " + number + " равен: " + factorial);
    }
}
