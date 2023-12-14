package Pr_21;

// Класс ArrayQueue реализует очередь в виде класса
public class ArrayQueue {
    private Object[] queue;
    private int size;
    private int front;
    private int rear;

    // Конструктор класса ArrayQueue
    public ArrayQueue() {
        queue = new Object[10];
        size = 0;
        front = 0;
        rear = -1;
    }

    // Добавление элемента в конец очереди
    public void enqueue(Object element) {
        if (size == queue.length) {
            expandQueue();
        }
        rear = (rear + 1) % queue.length;
        queue[rear] = element;
        size++;
    }

    // Получение первого элемента в очереди
    public Object element() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue[front];
    }

    // Удаление и возвращение первого элемента в очереди
    public Object dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        Object element = queue[front];
        queue[front] = null;
        front = (front + 1) % queue.length;
        size--;
        return element;
    }

    // Получение текущего размера очереди
    public int size() {
        return size;
    }

    // Проверка, является ли очередь пустой
    public boolean isEmpty() {
        return size == 0;
    }

    // Удаление всех элементов из очереди
    public void clear() {
        queue = new Object[10];
        size = 0;
        front = 0;
        rear = -1;
    }

    // Увеличение размера массива очереди
    private void expandQueue() {
        Object[] newQueue = new Object[queue.length * 2];
        int index = front;
        for (int i = 0; i < size; i++) {
            newQueue[i] = queue[index];
            index = (index + 1) % queue.length;
        }
        queue = newQueue;
        front = 0;
        rear = size - 1;
    }
}

//Инварианты:
//Размер очереди всегда неотрицательный (size >= 0).
//Индекс начала очереди находится в пределах от 0 до (размер очереди - 1) включительно (front >= 0 && front < queue.length).
//Индекс конца очереди также находится в пределах от 0 до (размер очереди - 1) включительно (rear >= 0 && rear < queue.length).

//Предусловия:
//Перед добавлением элемента в конец очереди (enqueue), размер очереди должен быть не больше, чем размер массива.
//Для методов element, dequeue, isEmpty и clear, очередь не должна быть пустой (размер очереди должен быть больше 0).

//Постусловия:
//После вызова метода enqueue, добавленный элемент становится последним в очереди (rear указывает на этот элемент).
//После вызова метода dequeue, извлеченный элемент удаляется из очереди и возвращается в качестве результата.
//После вызова метода clear, размер очереди становится равным 0, и все элементы удаляются из очереди.
