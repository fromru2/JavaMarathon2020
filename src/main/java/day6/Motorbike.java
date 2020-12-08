package day6;

public class Motorbike {
    private int age;
    private String color;
    private String model;

    public Motorbike(int age, String color, String model) {
        this.age = 2000;
        this.color = "Green";
        this.model = "NOKIA"; }

    public int getAge() {
        return age;
    }
    public String getColor() {
        return color;
    }
    public String getModel() {
        return model; }

    public void info() {
        System.out.println("Это мотоцикл”");
    }

    public int yearDifference(int inputYear) {

        return Math.abs(inputYear - age); }
}
