package Pr_22;

public class MagicChair implements Chair {
    @Override
    public void sit(Chair chair) {
        System.out.println("Магический стул");
    }
    public void doMagic() {
        System.out.println("Абракадабра");
    }
}
