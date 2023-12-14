package Pr_21;

// Класс ArrayQueueADT реализует очередь в виде абстрактного типа данных
public class ArrayQueueADT {
    private Object[] queue;
    private int size;
    private int front;
    private int rear;

    // Создание новой очереди
    public static void create(ArrayQueueADT queueADT) {
        queueADT.queue = new Object[10];
        queueADT.size = 0;
        queueADT.front = 0;
        queueADT.rear = -1;
    }

    // Добавление элемента в конец очереди
    public static void enqueue(ArrayQueueADT queueADT, Object element) {
        if (queueADT.size == queueADT.queue.length) {
            expandQueue(queueADT);
        }
        queueADT.rear = (queueADT.rear + 1) % queueADT.queue.length;
        queueADT.queue[queueADT.rear] = element;
        queueADT.size++;
    }

    // Получение первого элемента в очереди
    public static Object element(ArrayQueueADT queueADT) {
        if (isEmpty(queueADT)) {
            throw new IllegalStateException("Queue is empty");
        }
        return queueADT.queue[queueADT.front];
    }

    // Удаление и возвращение первого элемента в очереди
    public static Object dequeue(ArrayQueueADT queueADT) {
        if (isEmpty(queueADT)) {
            throw new IllegalStateException("Queue is empty");
        }
        Object element = queueADT.queue[queueADT.front];
        queueADT.queue[queueADT.front] = null;
        queueADT.front = (queueADT.front + 1) % queueADT.queue.length;
        queueADT.size--;
        return element;
    }

    // Получение текущего размера очереди
    public static int size(ArrayQueueADT queueADT) {
        return queueADT.size;
    }

    // Проверка, является ли очередь пустой
    public static boolean isEmpty(ArrayQueueADT queueADT) {
        return queueADT.size == 0;
    }

    // Удаление всех элементов из очереди
    public static void clear(ArrayQueueADT queueADT) {
        queueADT.queue = new Object[10];
        queueADT.size = 0;
        queueADT.front = 0;
        queueADT.rear = -1;
    }

    // Увеличение размера массива очереди
    private static void expandQueue(ArrayQueueADT queueADT) {
        Object[] newQueue = new Object[queueADT.queue.length * 2];
        int index = queueADT.front;
        for (int i = 0; i < queueADT.size; i++) {
            newQueue[i] = queueADT.queue[index];
            index = (index + 1) % queueADT.queue.length;
        }
        queueADT.queue = newQueue;
        queueADT.front = 0;
        queueADT.rear = queueADT.size - 1;
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
