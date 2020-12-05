package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane batWing = new Airplane("Batman", 2020, 17.32, 29_700);
        batWing.info();

        batWing.setYear(2025);
        batWing.setLength(16.5);
        batWing.fillUp(1_500);
        batWing.fillUp(1_200);
        batWing.info();
    }
}