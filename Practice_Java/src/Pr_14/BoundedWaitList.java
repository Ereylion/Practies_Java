package Pr_14;

import java.util.Collection;

/**
 * Реализация ограниченного списка ожидания, наследующая класс WaitList.
 * @param <E> тип элементов в списке ожидания
 */
public class BoundedWaitList<E> extends WaitList<E> {

    private int capacity; // Максимальная вместимость списка ожидания

    /**
     * Конструктор, который инициализирует ограниченный список ожидания с заданной вместимостью.
     * @param capacity максимальная вместимость списка ожидания (должна быть больше 0)
     * @throws IllegalArgumentException если capacity меньше или равно 0
     */
    public BoundedWaitList(int capacity) {
        super();
        if (capacity <= 0) throw new IllegalArgumentException("Максимальный размер должен быть больше 0! Получено значение: " + capacity);
        this.capacity = capacity;
    }

    /**
     * Конструктор, который инициализирует ограниченный список ожидания с элементами из переданной коллекции.
     * Вместимость списка ожидания устанавливается равной размеру коллекции.
     * @param col коллекция, содержащая элементы для списка ожидания
     */
    public BoundedWaitList(Collection<E> col) {
        super(col);
        this.capacity = col.size();
    }

    /**
     * Возвращает текущую вместимость списка ожидания.
     * @return текущая вместимость списка ожидания
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * Добавляет элемент в список ожидания, если еще не достигнута максимальная вместимость.
     * Если список ожидания заполнен, генерирует исключение IllegalStateException.
     * @param element элемент для добавления в список ожидания
     * @throws IllegalStateException если список ожидания заполнен
     */
    @Override
    public void add(E element) {
        if (components.size() == capacity) throw new IllegalStateException("Очередь заполнена!");
        components.add(element);
    }

    /**
     * Возвращает строковое представление объекта BoundedWaitList, включая вместимость и содержимое списка ожидания.
     * @return строковое представление объекта BoundedWaitList
     */
    @Override
    public String toString() {
        return "BoundedWaitList{" + "capacity=" + capacity + ", components=" + components + '}';
    }
}
