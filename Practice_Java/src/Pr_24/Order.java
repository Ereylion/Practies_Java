package Pr_24;

interface Order {
    boolean addItem(Item item);
    boolean remove(String itemName);
    int removeAll(String itemName);
    int itemsQuantity();
    Item[] getItems();
    double costTotal();
    int itemQuantity(String itemName);
    String[] itemsNames();
    Item[] sortedItemsByCostDesc();
}