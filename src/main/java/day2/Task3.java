package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int counter = ++firstNumber;

        if (firstNumber >= secondNumber)

            System.out.println("Некорректный ввод");
        else {
            while(counter < secondNumber) {

                if (counter % 5 == 0 && counter % 10 != 0)
                    System.out.print(counter + " ");

                ++counter;
            }
        }
    }
}
