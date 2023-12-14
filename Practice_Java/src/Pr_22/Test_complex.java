package Pr_22;

public class Test_complex {
    public static void main(String[] args) {
        ConcreteFactory factory = new ConcreteFactory();

        Complex complex1 = factory.createComplex();
        System.out.println("Complex1: " + "Real: " + complex1.getReal() + " Image: " + complex1.getImage());

        Complex complex2 = factory.createComplex(10, 5);
        System.out.println("Complex2: " + "Real: " + complex2.getReal() + " Image: " + complex2.getImage());
    }
}
