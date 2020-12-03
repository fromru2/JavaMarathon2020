package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите количество этажей в здании");
        int i = s.nextInt();
        if (i > 0 && i <= 4) {
            System.out.println("Малоэтажный дом");
        }
        if (i >= 5 && i < 9) {
            System.out.println("Среднеэтажный дом");
        }
        if (i >= 9) {
            System.out.println("Многоэтажный  дом");
        }
        if (i <= 0) {
            System.out.println("Ошибка ввода");
        }
    }
}


