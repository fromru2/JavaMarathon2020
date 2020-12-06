package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] massive = new int[100];
        for (int i = 0; i < massive.length; i++)
            massive[i] = rand.nextInt(10000);

        int summa = 0;
        int index = 0;
        for (int z = 0; z < massive.length - 2; z++) {
            int s = 0;
            for (int j = 0; j < z+3; j++) {
                s = s + massive[j];
            }
            if (s > summa) {
                summa = s;
                index = z;

            }
        }
        System.out.println("Максимальная сумма тройки: " + summa);
        System.out.println("Индекс :" + index);
    }
}
