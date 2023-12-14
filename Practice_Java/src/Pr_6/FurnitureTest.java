package Pr_6;

public class FurnitureTest {
    public static void main(String[] args) {
        FurnitureShop furnitureShop = new FurnitureShop();
        furnitureShop.addFurniture(new Chair("Дерево", 100));
        furnitureShop.addFurniture(new Table("Стекло", 200));

        furnitureShop.showAvailableFurniture();

        Furniture chair = new Chair("Кожа", 150);
        Furniture table = new Table("Дерево", 250);

        System.out.println("Мебель: " + chair.getName());
        System.out.println("Материал: " + chair.getMaterial());
        System.out.println("Цена: " + chair.getPrice());
        chair.use();

        System.out.println();

        System.out.println("Мебель: " + table.getName());
        System.out.println("Материал: " + table.getMaterial());
        System.out.println("Цена: " + table.getPrice());
        table.use();
    }
}
