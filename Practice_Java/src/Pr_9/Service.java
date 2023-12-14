package Pr_9;

public class Service implements Priceable {
    private String description;
    private double hourlyRate;
    private int hours;

    public Service(String description, double hourlyRate, int hours) {
        this.description = description;
        this.hourlyRate = hourlyRate;
        this.hours = hours;
    }

    @Override
    public double getPrice() {
        return hourlyRate * hours;
    }

    public String getDescription() {
        return description;
    }
}
