package day7;

public class Player {
    private int stamina;
    final static int MAX_STAMINA = 100;
    final static int MIN_STAMINA = 0;
    static int countPlayers = 0;
    final static int MAX_PLAYERS = 6;

    public Player(int stamina) {
        this.stamina = stamina;
        countPlayers++;
    }

    public int getStamina() {
        return stamina;
    }

    public void run() {
        if (stamina > 0) {
            stamina --;
        }
        if (stamina == 0) {
            countPlayers--;
        }
    }

    public static void info() {
        if (countPlayers < 6) {
            switch (countPlayers) {
                case 6 :
                    System.out.println("На поле нет свободных мест");
                    break;
                case 5 :
                    System.out.printf("Команды неполные. На поле еще есть %d свободное место\n", MAX_PLAYERS - countPlayers);
                    break;
                case 4 :
                case 3 :
                case 2 :
                    System.out.printf("Команды неполные. На поле еще есть %d свободных места\n", MAX_PLAYERS - countPlayers);
                    break;
                case 1 :
                case 0 :
                    System.out.printf("Команды неполные. На поле еще есть %d свободных мест\n", MAX_PLAYERS - countPlayers);
                    break;
            }
        }
    }
}
