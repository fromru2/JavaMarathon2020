package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два числа через пробел");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int i = a + 1;
        if (a >= b) {
            System.out.print("Некорректный ввод");
        } else
            while (i < b) {
                if (i % 5 == 0 && i % 10 != 0) {
                    System.out.println(i);
                }
                i++;
            }


    }
}