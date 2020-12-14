package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        String separator = File.separator;
        String path = String.format("C:%s!Common%sJavaProjects%sJavaMarathon2020%speople.txt", separator, separator, separator, separator);
        File file = new File(path);

        System.out.println(parseFileToObjList(file));
    }

    public static List<Person> parseFileToObjList(File file) {
        List<Person> listOfPerson = new ArrayList<>();

        try(Scanner scanner = new Scanner(file)) {
            while(scanner.hasNextLine()) {
                String[] array = scanner.nextLine().split(" ");

                if (Integer.parseInt(array[1]) < 0)
                    throw new RuntimeException();
                else
                    listOfPerson.add(new Person(array[0], Integer.parseInt(array[1])));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (RuntimeException e) {
            System.out.println("Некорректный входной файл");
        }

        return listOfPerson;
    }
}