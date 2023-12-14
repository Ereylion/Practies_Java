package Pr_20;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

public class Calculator_Controller implements ActionListener {
    private Calculator_Model model;
    private Calculator_View view;
    private Stack<Double> stack;

    public Calculator_Controller(Calculator_Model model, Calculator_View view) {
        this.model = model;
        this.view = view;
        stack = new Stack<>();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if (isNumber(command)) { // Если команда является числом, помещаем его в стек и обновляем отображение
            double number = Double.parseDouble(command);
            stack.push(number);
            view.updateDisplay(Double.toString(number));
        } else if (command.equals("C")) { // Если команда "C" (очистка), очищаем стек и обновляем отображение
            stack.clear();
            view.updateDisplay("");
        } else if (isOperator(command)) { // Если команда является оператором, выполняем соответствующую операцию
            if (stack.size() < 2) {
                view.updateDisplay("Error");
                return;
            }

            double operand2 = stack.pop();
            double operand1 = stack.pop();
            double result = performOperation(operand1, operand2, command); // Выполнение операции
            stack.push(result);
            view.updateDisplay(Double.toString(result));
        }
    }
    // Метод для проверки, является ли команда числом
    private boolean isNumber(String token) {
        try {
            Double.parseDouble(token);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    // Метод для проверки, является ли команда оператором
    private boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }
    // Метод для выполнения операции в зависимости от оператора
    private double performOperation(double operand1, double operand2, String operator) {
        switch (operator) {
            case "+":
                return operand1 + operand2;
            case "-":
                return operand1 - operand2;
            case "*":
                return operand1 * operand2;
            case "/":
                if (operand2 == 0) {
                    view.updateDisplay("Error");
                    return Double.NaN; // // Проверка деления на ноль
                }
                return operand1 / operand2;
            default:
                view.updateDisplay("Error");
                return 0;
        }
    }
}
