package day4;

import java.util.Arrays;
import java.util.Random;


public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] mas = new int[100];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = random.nextInt(10000);
        }
        System.out.println(Arrays.toString(mas));
        int a = 0;
        for (int num : mas) {
            if (num > a) {
                a = num;
            }
        }
        System.out.println("Наибольший элемент массива: " + a);
        int min = 10000;
        for (int num : mas) {
            if (num < min) {
                min = num;
            }

        }
        System.out.println("Наименьший элемент массива: " + min);
        int s = 0;
        for (int num : mas) {
            if (num % 10 == 0) {
                s = s + 1;
            }
        }
        System.out.println("Количество элементов массива, оканчивающихся на 0: " + s);
        int q = 0;
        for (int num : mas) {
            if (num % 10 == 0) {
                q = q + num;
            }
        }
        System.out.println("Сумма элементов массива, оканчивающихся на 0: " + q);
    }
}


