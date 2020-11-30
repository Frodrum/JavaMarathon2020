package day1;

public class Task6 {
    public static void main(String[] args) {

        int k = (int)Math.round(1 + Math.random() * 8);

        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d x %d = %d\n", i, k, i * k);
        }
    }
}
