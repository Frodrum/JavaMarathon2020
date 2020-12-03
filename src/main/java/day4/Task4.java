package day4;

public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[100];
        int amount = 0;
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int)Math.round(Math.random() * 10_000);
        }

        for (int i = 0; i + 2 < array.length; i++) {
            int preAmount = array[i] + array[i + 1] + array[i + 2];

            if (amount == 0 || preAmount >= amount) {
                amount = preAmount;
                index = i;
            }
        }

        System.out.println("Сумма тройки: " + amount);
        System.out.println("Индекс первого элемента тройки: " + index);
    }
}