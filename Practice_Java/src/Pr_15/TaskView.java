package Pr_15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.List;

public class TaskView {
    private JFrame frame;
    private JList<String> taskList;
    private DefaultListModel<String> listModel;
    private JButton addButton;

    public TaskView() {
        frame = new JFrame("To-Do List");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        listModel = new DefaultListModel<>();
        taskList = new JList<>(listModel);

        addButton = new JButton("Добавить");

        frame.getContentPane().setLayout(new BorderLayout());
        frame.getContentPane().add(taskList, BorderLayout.CENTER);
        frame.getContentPane().add(addButton, BorderLayout.SOUTH);
    }

    public void updateView(List<String> tasks) {
        listModel.clear();
        for (String task : tasks) {
            listModel.addElement(task);
        }
        frame.setVisible(true);
    }

    public String getInputTask() {
        return JOptionPane.showInputDialog(frame, "Введите новую задачу:");
    }

    public void addButtonListener(ActionListener listener) {
        addButton.addActionListener(listener);
    }

    public String getSelectedTask() {
        return taskList.getSelectedValue();
    }

    public void showMessage(String message) {
        JOptionPane.showMessageDialog(frame, message);
    }
}
