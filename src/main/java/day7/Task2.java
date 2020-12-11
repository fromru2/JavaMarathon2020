package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random rand = new Random();
        Player p1 = new Player(rand.nextInt(10) + 90);
        Player p2 = new Player(rand.nextInt(10) + 90);
        Player p3 = new Player(rand.nextInt(10) + 90);
        Player.info();
        Player p4 = new Player(rand.nextInt(10) + 90);
        Player p5 = new Player(rand.nextInt(10) + 90);
        Player p6 = new Player(rand.nextInt(10) + 90);
        Player.info();
        Player p7 = new Player(rand.nextInt(10) + 90);
        Player.info();
        for(int i=0;i<100;i++)
            p3.run();
        Player.info();
    }
}
