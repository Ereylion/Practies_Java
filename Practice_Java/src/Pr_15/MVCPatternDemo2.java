package Pr_15;

public class MVCPatternDemo2 {
    public static void main(String[] args) {
        Employee model = new Employee("John Doe", 20.0, 40);
        EmployeeView view = new EmployeeView();
        EmployeeController controller = new EmployeeController(model, view);

        controller.updateEmployeeDetails("Jane Smith", 25.0, 50);

        controller.updateView();

    }
}
