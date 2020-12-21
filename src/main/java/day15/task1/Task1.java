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
                String[] array = tmp.split(";");
                if ("0".equals(array[array.length - 1])) {
                    listOfString.add(tmp);
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