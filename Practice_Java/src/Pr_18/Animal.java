package Pr_18;
import java.io.Serializable;
public class Animal implements Serializable {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Animal{" + "name = '" + name + '\'' + ", age = " + age + '}';
    }
}
