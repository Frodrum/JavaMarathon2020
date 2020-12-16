package day15.task1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String separator = File.separator;
        String pathShoes = String.format("C:%s!Common%sJavaProjects%sJavaMarathon2020%ssrc%smain%sresources%sshoes.csv",
                separator, separator, separator, separator, separator, separator, separator);
        File shoes = new File(pathShoes);

        File missingShoes = new File(pathShoes.replace("shoes.csv", "missing_shoes.txt"));

        try(Scanner reader = new Scanner(shoes);
            PrintWriter writer = new PrintWriter(missingShoes)) {
            List<String> listOfString = new ArrayList<>();

            while (reader.hasNextLine()) {
                String tmp = reader.nextLine();
                if (tmp.endsWith(";0")) {
                    listOfString.add(tmp);
                }

                if (listOfString.size() > 5) {
                    for (String st : listOfString) {
                        writer.write(st + "\n");
                    }

                    listOfString.clear();
                }
            }

            if (listOfString.size() > 0) {
                for (int i = 0; i < listOfString.size(); i++) {
                    if (i == listOfString.size() - 1) {
                        writer.write(listOfString.get(i));
                        return;
                    }

                    writer.write(listOfString.get(i) + "\n");
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}


/**
 * 1. Вам дан файл с информацией об остатках обуви на складе (src/main/resources/shoes.csv). Это пример реальной
 * ыгрузки остатков из 1С в csv файл (формат файла с разделителями, в качестве разделителя использован символ “;”).
 * В этом файле содержится информация о названии модели обуви, ее размер и оставшееся на складе количество.
 *
 * До преобразования в csv это была таблица с тремя колонками:
 *
 * Название                            Размер       Кол-во
 * Ботинки HS РАН-Р 400 чер. ЗП            45        4
 * Ботинки PANDA САНИТАРИ 3916 S1 SRC бел.    37        1
 * ...
 *
 * Необходимо сформировать новый файл (src/main/resources/missing_shoes.txt) с информацией о моделях и размерах обуви,
 * которой нет на складе (количество = 0). Для этого реализуйте программу, которая принимает на вход csv файл и создает
 * новый txt файл следующего содержания (должно получиться 11 строк):
 *
 * Ботинки СВАРЩИК ут М.1398 ЗП, 40, 0
 * Ботинки СВАРЩИК ут М.1398 ЗП, 45, 0
 * Ботинки ТОФФ БЕРКУТ И с выс.берцами ут ч, 38, 0
 * ...
 */