package Pr_23_1;

public class Test {
    public static void main(String[] args) {
        Drink black_tea = new Drink("Черный чай", "Крепкий черный чай");
        Drink green_tea = new Drink("Зеленый чай", "Освежающий зеленый чай", 15);
        System.out.println("Название 1-го напитка: " + black_tea.getName());
        System.out.println("Описание 1-го напитка: " + black_tea.getDescription());
        System.out.println("Цена 1-го напитка: " + black_tea.getPrice());

        System.out.println("Название 2-го напитка: " + green_tea.getName());
        System.out.println("Описание 2-го напитка: " + green_tea.getDescription());
        System.out.println("Цена 2-го напитка: " + green_tea.getPrice());
    }
}
