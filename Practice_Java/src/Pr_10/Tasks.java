package Pr_10;

import java.util.Scanner;
public class Tasks {
    static String task_8(String s) {
        if (s.length() == 1) {
            return "YES";
        } else {
            if (s.substring(0, 1).equals(s.substring(s.length() - 1, s.length()))) {
                if (s.length() == 2) {
                    return "YES";
                }
                return task_8(s.substring(1, s.length() - 1));
            } else {
                return "NO";
            }
        }
    }
    static int task_9(int a, int b) {
        if (a > b + 1) {
            return 0;
        }
        if (a == 0 || b == 0) {
            return 1;
        }
        return task_9(a, b - 1) + task_9(a - 1, b - 1);
    }

    static int task_10(int n, int i) {
        return (n == 0) ? i : task_10(n / 10, i * 10 + n % 10);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;
        // 8)
        System.out.println("8) Палиндром. Дано слово, состоящее только из строчных латинских букв. Проверьте, является ли это слово палиндромом.");
        System.out.print("  Введи слово: ");
        String line = scanner.next();
        System.out.println("  Результат: " + task_8(line));

        // 9)
        System.out.println("\n9) Без двух нулей. Даны числа a и b. Определите, сколько существует последовательностей из a нулей и b единиц, в которых никакие два нуля не стоят рядом.");
        System.out.print("Введи число a: ");
        int a = scanner.nextInt();
        System.out.print("Введи число b: ");
        int b = scanner.nextInt();
        System.out.print("Кол-во последовательностей: " + task_9(a, b));

        // 10)
        System.out.println("\n10) Разворот числа. Дано число n, десятичная запись которого не содержит нулей. Получите число, записанное теми же цифрами, но в противоположном порядке.");
        System.out.print("Введи число: ");
        N = scanner.nextInt();
        System.out.println("Результат: " + task_10(N, 0));

    }
}