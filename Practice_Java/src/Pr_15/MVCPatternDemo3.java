package Pr_15;

public class MVCPatternDemo3 {
    public static void main(String[] args) {
        TaskModel model = new TaskModel();
        TaskView view = new TaskView();
        TaskController controller = new TaskController(model, view);
        controller.start();
    }
}
