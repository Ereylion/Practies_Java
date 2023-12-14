package Pr_20;

public class Calculator_Model {
    private double result;

    public double getResult() {
        return result;
    }

    public void performOperation(double operand1, double operand2, String operator) {
        switch (operator) {
            case "+":
                result = operand1 + operand2;
                break;
            case "-":
                result = operand1 - operand2;
                break;
            case "*":
                result = operand1 * operand2;
                break;
            case "/":
                if (operand2 == 0) {
                    result = Double.NaN; // // Проверка деления на ноль
                } else {
                    result = operand1 / operand2;
                }
                break;
        }
    }
}
