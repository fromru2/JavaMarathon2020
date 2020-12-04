package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Введите делимое и делитель");
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (i < 5) {
            double newDouble1 = scanner.nextDouble();
            double newDouble2 = scanner.nextDouble();
            i++;
            if (newDouble2 == 0) {
                System.out.println("Деление на ноль");
            }
            System.out.println(newDouble1 / newDouble2);
        }


    }
}

