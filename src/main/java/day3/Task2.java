package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double dividend = scanner.nextDouble();
        double divider = scanner.nextDouble();

        while(0 != divider) {
            System.out.println(dividend / divider);

            dividend = scanner.nextInt();
            divider = scanner.nextInt();
        }
    }
}