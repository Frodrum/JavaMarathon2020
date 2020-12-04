package day4;

public class Task4_1 {
    public static void main(String[] args) {
        int[] array = new int[100_000];
        int amount = 0;
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int)Math.round(Math.random() * 10);
        }

        for (int i = 0; i + 49 < array.length; i++) {
            int preAmount = 0;

            for (int j = 0; j < 50; j++) {
                preAmount += array[i + j];
            }

            if (amount == 0 || preAmount >= amount) {
                amount = preAmount;
                index = i;
            }
        }

        System.out.println("Сумма тройки: " + amount);
        System.out.println("Индекс первого элемента тройки: " + index);
    }
}