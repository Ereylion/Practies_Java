package Pr_15;

public class MVCPatternDemo {
    public static void main(String[] args) {
        Student model = retriveStudentFromDatabase();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);

        Student model1 = retriveStudentFromDatabase();
        StudentView view1 = new StudentView();
        StudentController controller1 = new StudentController(model1, view1);

        controller.setStudentName("John");
        controller.setStudentRollNo("12345");

        controller1.setStudentName("Maks");
        controller1.setStudentRollNo("22811");

        controller.updateView();
        controller1.updateView();
    }
    public static Student retriveStudentFromDatabase(){
        Student student = new Student();
        student.setName("DefaultName");
        student.setRollNo("DefaultRollNo");
        return student;
    }
}
