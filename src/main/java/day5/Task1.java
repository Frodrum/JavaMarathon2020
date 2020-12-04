package day5;

import day5.classes_for_tasks.Car;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setYearOfIssue("2020");
        car.setModel("Batmobile");
        car.setColor("Black");

        System.out.println(car.getYearOfIssue());
        System.out.println(car.getModel());
        System.out.println(car.getColor());
    }
}