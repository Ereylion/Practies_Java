package Pr_20;

import javax.swing.*;
import java.awt.*;

public class Calculator_View {
    private JPanel mainPanel;
    private JTextField display;
    private JButton[] buttons;

    private Calculator_Controller controller;

    public Calculator_View() {
        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        display = new JTextField(10);
        display.setEditable(false);
        display.setFont(new Font("Arial", Font.PLAIN, 20));
        mainPanel.add(display, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4));

        buttons = new JButton[16]; // Инициализация массива кнопок
        String[] buttonLabels = {"7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "C", "0", "=", "+"};

        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton(buttonLabels[i]); // Создание кнопки с соответствующей меткой
            buttons[i].setFont(new Font("Arial", Font.PLAIN, 18));
            buttonPanel.add(buttons[i]); // Добавление кнопки на панель кнопок
        }

        mainPanel.add(buttonPanel, BorderLayout.CENTER);
    }

    public void setController(Calculator_Controller controller) {
        this.controller = controller;
        for (JButton button : buttons) {
            button.addActionListener(controller); // Установка контроллера для всех кнопок
        }
    }

    public void updateDisplay(String text) { // Обновление отображения с заданным текстом
        display.setText(text);
    }
    public JPanel getMainPanel() {
        return mainPanel;
    }
}
