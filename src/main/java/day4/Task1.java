package day4;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int moreThanEight = 0;
        int equalToOne = 0;
        int evenNumbers = 0;
        int amount = 0;

        System.out.print("Укажите размер массива: ");
        int length = scanner.nextInt();
        System.out.printf("Введено число %d. Сгенерирован следующий массив:\n", length);

        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            int tmp = (int)Math.round(Math.random() * 10);

            if (tmp == 1)
                ++equalToOne;

            if (tmp > 8)
                ++moreThanEight;

            if (tmp % 2 == 0)
                ++evenNumbers;

            amount += tmp;

            array[i] = tmp;
        }

        System.out.println(Arrays.toString(array));
        System.out.println("Длина массива: " + array.length);
        System.out.println("Количество чисел больше 8: " + moreThanEight);
        System.out.println("Количество чисел равных 1: " + equalToOne);
        System.out.println("Количество четных чисел: " + evenNumbers);
        System.out.println("Количество нечетных чисел: " + (length - evenNumbers));
        System.out.println("Сумма всех элементов массива: " + amount);

        scanner.close();
    }
}