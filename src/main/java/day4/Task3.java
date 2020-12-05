package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] matrice = new int[12][8];
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                matrice[i][j] = random.nextInt(50);
            }
        }
        int maxSum = 0;
        int index = 0;
        for (int z = 0; z < matrice.length; z++) {
            int sum = 0;
            for (int j = 0; j < matrice[z].length; j++) {
                sum = sum + matrice[z][j];
            }
            if (sum >= maxSum) {
                maxSum = sum;
                index = z;
            }
        }
        System.out.println(index);
    }
}

