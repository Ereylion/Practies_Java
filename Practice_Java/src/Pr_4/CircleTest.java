package Pr_4;

import Pr_4.Circle;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);

        double radius = circle.getRadius();
        System.out.println("Радиус окружности: " + radius);

        circle.setRadius(7.0);
        System.out.println("Измененный радиус окружности: " + circle.getRadius());

        double area = circle.calculateArea();
        System.out.println("Площадь окружности: " + area);

        double perimeter = circle.calculatePerimeter();
        System.out.println("Периметр окружности: " + perimeter);
    }
}
