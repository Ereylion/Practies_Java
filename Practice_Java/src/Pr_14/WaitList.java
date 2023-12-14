package Pr_14;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * Реализация списка ожидания, реализующая интерфейс IWaitList.
 * @param <E> тип элементов в списке ожидания
 */
public class WaitList<E> implements IWaitList<E> {

    protected ConcurrentLinkedQueue<E> components; // Очередь компонентов списка ожидания

    /**
     * Конструктор, создающий новый пустой список ожидания.
     */
    public WaitList() {
        components = new ConcurrentLinkedQueue<>();
    }

    /**
     * Конструктор, создающий новый список ожидания из переданной коллекции.
     * @param collection коллекция, содержащая элементы для списка ожидания
     */
    public WaitList(Collection<E> collection) {
        components = new ConcurrentLinkedQueue<>(collection);
    }

    /**
     * Возвращает строковое представление объекта WaitList, включая содержимое списка ожидания.
     * @return строковое представление объекта WaitList
     */
    @Override
    public String toString() {
        return "WaitList{" + "components=" + components + '}';
    }

    /**
     * Добавляет элемент в конец списка ожидания.
     * @param element элемент для добавления в список ожидания
     */
    @Override
    public void add(E element) {
        components.add(element);
    }

    /**
     * Удаляет и возвращает элемент из начала списка ожидания.
     * Если список ожидания пуст, генерирует исключение IllegalStateException.
     * @return удаленный элемент из списка ожидания
     * @throws IllegalStateException если список ожидания пуст
     */
    @Override
    public E remove() {
        if (isEmpty()) throw new IllegalStateException("Очередь пуста!");
        return components.remove();
    }

    /**
     * Проверяет наличие элемента в списке ожидания.
     * @param element элемент, для которого проверяется наличие в списке ожидания
     * @return true, если элемент содержится в списке ожидания, в противном случае - false
     */
    @Override
    public boolean contains(E element) {
        boolean res = false;
        for (int i = 0; i < components.size(); i++) {
            E el = components.remove();
            if (el.equals(element)) res = true;
            components.add(el);
        }
        return res;
    }

    /**
     * Проверяет наличие всех элементов из переданной коллекции в списке ожидания.
     * @param collection коллекция, элементы которой проверяются наличие в списке ожидания
     * @return true, если все элементы из коллекции содержатся в списке ожидания, в противном случае - false
     */
    @Override
    public boolean containsAll(Collection<E> collection) {
        ArrayList<E> al = new ArrayList<>(collection);
        for (int i = 0; i < collection.size(); i++) {
            boolean res = false;
            for (int j = 0; j < components.size(); j++) {
                E el = components.remove();
                if (el.equals(al.get(i))) res = true;
                components.add(el);
            }
            if (!res) return false;
        }
        return true;
    }

    /**
     * Проверяет, пуст ли список ожидания.
     * @return true, если список ожидания пуст, в противном случае - false
     */
    @Override
    public boolean isEmpty() {
        return components.isEmpty();
    }
}
