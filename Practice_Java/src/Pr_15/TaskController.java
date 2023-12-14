package Pr_15;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TaskController {
    private TaskModel model;
    private TaskView view;

    public TaskController(TaskModel model, TaskView view) {
        this.model = model;
        this.view = view;

        view.addButtonListener(new AddButtonListener());
    }

    class AddButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String newTask = view.getInputTask();
            if (!newTask.isEmpty()) {
                model.addTask(newTask);
                view.showMessage("Задача добавлена!");
                view.updateView(model.getTasks());
            }
        }
    }

    public void start() {
        view.updateView(model.getTasks());
    }
}
