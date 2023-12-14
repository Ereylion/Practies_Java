package Pr_24;

public class Test_Tables {
    public static boolean isTableFree(int tableNumber, boolean[] freeTables) {
        return freeTables[tableNumber - 1];
    }

    public static void printAvailableTables(int[] tables, boolean[] freeTables) {
        System.out.println("Свободные столики:");
        for (int table : tables) {
            if (table != 6 && isTableFree(table, freeTables)) {
                System.out.println("Стол: " + table);
            }
        }
    }

    public static void main(String[] args) {
        int[] tables = {1, 2, 3, 4, 5};
        boolean[] freeTables = {true, true, true, true, true};

        // Проверяем доступные столики
        printAvailableTables(tables, freeTables);

        // Тестирование OrderManager + исключений
        OrderManager orderManager = new OrderManager();
        System.out.println("\n");
        System.out.println("Проверка первого исключения (OrderAlreadyAddedException)");
        System.out.println("Добавим заказ на столик");

        try {
            // Пытаемся добавить заказ на столик
            int n = 1;
            Order order1 = new RestaurantOrder();
            orderManager.add(order1, n);
            System.out.println("Заказ успешно добавлен на столик " + n + ".\n");
            freeTables[n - 1] = false; // Устанавливаем стол как занятый
        } catch (OrderAlreadyAddedException e) {
            System.out.println(e.getMessage());
        }

        printAvailableTables(tables, freeTables);

        try {
            // Попытка добавить заказ на уже занятый столик
            Order order2 = new RestaurantOrder();
            orderManager.add(order2, 1);
            System.out.println("Заказ успешно добавлен на столик 1.");
        } catch (OrderAlreadyAddedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("\n");

        System.out.println("Проверка второго исключения (IllegalTableNumber)");
        System.out.println("Получение заказа по несуществующему номеру столика: ");

        try {
            Order retrievedOrder = orderManager.getOrder(6);
            if (retrievedOrder != null) {
                System.out.println("Полученный заказ: " + retrievedOrder.toString());
            }
            else {
                throw new IllegalTableNumber("Этого столика не существует"); // Вывод сообщения о несуществующем столике
            }
        } catch (IllegalTableNumber e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n");
        System.out.println("Тестирование InternetOrder");

        Item item1 = new Dish(15, "Рыба", "Рыба по-гавайски");
        Item item2 = new Dish(20, "Уха", "Суп из трех видов рыб");
        Item item3 = new Drink(10, "Черный чай", "Крепкий черный чай");
        Item item4 = new Dish(15, "Рыба", "Рыба по-гавайски");
        Item[] items = {item1, item2, item3, item4};
        InternetOrder internetOrder = new InternetOrder(items);

        System.out.println("Общая стоимость интернет-заказа: " + internetOrder.costTotal());
        System.out.println("Число позиций в заказе: " + internetOrder.itemsQuantity());
        System.out.println("\n");
        System.out.println("Тестирование RestaurantOrder:");

        RestaurantOrder restaurantOrder = new RestaurantOrder();
        restaurantOrder.addItem(item1);
        restaurantOrder.addItem(item2);
        restaurantOrder.addItem(item3);
        restaurantOrder.addItem(item4);
        System.out.println("Общая стоимость заказа: " + restaurantOrder.costTotal());
        System.out.println("Количество блюд с названием 'Рыба': " + restaurantOrder.itemQuantity("Рыба"));
    }
}
