package day7;

public class Player {

    private int stamina;
    private static final int MAX_STAMINA = 100;
    private static final int MIN_STAMINA = 0;
    private static int countPlayers;

    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayers < 6)
            countPlayers++;
    }

    public void run() {
        if (stamina == 0)
            return;
        stamina--;
        if (stamina == 0)
            countPlayers--;
    }

    public static void info() {
        int x = 6 - countPlayers;
        if (countPlayers < 6) {
            System.out.println("Команды неполные. На поле еще есть " + x + "свободных мест");
        } else {
            System.out.println("На поле нет свободных мест");
        }
    }

    public static int getMaxStamina() {
        return MAX_STAMINA;
    }

    public static int getMinStamina() {
        return MIN_STAMINA;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }
}
