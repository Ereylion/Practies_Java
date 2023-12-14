package Pr_6;

public abstract class Dog {
    private String breed;
    private String color;

    public Dog(String breed, String color) {
        this.breed = breed;
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public String getColor() {
        return color;
    }

    public abstract void play();
}

class Alabai extends Dog {
    public Alabai(String color) {
        super("Алабай", color);
    }

    @Override
    public void play() {
        System.out.println("Вы поиграли с алабаем");
    }
}

class Labrador extends Dog {
    public Labrador(String color) {
        super("Лабрадор", color);
    }

    @Override
    public void play() {
        System.out.println("Вы поиграли с лабрадором");
    }
}
