package Pr_6;
import java.util.List;
import java.util.ArrayList;
public abstract class Furniture {
    private String name;
    private String material;
    private int price;

    public Furniture(String name, String material, int price) {
        this.name = name;
        this.material = material;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getMaterial() {
        return material;
    }

    public int getPrice() {
        return price;
    }

    public abstract void use();
}

class Chair extends Furniture {
    public Chair(String material, int price) {
        super("Стул", material, price);
    }

    @Override
    public void use() {
        System.out.println("Вы сели на стул.");
    }
}

class Table extends Furniture {
    public Table(String material, int price) {
        super("Стол", material, price);
    }

    @Override
    public void use() {
        System.out.println("Вы поставили вазу на стол.");
    }
}

class FurnitureShop {
    private List<Furniture> furnitureList;

    public FurnitureShop() {
        furnitureList = new ArrayList<>();
    }

    public void addFurniture(Furniture furniture) {
        furnitureList.add(furniture);
    }

    public void showAvailableFurniture() {
        System.out.println("Доступная мебель в магазине:");
        for (Furniture furniture : furnitureList) {
            System.out.println(furniture.getName() + " - " + furniture.getMaterial() + " - Цена: " + furniture.getPrice());
        }
    }
}
