package Pr_24;

class Drink implements Item {
    private final double cost; // Цена
    private final String name; //название
    private final String description; // Описание

    public Drink(String name, String description) {
        this(0, name, description);
    }

    public Drink(double cost, String name, String description) {
        // Проверка входных данных
        if (cost < 0 || name.isEmpty() || description.isEmpty()) {
            throw new IllegalArgumentException("Неверный ввод.");
        }
        this.cost = cost;
        this.name = name;
        this.description = description;
    }

    public double getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
