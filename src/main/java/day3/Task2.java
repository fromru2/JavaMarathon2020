package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Введите делимое и делитель");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            double newDouble1 = scanner.nextDouble();
            double newDouble2 = scanner.nextDouble();
            if (newDouble2 == 0)

                break;
            System.out.println(newDouble1 / newDouble2);


        }
    }
}
