package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numberOfFloors = scanner.nextInt();

        if (numberOfFloors > 0 && numberOfFloors <= 4)
            System.out.println("Малоэтажный дом");
        else if (numberOfFloors > 4 && numberOfFloors <= 8)
            System.out.println("Среднеэтажный дом");
        else if (numberOfFloors > 8)
            System.out.println("Многоэтажный дом");
        else {
            System.out.println("Ошибка ввода");
        }


        // СВОЕВОЛЬНЫЕ РЕШЕНИЯ

//        /**
//         * До тех пор, пока не будет введён "exit",
//         * программа будет ожидать ввода данных для последующей обработки.
//         */
//        String incomingData;
//        int numberOfFloors;
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Введите количество этажей: ");
//        incomingData = scanner.nextLine();
//
//        while (true) {
//
//            if ("exit".equals(incomingData)) {
//
//                System.out.println("Спасибо за пользование программой.");
//                return;
//            }
//
//            if (incomingData.matches("-?\\d+")) {
//
//                try {
//
//                    numberOfFloors = Integer.parseInt(incomingData);
//
//                    if (numberOfFloors > 0 && numberOfFloors <= 4)
//                        System.out.println("Малоэтажное здание\n");
//                    else if (numberOfFloors > 4 && numberOfFloors <= 8)
//                        System.out.println("Среднеэтажный дом\n");
//                    else if (numberOfFloors > 8)
//                        System.out.println("Многоэтажный дом\n");
//                    else {
//                        System.out.println("Вы ввели некорректные данные.");
//                        System.out.println("Количество этажей должно быть больше 0. Попробуйте ещё раз.\n");
//                    }
//
//                } catch (Exception e) {
//
//                    System.out.println("Вы ввели слишком много цифр. Возникла ошибка: " + e.getClass().getSimpleName() + "\n");
//                }
//
//
//            } else {
//                System.out.println("Вы ввели некорректные данные.");
//                System.out.println("Убедитесь в отсутствии пробелов и букв и попробуйте снова.\n");
//            }
//
//            System.out.print("Введите количество этажей: ");
//            incomingData = scanner.nextLine();
//        }
    }
}
