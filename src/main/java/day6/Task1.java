package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.info();
        car1.setAge(1992);
        System.out.println(car1.yearDifference(2020));
    }
}
