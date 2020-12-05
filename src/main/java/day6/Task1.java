package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car(2020, "Batmobile", "Black");
        int randomYear = (int)Math.round(1980 + Math.random() * 40);

        car.info();
        System.out.printf("Год выпуска автомобиля %d, год для сравнения %d. Разница: %d", car.getYearOfIssue(), randomYear, car.yearDifference(randomYear));
    }
}