package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        Player.info();
        Player player1 = new Player(random.nextInt(10) + 90);
        System.out.printf("Выносливость 1 игрока %d\n", player1.getStamina());
        Player player2 = new Player(1);
        System.out.printf("Выносливость 2 игрока %d\n", player2.getStamina());
        Player player3 = new Player(random.nextInt(10) + 90);
        System.out.printf("Выносливость 3 игрока %d\n", player3.getStamina());
        Player.info();
        player2.run();
        System.out.printf("Выносливость 2 игрока %d\n", player2.getStamina());
        Player.info();
    }
}
