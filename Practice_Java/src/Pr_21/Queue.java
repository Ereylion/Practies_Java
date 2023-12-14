package Pr_21;

public interface Queue {
    void enqueue(Object element); // Добавление элемента в конец очереди
    Object dequeue(); // Удаление и возвращение первого элемента в очереди
    Object element(); // Получение первого элемента в очереди
    int size(); // Получение текущего размера очереди
    boolean isEmpty(); // Проверка, является ли очередь пустой
    void clear(); // Удаление всех элементов из очереди
}
