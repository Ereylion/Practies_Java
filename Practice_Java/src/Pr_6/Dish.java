package Pr_6;

public abstract class Dish {
    private String material;
    private String color;

    public Dish(String material, String color) {
        this.material = material;
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }

    public abstract void use();
}

class Plate extends Dish {
    private String colorPattern;

    public Plate(String material, String color, String colorPattern) {
        super(material, color);
        this.colorPattern = colorPattern;
    }

    public String getColorPattern() {
        return colorPattern;
    }

    @Override
    public void use() {
        System.out.println("Вы поели из тарелки.");
    }
}

class Cup extends Dish {
    private boolean handle;

    public Cup(String material, String color, boolean handle) {
        super(material, color);
        this.handle = handle;
    }

    public boolean hasHandle() {
        return handle;
    }

    @Override
    public void use() {
        System.out.println("Вы попили из чашки.");
    }
}
