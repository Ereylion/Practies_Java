package Pr_11;

import java.util.ArrayList;
import java.util.List;

public class MergeSortStudents {
    public static void main(String[] args) {
        // Создание двух списков данных о студентах
        List<Student_2> list1 = new ArrayList<>();
        list1.add(new Student_2("John", 3.8));
        list1.add(new Student_2("Alice", 3.9));
        list1.add(new Student_2("Bob", 3.5));

        List<Student_2> list2 = new ArrayList<>();
        list2.add(new Student_2("Emily", 3.7));
        list2.add(new Student_2("David", 4.0));
        list2.add(new Student_2("Sarah", 3.6));

        // Объединение и сортировка двух списков
        List<Student_2> mergedList = mergeSort(list1, list2);

        // Вывод отсортированного списка
        for (Student_2 student : mergedList) {
            System.out.println(student.getName() + ": " + student.getGPA());
        }
    }

    public static List<Student_2> mergeSort(List<Student_2> list1, List<Student_2> list2) {
        if (list1.size() <= 1 && list2.size() <= 1) {
            return merge(list1, list2);
        }

        int mid1 = list1.size() / 2;
        List<Student_2> left1 = list1.subList(0, mid1);
        List<Student_2> right1 = list1.subList(mid1, list1.size());

        int mid2 = list2.size() / 2;
        List<Student_2> left2 = list2.subList(0, mid2);
        List<Student_2> right2 = list2.subList(mid2, list2.size());

        List<Student_2> sortedLeft = mergeSort(left1, left2);
        List<Student_2> sortedRight = mergeSort(right1, right2);

        return merge(sortedLeft, sortedRight);
    }

    public static List<Student_2> merge(List<Student_2> list1, List<Student_2> list2) {
        List<Student_2> mergedList = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i).getGPA() > list2.get(j).getGPA()) {
                mergedList.add(list2.get(j));
                j++;
            } else {
                mergedList.add(list1.get(i));
                i++;
            }
        }

        while (i < list1.size()) {
            mergedList.add(list1.get(i));
            i++;
        }

        while (j < list2.size()) {
            mergedList.add(list2.get(j));
            j++;
        }

        return mergedList;
    }
}
