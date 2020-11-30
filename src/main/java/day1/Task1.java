package day1;

import java.util.StringJoiner;

public class Task1 {
    public static void main(String[] args) {

        int counter = 0;

        // Решение, чтобы прошёл тест
        while (counter != 10) {

            System.out.print("JAVA ");
            counter++;
        }

        // СПИСОК СВОЕВОЛЬНЫХ РЕШЕНИЙ

        // Решения, чтобы итоговый вывод не заканчивался на пустой пробел
        // Через "if"
//        while (counter != 10) {
//
//            if (counter == 9) {
//
//                // Без пробела на конце
//                System.out.print("JAVA");
//                return;
//            }
//
//            System.out.print("JAVA ");
//            counter++;
//        }

        // Через "StringJoiner"
//        StringJoiner joiner = new StringJoiner(" ");
//        while(counter != 10) {
//
//            joiner.add("JAVA");
//            counter++;
//        }
//
//        System.out.println(joiner);
    }
}
