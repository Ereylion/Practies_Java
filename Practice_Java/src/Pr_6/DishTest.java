package Pr_6;

public class DishTest {
    public static void main(String[] args) {
        Plate plate = new Plate("Керамика", "Серый", "Белый");
        Cup cup = new Cup("Стекло", "Синяя", true);

        System.out.println("Материал тарелки: " + plate.getMaterial());
        System.out.println("Цвет тарелки: " + plate.getColor());
        System.out.println("Цвет узора тарелки: " + plate.getColorPattern());
        plate.use();

        System.out.println();

        System.out.println("Материал чашки: " + cup.getMaterial());
        System.out.println("Цвет чашки: " + cup.getColor());
        System.out.println("Наличие ручки у чашки: " + (cup.hasHandle() ? "есть" : "нет"));
        cup.use();
    }
}
