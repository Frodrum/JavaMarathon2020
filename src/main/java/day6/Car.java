package day6;

public class Car {
    private int yearOfIssue;
    private String model;
    private String color;

    public Car() {}

    public Car(int yearOfIssue, String model, String color) {
        this.yearOfIssue = yearOfIssue;
        this.model = model;
        this.color = color;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void info() {
        System.out.println("Это автомобиль");
    }

    public int yearDifference(int year) {
        return Math.abs(yearOfIssue - year);
    }
}
