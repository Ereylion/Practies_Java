package Pr_23_2;

public class Test {
    public static void main(String[] args) {
        Dish fish_soup = new Dish("Уха", "Суп из трех видов рыб", 15);
        Drink black_tea = new Drink( "Черный чай", "Крепкий черный чай", 5);
        Dish pie = new Dish( "Пирог", "Вкусный яблочный пирог", 20);

        Order order1 = new Order();
        order1.addItem(fish_soup);
        order1.addItem(black_tea);

        Order order2 = new Order();
        order2.addItem(pie);
        order2.addItem(black_tea);

        TablesOrderManager orderManager = new TablesOrderManager();
        orderManager.placeOrder(order1);
        orderManager.placeOrder(order2);

        System.out.println("Общая стоимость 1-го заказа: " + order1.getTotalPrice() + "$");
        System.out.println("Общая стоимость 2-го заказа: " + order2.getTotalPrice() + "$");
    }
}
