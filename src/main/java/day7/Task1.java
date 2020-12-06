package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane firstAirplane = new Airplane("Producer #1", 2020, 20, 10_500.0);
        Airplane secondAirplane = new Airplane("Producer #2", 2020, 15, 9_500.0);

        Airplane.compareAirplanes(firstAirplane, secondAirplane);
    }
}