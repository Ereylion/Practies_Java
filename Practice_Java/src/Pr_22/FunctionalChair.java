package Pr_22;

public class FunctionalChair implements Chair {
    public int sum(int a, int b) {
        return a + b;
    }

    @Override
    public void sit(Chair chair) {
        System.out.println("Многофункциональный стул");
    }
}