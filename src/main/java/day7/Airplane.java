package day7;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Airplane {
    @NonNull
    private String producer;

    @NonNull
    private int year;

    @NonNull
    private double length;

    @NonNull
    private double weight;
    private double fuel = 0;

    public static void compareAirplanes(Airplane firstAirplane, Airplane secondAirplane) {
        if (firstAirplane.getLength() > secondAirplane.getLength())
            System.out.println("Первый самолёт длиннее");
        else if (firstAirplane.getLength() < secondAirplane.getLength())
            System.out.println("Второй самолёт длиннее");
        else
            System.out.println("Длины самолётов равны");
    }

    public void info() {
        System.out.printf("Изготовитель: %s, год выпуска: %d, длина: %.0f, вес: %.0f, количество топлива в баке: %.0f\n",
                producer, year, length, weight, fuel);
    }

    public void fillUp(double quantity) {
        this.fuel += quantity;
    }
}