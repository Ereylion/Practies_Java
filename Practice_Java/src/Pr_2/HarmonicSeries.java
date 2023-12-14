package Pr_2;

public class HarmonicSeries {
    public static void main(String[] args) {
        int n = 10;
        double sum = 0.0;

        System.out.println("Первые " + n + " чисел гармонического ряда:");

        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
            System.out.println("1/" + i + " = " + sum);
        }
    }
}

