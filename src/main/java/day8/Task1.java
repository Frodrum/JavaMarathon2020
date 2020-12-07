package day8;

public class Task1 {
    public static void main(String[] args) {

        long startSB = System.currentTimeMillis();
        StringBuilder result = new StringBuilder();
        result.append(0);

        for (int i = 1; i <= 20_000; i++) {
            result.append(" ").append(i);
        }

//        System.out.println(result);
        long finishSB = System.currentTimeMillis();
        System.out.println("Difference for \"StringBuilder\": " + (finishSB - startSB));

        long startNotSB = System.currentTimeMillis();
        String result1 = "0";

        for (int i = 0; i < 20_000; i++) {
            result1 += " " + i;
        }

//        System.out.println(result1);
        long finishNotSB = System.currentTimeMillis();
        System.out.println("Difference for \"String\": " + (finishNotSB - startNotSB));
    }
}
