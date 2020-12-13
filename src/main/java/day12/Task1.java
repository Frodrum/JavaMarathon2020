package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> listOfCarModel = new ArrayList<>();
        listOfCarModel.add("ВАЗ");
        listOfCarModel.add("ГАЗ");
        listOfCarModel.add("ТАЗ");
        listOfCarModel.add("БелАЗ");
        listOfCarModel.add("Волга");

        listOfCarModel.forEach(System.out::println);
        System.out.println();

        listOfCarModel.add(2, "Жигули");
        listOfCarModel.remove(0);

        listOfCarModel.forEach(System.out::println);
    }
}