package Pr_20;
import java.util.Stack;

public class RPN_Calculator {
    // Метод для вычисления RPN-выражения
    public static double evaluateRPN(String[] tokens) {
        Stack<Double> stack = new Stack<>();

        for (String token : tokens) {
            if (isNumber(token)) { // Если токен является числом, помещаем его в стек
                stack.push(Double.parseDouble(token));
            } else if (isOperator(token)) { // Если токен является оператором, выполняем операцию над операндами
                if (stack.size() < 2) {
                    throw new IllegalArgumentException("Invalid RPN expression.");
                }
                double operand2 = stack.pop();
                double operand1 = stack.pop();
                double result = performOperation(operand1, operand2, token);
                stack.push(result);
            } else { // Если токен не является числом или оператором, возбуждается исключение
                throw new IllegalArgumentException("Invalid token: " + token);
            }
        }

        if (stack.size() != 1) {
            throw new IllegalArgumentException("Invalid RPN expression.");
        }

        return stack.pop();
    }
    // Метод для проверки, является ли токен числом
    private static boolean isNumber(String token) {
        try {
            Double.parseDouble(token);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    // Метод для проверки, является ли токен оператором
    private static boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }
    // Метод для выполнения операции в зависимости от оператора
    private static double performOperation(double operand1, double operand2, String operator) {
        switch (operator) {
            case "+":
                return operand1 + operand2;
            case "-":
                return operand1 - operand2;
            case "*":
                return operand1 * operand2;
            case "/":
                if (operand2 == 0) {
                    throw new ArithmeticException("Division by zero.");
                }
                return operand1 / operand2;
            default:
                throw new IllegalArgumentException("Unsupported operator: " + operator);
        }
    }

    public static void main(String[] args) {
        // Пример вычисления RPN-выражения: "15 13 - 7 *"
        String[] rpnExpression = {"15", "13", "-", "7", "*"};
        double result = evaluateRPN(rpnExpression);
        System.out.println("Result: " + result);

        // Пример вычисления RPN-выражения: "9 3 / 2 +"
        String[] rpnExpression1 = {"9", "3", "/", "2", "+"};
        double result1 = evaluateRPN(rpnExpression1);
        System.out.println("Result: " + result1);
    }
}
