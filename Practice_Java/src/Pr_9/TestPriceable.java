package Pr_9;

public class TestPriceable {
    public static void main(String[] args) {
        Product product = new Product("Телефон", 30000.0);
        Service service = new Service("Ремонт автомобиля", 50000, 2);

        System.out.println("Цена товара "+ product.getName() + ": " + product.getPrice());
        System.out.println("Цена услуги "+ service.getDescription() + ": " + service.getPrice());
    }
}
