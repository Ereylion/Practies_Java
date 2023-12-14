package Pr_21;
// Абстрактная реализация интерфейса Queue, содержащая общую логику LinkedQueue и ArrayQueue.
public abstract class AbstractQueue implements Queue {
    protected Object[] queue;
    protected int size;
    protected int front;
    protected int rear;
}
