package Pr_11;

public class TestInsertionSort {
    public static void main(String[] args) {
        Student[] students = new Student[5];
        students[0] = new Student("John", 20);
        students[1] = new Student("Alice", 19);
        students[2] = new Student("Bob", 22);
        students[3] = new Student("Emily", 21);
        students[4] = new Student("David", 18);

        System.out.println("Неотсортированный массив:");
        printStudents(students);

        insertionSort(students);

        System.out.println("Отсортированный массив:");
        printStudents(students);
    }
    // Метод для сортировки массива объектов класса Student методом вставок
    public static void insertionSort(Student[] students) {
        for (int i = 1; i < students.length; i++) {
            Student key = students[i];
            int j = i - 1;
            while (j >= 0 && students[j].getIDNumber() > key.getIDNumber()) {
                students[j + 1] = students[j];
                j--;
            }
            students[j + 1] = key;
        }
    }

    // Метод для вывода массива объектов класса Student
    public static void printStudents(Student[] students) {
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println();
    }
}


