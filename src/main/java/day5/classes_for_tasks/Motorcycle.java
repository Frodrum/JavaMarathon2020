package day5.classes_for_tasks;

public class Motorcycle {
    private String yearOfIssue;
    private String color;
    private String model;

    public Motorcycle(String yearOfIssue, String color, String model) {
        this.yearOfIssue = yearOfIssue;
        this.color = color;
        this.model = model;
    }

    public String getYearOfIssue() {
        return yearOfIssue;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }
}