package Pr_11;

public class TestSortingStudentsByGPA {
    public static void main(String[] args) {
        Student_2[] students = new Student_2[5];
        students[0] = new Student_2("John", 3.8);
        students[1] = new Student_2("Alice", 3.9);
        students[2] = new Student_2("Bob", 3.5);
        students[3] = new Student_2("Emily", 3.7);
        students[4] = new Student_2("David", 4.0);

        SortingStudentsByGPA.quickSort(students, 0, students.length - 1);

        System.out.println("Отсортированный список студентов по итоговым баллам (в порядке убывания):");
        for (Student_2 student : students) {
            System.out.println("Имя: " + student.getName() + ", GPA: " + student.getGPA());
        }
    }
}
