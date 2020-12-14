package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        String separator = File.separator;
        String path = String.format("C:%s!Common%sJavaProjects%sJavaMarathon2020%speople.txt", separator, separator, separator, separator);
        File file = new File(path);

        System.out.println(parseFileToStringList(file));
    }

    public static List<String> parseFileToStringList(File file) {
        List<String> listOfPeople = new ArrayList<>();

        try (Scanner scanner = new Scanner(file)) {
            while(scanner.hasNextLine()) {
                String tmp = scanner.nextLine();

                if (Integer.parseInt(tmp.split(" ")[1]) < 0)
                    throw new RuntimeException();
                else
                    listOfPeople.add(tmp);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (RuntimeException e) {
            System.out.println("Некорректный входной файл");
            return new ArrayList<>();
        }

        return listOfPeople;
    }
}