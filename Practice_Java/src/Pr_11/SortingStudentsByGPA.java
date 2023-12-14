package Pr_11;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student_2> {

    @Override
    public int compare(Student_2 student1, Student_2 student2) {
        // Сравнение итоговых баллов в порядке убывания
        return Double.compare(student2.getGPA(), student1.getGPA());
    }

    public static void quickSort(Student_2[] students, int low, int high) {
        if (low < high) {
            // Разделение массива по опорному элементу
            int pivotIndex = partition(students, low, high);

            // Рекурсивная сортировка левой и правой частей массива
            quickSort(students, low, pivotIndex - 1);
            quickSort(students, pivotIndex + 1, high);
        }
    }

    private static int partition(Student_2[] students, int low, int high) {
        // Используем последний элемент в качестве опорного
        double pivot = students[high].getGPA();
        int i = low - 1;

        for (int j = low; j < high; j++) {
            // Если текущий элемент меньше опорного
            if (students[j].getGPA() < pivot) {
                i++;

                // Меняем элементы местами
                Student_2 temp = students[i];
                students[i] = students[j];
                students[j] = temp;
            }
        }

        // Меняем опорный элемент с элементом, стоящим после всех меньших элементов
        Student_2 temp = students[i + 1];
        students[i + 1] = students[high];
        students[high] = temp;

        return i + 1;
    }
}

