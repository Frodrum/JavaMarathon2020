package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        String separator = File.separator;
        String path = String.format("C:%s!Common%sJavaProjects%sJavaMarathon2020%sfile1.txt", separator, separator, separator, separator);
        File file = new File(path);
        printSumDigits(file);
    }

    public static void printSumDigits(File file) {
        try (Scanner scanner = new Scanner(file)){
            List<String> listOfString = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

            if (listOfString.size() != 10)
                throw new RuntimeException();

            System.out.println(listOfString.stream().mapToInt(Integer::parseInt).sum());
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (RuntimeException e) {
            System.out.println("Некорректный входной файл");
        }
    }
}