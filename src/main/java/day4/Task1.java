package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задайте размер массива ");
        int x = scanner.nextInt();
        int[] massive = new int[x];
        for (int i = 0; i < massive.length; i++) {
            massive[i] = rand.nextInt(10);
        }
        System.out.println(Arrays.toString(massive));
        System.out.println("Длинна массива: " + x);
        int k = 0;
        for (int i = 0; i < massive.length; i++) {
            if (massive[i] > 8) {
                k++;
            }
        }
        System.out.println("Количестве чисел больше 8 : " + k);
        int xx = 0;
        for (int i = 0; i < massive.length; i++) {
            if (massive[i] == 1) {
                xx++;
            }
        }
        System.out.println("Количестве чисел равных 1 : " + xx);
        int a = 0;
        for (int i = 0; i < massive.length; i++) {
            if (massive[i] % 2 == 0) {
                a++;
            }
        }
        System.out.println("Количестве четных чисел : " + a);
        int z = 0;
        for (int i = 0; i < massive.length; i++) {
            if (massive[i] % 2 != 0) {
                z++;
            }
        }
        System.out.println("Количестве нечетных чисел : " + z);
        int q = 0;
        for (int i = 0; i < massive.length; i++) {
            q = q + massive[i];
        }
        System.out.println("Сумме всех элементов массива : " + q);
    }
}
