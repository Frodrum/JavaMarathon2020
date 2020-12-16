package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String separator = File.separator;
        String path = String.format("C:%s!Common%sJavaProjects%sJavaMarathon2020%sfile1.txt", separator, separator, separator, separator);
        File file = new File(path);
        printResult(file);
    }

    public static void printResult(File file) {
        try (Scanner reader = new Scanner(file)) {
            int sum = 0;
            int count = 0;

            while(reader.hasNextLine()) {
                sum += reader.nextInt();
                ++count;
            }

            double result = (double)sum / count;
            System.out.printf(result + " --> %.3f", result);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}