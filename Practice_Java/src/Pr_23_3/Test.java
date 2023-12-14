package Pr_23_3;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Dish fish_soup = new Dish("Уха", "Суп из трех видов рыб", 15);
        Drink black_tea = new Drink("Черный чай", "Крепкий черный чай", 5);
        Dish pie = new Dish("Пирог", "Вкусный яблочный пирог", 20);

        Item[] items = {fish_soup, black_tea, pie, fish_soup};

        InternetOrder order = new InternetOrder(items);

        System.out.println("Общая стоимость заказа: " + order.getTotalCost() + "$");
        System.out.println("Общее кол-во позиций в заказе: " + order.getOrderSize());
        System.out.println("Кол-во позиций Уха в заказе: " + order.getItemQuantity("Уха"));

        Item[] sortedItems = order.getSortedItemsByCostDesc();
        System.out.println("Позиции отсортированные по стоимости (описанию):");
        for (Item item : sortedItems) {
            System.out.println(item.getName() + " - $" + item.getPrice());
        }
        System.out.println(Arrays.toString(order.getItems()));
    }
}
