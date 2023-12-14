package Pr_22;

public class Test_chairs {
    public static void main(String[] args) {
        ChairFactory chairFactory = new ChairFactory();

        FunctionalChair functionalChair = chairFactory.createFanctionalChair();
        VictorianChair victorianChair = chairFactory.createVictorianChair();
        MagicChair magicChair = chairFactory.createMagicanChair();

        functionalChair.sit(functionalChair);
        System.out.println("Сумма: " + functionalChair.sum(3, 5));

        victorianChair.sit(victorianChair);
        System.out.println("Век: " + victorianChair.getAge());

        magicChair.sit(magicChair);
        magicChair.doMagic();
    }
}
