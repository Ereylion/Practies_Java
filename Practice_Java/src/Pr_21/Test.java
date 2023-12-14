package Pr_21;

public class Test {
    public static void main(String[] args) {
        // Пример ArrayQueueModule
        ArrayQueueModule.create();
        ArrayQueueModule.enqueue("Первый");
        ArrayQueueModule.enqueue("Второй");
        System.out.println("Размер ArrayQueueModule: " + ArrayQueueModule.size());
        System.out.println("Первый элемент в ArrayQueueModule: " + ArrayQueueModule.element());
        System.out.println("Извлечение элемента из ArrayQueueModule: " + ArrayQueueModule.dequeue());
        System.out.println("Размер ArrayQueueModule после извлечения: " + ArrayQueueModule.size());
        System.out.println();

        // Пример ArrayQueueADT
        ArrayQueueADT queueADT = new ArrayQueueADT();
        ArrayQueueADT.create(queueADT);
        ArrayQueueADT.enqueue(queueADT, "Первый");
        ArrayQueueADT.enqueue(queueADT, "Второй");
        System.out.println("Размер ArrayQueueADT: " + ArrayQueueADT.size(queueADT));
        System.out.println("Первый элемент в ArrayQueueADT: " + ArrayQueueADT.element(queueADT));
        System.out.println("Извлечение элемента из ArrayQueueADT: " + ArrayQueueADT.dequeue(queueADT));
        System.out.println("Размер ArrayQueueADT после извлечения: " + ArrayQueueADT.size(queueADT));
        System.out.println();

        // Пример ArrayQueue
        ArrayQueue queue = new ArrayQueue();
        queue.enqueue("Первый");
        queue.enqueue("Второй");
        System.out.println("Размер ArrayQueue: " + queue.size());
        System.out.println("Первый элемент в ArrayQueue: " + queue.element());
        System.out.println("Извлечение элемента из ArrayQueue: " + queue.dequeue());
        System.out.println("Размер ArrayQueue после извлечения: " + queue.size());
        System.out.println();

        // Пример использования класса LinkedQueue
        LinkedQueue linked_queue = new LinkedQueue();

        // Добавление элементов в очередь
        linked_queue.enqueue("Первый");
        linked_queue.enqueue("Второй");
        linked_queue.enqueue("Третий");

        // Удаление и печать элементов из очереди
        while (!linked_queue.isEmpty()) {
            System.out.println(linked_queue.dequeue());
        }
    }
}
