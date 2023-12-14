package Pr_18;

public class Calculator {
    public static <T extends Number> T sum(T num1, T num2) {
        if (num1 instanceof Double || num2 instanceof Double) {
            return (T) Double.valueOf(num1.doubleValue() + num2.doubleValue());
        } else if (num1 instanceof Float || num2 instanceof Float) {
            return (T) Float.valueOf(num1.floatValue() + num2.floatValue());
        } else if (num1 instanceof Long || num2 instanceof Long) {
            return (T) Long.valueOf(num1.longValue() + num2.longValue());
        } else {
            return (T) Integer.valueOf(num1.intValue() + num2.intValue());
        }
    }

    public static <T extends Number> T multiply(T num1, T num2) {
        if (num1 instanceof Double || num2 instanceof Double) {
            return (T) Double.valueOf(num1.doubleValue() * num2.doubleValue());
        } else if (num1 instanceof Float || num2 instanceof Float) {
            return (T) Float.valueOf(num1.floatValue() * num2.floatValue());
        } else if (num1 instanceof Long || num2 instanceof Long) {
            return (T) Long.valueOf(num1.longValue() * num2.longValue());
        } else {
            return (T) Integer.valueOf(num1.intValue() * num2.intValue());
        }
    }

    public static <T extends Number> T divide(T num1, T num2) {
        if (num2.doubleValue() == 0.0) {
            throw new ArithmeticException("Division by zero.");
        }

        if (num1 instanceof Double || num2 instanceof Double) {
            return (T) Double.valueOf(num1.doubleValue() / num2.doubleValue());
        } else if (num1 instanceof Float || num2 instanceof Float) {
            return (T) Float.valueOf(num1.floatValue() / num2.floatValue());
        } else if (num1 instanceof Long || num2 instanceof Long) {
            return (T) Long.valueOf(num1.longValue() / num2.longValue());
        } else {
            return (T) Integer.valueOf(num1.intValue() / num2.intValue());
        }
    }

    public static <T extends Number> T subtraction(T num1, T num2) {
        if (num1 instanceof Double || num2 instanceof Double) {
            return (T) Double.valueOf(num1.doubleValue() - num2.doubleValue());
        } else if (num1 instanceof Float || num2 instanceof Float) {
            return (T) Float.valueOf(num1.floatValue() - num2.floatValue());
        } else if (num1 instanceof Long || num2 instanceof Long) {
            return (T) Long.valueOf(num1.longValue() - num2.longValue());
        } else {
            return (T) Integer.valueOf(num1.intValue() - num2.intValue());
        }
    }

    public static void main(String[] args) {
        System.out.println("Сложение: " + Calculator.sum(22, 7.3));
        System.out.println("Вычитание: " + Calculator.subtraction(17, 6.6));
        System.out.println("Умножение: " + Calculator.multiply(4, 3.2));
        System.out.println("Деление: " + Calculator.divide(25.0, 5));
    }
}
