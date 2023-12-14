package Pr_21;
// Класс LinkedQueue реализует очередь на связном списке
public class LinkedQueue extends AbstractQueue {
    private Node head;
    private Node tail;

    public LinkedQueue() {
        head = null;
        tail = null;
    }

    // Добавление элемента в конец очереди
    @Override
    public void enqueue(Object element) {
        Node newNode = new Node(element);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    // Удаление и возвращение первого элемента в очереди
    @Override
    public Object dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        Object element = head.value;
        head = head.next;
        size--;
        if (isEmpty()) {
            tail = null;
        }
        return element;
    }

    // Получение первого элемента в очереди
    @Override
    public Object element() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return head.value;
    }

    // Получение текущего размера очереди
    @Override
    public int size() {
        return size;
    }

    // Проверка, является ли очередь пустой
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    // Удаление всех элементов из очереди
    @Override
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }
}

//Инварианты:
//Размер очереди всегда неотрицательный (size >= 0).
//Для пустой очереди (isEmpty() == true), головной и хвостовой узлы должны указывать на null.
//Для непустой очереди (isEmpty() == false), и хвостовой узел должен указывать на null.

//Предусловия:
//Для методов enqueue, element, dequeue, isEmpty и clear, очередь не должна быть пустой (размер очереди должен быть больше 0).

//Постусловия:
//После вызова метода enqueue, добавленный элемент становится последним в очереди (tail указывает на этот элемент).
//После вызова метода dequeue, извлеченный элемент удаляется из очереди и возвращается в качестве результата.
//После вызова метода clear, размер очереди становится равным 0, и все элементы удаляются из очереди.