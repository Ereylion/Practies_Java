package Pr_19;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class ArrayContainer<T> {
    private T[] array;

    public ArrayContainer(T[] array) {
        this.array = array;
    }

    public List<T> arrayToList() {
        return Arrays.asList(array);
    }

    public T getElementAtIndex(int index) {
        if (index < 0 || index >= array.length) {
            throw new IndexOutOfBoundsException("Index is out of bounds.");
        }
        return array[index];
    }

    public static void main(String[] args) {
        // Создание объекта ArrayContainer для строк
        String[] stringArray = {"apple", "banana", "cherry", "date", "elderberry"};
        ArrayContainer<String> stringContainer = new ArrayContainer<>(stringArray);

        // Получение списка из массива строк
        List<String> stringList = stringContainer.arrayToList();
        System.out.println("List from String array: " + stringList);

        // Создание объекта ArrayContainer для целых чисел
        Integer[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        ArrayContainer<Integer> integerContainer = new ArrayContainer<>(intArray);

        // Получение списка из массива целых чисел
        List<Integer> intList = integerContainer.arrayToList();
        System.out.println("List from Integer array: " + intList);

        // Получение элемента из массива строк по индексу
        System.out.println("Element at index 2: " + stringContainer.getElementAtIndex(2));

        // Получение первых 5 элементов из списка файлов в указанной директории
        File[] filesInDirectory = new File("src").listFiles();
        ArrayContainer<File> fileContainer = new ArrayContainer<>(filesInDirectory);
        List<File> fileList = fileContainer.arrayToList();
        System.out.println("List of files in directory: " + fileList.subList(0, Math.min(5, fileList.size())));
    }
}

