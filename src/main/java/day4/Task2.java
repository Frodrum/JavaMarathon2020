package day4;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[100];
        int max = 0;
        int min = 0;
        int quantity = 0;
        int amount = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int)Math.round(Math.random() * 10_000);
        }

        for (int tmp : array) {
            if (max < tmp)
                max = tmp;

            if (min == 0 || min > tmp)
                min = tmp;

            if (tmp % 10 == 0) {
                ++quantity;
                amount += tmp;
            }
        }

        System.out.println("Наибольший элемент массива: " + max);
        System.out.println("Наименьший элемент массива: " + min);
        System.out.println("Количество элементов массива, оканчивающихся на 0: " + quantity);
        System.out.println("Сумма элементов массива, окачивающихся на 0: " + amount);
    }
}