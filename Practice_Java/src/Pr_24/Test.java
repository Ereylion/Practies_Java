package Pr_24;

public class Test {
    public static void main(String[] args) {
        // Тестирование OrderManager + исключений
        OrderManager orderManager = new OrderManager();
        System.out.println("Проверка 1-го исключения (OrderAlreadyAddedException)");
        System.out.println("Добавим заказ на столик" + "\n");

        try {
            // Пытаемся добавить заказ на столик
            Order order1 = new RestaurantOrder();
            orderManager.add(order1, 1);
            System.out.println("Заказ успешно добавлен на столик 1.");
        } catch (OrderAlreadyAddedException e) {
            System.out.println(e.getMessage()+ "\n");
        }

        try {
            // Попытка добавить заказ на уже занятый столик
            Order order2 = new RestaurantOrder();
            orderManager.add(order2, 1);
            System.out.println("Заказ успешно добавлен на столик 1." + "\n");
        } catch (OrderAlreadyAddedException e) {
            System.out.println(e.getMessage() + "\n");
        }

        System.out.println("Проверка 2-го исключения (IllegalTableNumber)");
        System.out.println("Получение заказа по несуществующему номеру столика: ");

        try {
            Order retrievedOrder = orderManager.getOrder(2);
            if (retrievedOrder != null) {
                System.out.println("Полученный заказ: " + retrievedOrder.toString() + "\n");
            } else {
                throw new IllegalTableNumber("Этого столика не существует"); // Вывод сообщения о несуществующем столике
            }
        } catch (IllegalTableNumber e) {
            System.out.println(e.getMessage() + "\n");
        }

        System.out.println("Тестирование InternetOrder: ");

        Item item1 = new Dish(15, "Рыба", "Рыба по-гавайски");
        Item item2 = new Dish(20, "Уха", "Суп из трех видов рыб");
        Item item3 = new Drink(10, "Черный чай", "Крепкий черный чай");
        Item item4 = new Dish(15, "Рыба", "Рыба по-гавайски");
        Item[] items = {item1, item2, item3, item4};
        InternetOrder internetOrder = new InternetOrder(items);

        System.out.println("Общая стоимость интернет-заказа: " + internetOrder.costTotal());
        System.out.println("Число позиций заказа: " + internetOrder.itemsQuantity() + "\n");
        System.out.println("Тестирование RestaurantOrder:");

        RestaurantOrder restaurantOrder = new RestaurantOrder();
        restaurantOrder.addItem(item1);
        restaurantOrder.addItem(item2);
        restaurantOrder.addItem(item3);
        restaurantOrder.addItem(item4);
        System.out.println("Общая стоимость заказа: " + restaurantOrder.costTotal());
        System.out.println("Количество позиций с названием 'Рыба': " + restaurantOrder.itemQuantity("Рыба"));
    }
}
