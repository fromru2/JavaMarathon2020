package day2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число Х");
        double x = scanner.nextDouble();

        double y1 = ((x * x) - 10) / (x + 7);
        double y2 = (x + 3) * ((x * x) - 2);
        double y3 = 420;


        if (x >= 5) {
            System.out.println("Y" + " = " + y1);
        } else if (-3 < x && x < 5) {
            System.out.println("Y" + " = " + y2);
        } else {
            System.out.println("Y" + " = " + y3);
        }

    }
}
