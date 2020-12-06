package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        Player[] arrayOfPlayers = new Player[8];

        for (int i = 0; i < 8; i++) {
            arrayOfPlayers[i] = new Player(random.nextInt(11) + 90);
            Player.info();
        }
    }
}