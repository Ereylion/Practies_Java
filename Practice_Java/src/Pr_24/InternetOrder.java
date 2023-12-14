package Pr_24;

import java.util.ArrayList;
import java.util.List;

public class InternetOrder implements Order {
    private List<Item> itemList; // Список блюд

    // Добавление блюда в список
    public InternetOrder(Item[] items) {
        this.itemList = new ArrayList<>();
        for (Item item : items) {
            itemList.add(item);
        }
    }

    // Удаление блюда из списка
    public boolean addItem(Item item) {
        return itemList.add(item);
    }

    // Удаление блюда из списка
    public boolean remove(String itemName) {
        boolean removed = false;
        for (Item item : itemList) {
            if (item.getName().equals(itemName)) {
                itemList.remove(item);
                removed = true;
                break;
            }
        }
        return removed;
    }

    // Возвращение количества удаленных экземпляров
    public int removeAll(String itemName) {
        int count = 0;
        for (int i = itemList.size() - 1; i >= 0; i--) {
            if (itemList.get(i).getName().equals(itemName)) {
                itemList.remove(i);
                count++;
            }
        }
        return count;
    }

    // Возвращает количество блюд
    public int itemsQuantity() {
        return itemList.size();
    }

    // Возвращает массив блюд
    public Item[] getItems() {
        return itemList.toArray(new Item[0]);
    }

    // Общая стоимость всех блюд
    public double costTotal() {
        double total = 0;
        for (Item item : itemList) {
            total += item.getCost();
        }
        return total;
    }

    // Подсчет кол-ва экземпляров определенного блюда
    public int itemQuantity(String itemName) {
        int count = 0;
        for (Item item : itemList) {
            if (item.getName().equals(itemName)) {
                count++;
            }
        }
        return count;
    }

    // Массив имен всех блюд
    public String[] itemsNames() {
        List<String> names = new ArrayList<>();
        for (Item item : itemList) {
            names.add(item.getName());
        }
        return names.toArray(new String[0]);
    }

    // Массив отсортированных блюд по убыванию цены
    public Item[] sortedItemsByCostDesc() {
        itemList.sort((item1, item2) -> Double.compare(item2.getCost(), item1.getCost()));
        return itemList.toArray(new Item[0]);
    }
}
