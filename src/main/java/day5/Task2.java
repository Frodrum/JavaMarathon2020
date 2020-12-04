package day5;


import day5.classes_for_tasks.Motorcycle;

public class Task2 {
    public static void main(String[] args) {
        Motorcycle motorcycle = new Motorcycle("2020", "Black", "Batcicle");
        System.out.println(motorcycle.getYearOfIssue());
        System.out.println(motorcycle.getColor());
        System.out.println(motorcycle.getModel());
    }
}