package Pr_22;

public class Client implements Chair {
    Chair chair = new Chair() {
        @Override
        public void sit(Chair chair) {
            System.out.println("Вы сели на стул");
        }
    };

    @Override
    public void sit(Chair chair) {
        System.out.println("Вы сели на стул");
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }
}
