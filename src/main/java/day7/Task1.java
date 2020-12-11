package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane air1 = new Airplane("qwerty", 1500, 1337, 1500);
        Airplane air2 = new Airplane("zxc", 3000, 1555, 233);
        Airplane.sVSs(air1, air2);
    }

}