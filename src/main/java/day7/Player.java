package day7;

import lombok.Data;

@Data
public class Player {
    private static int countPlayers = 0;
    private static final int MAX_STAMINA = 100;
    private static final int MIN_STAMINA = 0;
    private int stamina;

    public Player(int stamina) {
        if (countPlayers != 6)
            ++countPlayers;
        this.stamina = stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public static void info() {
        if (countPlayers < 6)
            System.out.printf("Команды неполные. На поле ещё есть %d %s.\n", 6 - countPlayers, pickPhrase(countPlayers, "сободное место", "свободных мест", "свободных места"));
        else
            System.out.println("На поле нет свободных мест");
    }

    private static String pickPhrase(int count, String option0, String option1, String option2) {
        int tmp = count % 100;
        if (tmp < 11 || tmp > 14) {
            tmp = count % 10;
            if (tmp == 1) return option1;
            if (tmp >= 2 && tmp <= 4) return option2;
        }
        return option0;
    }

    public void run() {
        if (stamina != 0) {
            stamina -= 1;

            if (stamina == 0) {
                --countPlayers;
                System.out.println("Игрок ушёл с поля");
            }
        }
    }
}

