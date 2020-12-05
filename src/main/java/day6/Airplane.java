package day6;

import lombok.Data;

@Data
public class Airplane {
    private String producer;
    private int year;
    private double length;
    private double weight;
    private double fuel = 0;

    public Airplane(String producer, int year, double length, double weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
    }

    public void info() {
        System.out.printf("Изготовитель: %s, год выпуска: %d, длина: %.0f, вес: %.0f, количество топлива в баке: %.0f\n", producer, year, length, weight, fuel);
    }

    public void fillUp(double quantity) {
        this.fuel += quantity;
    }
}