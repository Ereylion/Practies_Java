package Pr_14;

/**
 * Класс UnfairWaitList является подклассом класса WaitList и расширяет его функциональность.
 * Позволяет более гибко управлять элементами в очереди.
 * @param <E> тип элементов в очереди
 */
public class UnfairWaitList<E> extends WaitList<E> {

    /**
     * Конструктор, создающий новый пустой UnfairWaitList.
     */
    public UnfairWaitList() {
        super();
    }

    /**
     * Удаляет первое вхождение указанного элемента из очереди.
     * Если элемент найден, он помечается как удаленный и перемещается в конец очереди.
     * @param element элемент, который нужно удалить из очереди
     */
    public void remove (E element) {
        boolean removed = false; // флаг, указывающий, был ли удален элемент из очереди
        for (int i = 0; i < components.size(); i++) {
            E el = components.remove();
            if (!removed && el.equals(element)) {
                removed = true;
            } else {
                components.add(el);
            }
        }
        if (removed) {
            components.add(components.remove());
        }
    }

    /**
     * Перемещает указанный элемент в конец очереди.
     * Сначала вызывается метод remove(element), чтобы удалить элемент из очереди.
     * Затем, если размер очереди уменьшился после вызова remove, элемент добавляется в конец очереди.
     * @param element элемент, который нужно переместить в конец очереди
     */
    public void moveToBack(E element) {
        int prevSize = components.size(); // предыдущий размер очереди
        remove(element);
        if (components.size() < prevSize) {
            components.add(element);
        }
    }
}
