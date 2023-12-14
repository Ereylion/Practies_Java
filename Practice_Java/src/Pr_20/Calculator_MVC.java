package Pr_20;

import javax.swing.*;

public class Calculator_MVC {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> { // Создание экземпляров модели, представления и контроллера калькулятора
            Calculator_Model model = new Calculator_Model();
            Calculator_View view = new Calculator_View();
            Calculator_Controller controller = new Calculator_Controller(model, view);
            view.setController(controller);

            // Создание и настройка основного окна приложения
            JFrame frame = new JFrame("MyCalculator");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.getContentPane().add(view.getMainPanel());
            frame.setSize(400, 300);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
