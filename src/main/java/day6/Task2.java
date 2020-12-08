package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane stels = new Airplane("stels2", 272, 122, 1241);
        stels.setYear(15);
        stels.setLength(150);
        stels.fillUp(300);
        stels.fillUp(700);
        stels.info();
    }
}
