package day4;

public class Task3 {
    public static void main(String[] args) {
        int[][] array = new int[12][8];
        int lineNumber = 0;
        int preAmount = 0;
        int amount = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int tmp = (int) Math.round(Math.random() * 50);
                preAmount += tmp;
                array[i][j] = tmp;
            }

//            System.out.println(preAmount);

            if (preAmount >= amount) {
                lineNumber = i;
                amount = preAmount;
            }

            preAmount = 0;
        }

//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.print(array[i][j] + " ");
//            }
//
//            System.out.println();
//        }

        System.out.println("Ответ: " + lineNumber);
//        System.out.println("Сумма: " + amount);
    }
}