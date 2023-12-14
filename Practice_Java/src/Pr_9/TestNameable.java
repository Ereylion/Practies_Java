package Pr_9;

public class TestNameable {
    public static void main(String[] args) {
        Cat cat = new Cat("Барсик");
        Dog dog = new Dog("Алекс");

        System.out.println(cat.getName());
        System.out.println(dog.getName());
    }
}
