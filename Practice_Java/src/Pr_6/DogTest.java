package Pr_6;

public class DogTest {
    public static void main(String[] args) {
        Dog alabai = new Alabai("Белый");
        Dog labrador = new Labrador("Коричневый");

        System.out.println("Порода собаки: " + alabai.getBreed());
        System.out.println("Цвет собаки: " + alabai.getColor());
        alabai.play();

        System.out.println();

        System.out.println("Порода собаки: " + labrador.getBreed());
        System.out.println("Цвет собаки: " + labrador.getColor());
        labrador.play();
    }
}
