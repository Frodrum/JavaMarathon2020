package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
        File newFile1;
        File newFile2;

        try {
            newFile1 = new File("newFile1.txt");
            newFile2 = new File("newFile2.txt");

            if (newFile1.createNewFile()) {
                try (PrintWriter writer = new PrintWriter(newFile1)) {
                    for (int i = 0; i < 1_000; i++) {
                        writer.write((int)Math.round(Math.random() * 101) + "\n");
                    }
                }
            }

            if (newFile2.createNewFile()) {
                try (Scanner reader = new Scanner(newFile1);
                     PrintWriter writer = new PrintWriter(newFile2)) {

                    List<Integer> listOfTmp = new ArrayList<>();
                    while(reader.hasNextInt()) {
                        listOfTmp.add(reader.nextInt());

                        if (listOfTmp.size() == 20) {
                            int sum = 0;
                            for (int i = 0; i < 20; i++) {
                                sum += listOfTmp.get(i);
                            }

//                            writer.write(String.format("%.2f\n", (double)sum / 20));
                            writer.write(Math.round(((double) sum / 20) * 100.0) / 100.0 + "\n");
                            listOfTmp.clear();
                        }
                    }
                }
            }

            printResult(newFile2);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void printResult(File file) {
        double result = 0.0;

        try(Scanner reader = new Scanner(file)) {
            while(reader.hasNextLine()) {
                List<Double> arr = Arrays.stream(reader.nextLine().split(" ")).map(Double::parseDouble).collect(Collectors.toList());
                for (Double d : arr)
                    result += d;
            }

            System.out.println((int)result);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}