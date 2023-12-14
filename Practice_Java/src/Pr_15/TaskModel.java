package Pr_15;

import java.util.ArrayList;
import java.util.List;

public class TaskModel {
    private List<String> tasks;

    public TaskModel() {
        tasks = new ArrayList<>();
    }

    public void addTask(String task) {
        tasks.add(task);
    }

    public List<String> getTasks() {
        return tasks;
    }
}
