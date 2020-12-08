package day6;

public class Car {
    private int age;
    private String color;
    private String model;

    public void info() {
        System.out.println("Это автомобиль");
    }

    public int yearDifference(int inputYear) {
        return Math.abs(inputYear - age); }

    public void setAge(int carAge) {
        if (carAge < 0) {
            System.out.println("Некорректный ввод ");
        } else {
            age = carAge; }
    }

    public int getAge() {
        return age;
    }

    public void setColor(String carColor) {
        if (carColor.isEmpty()) {
            System.out.println("Некорректный ввод ");
        } else {
            color = carColor; }
    }

    public String getColor() {
        return color;
    }

    public void setModel(String carModel) {
        if (carModel.isEmpty()) {
            System.out.println("Некорректный ввод ");
        } else {
            model = carModel; }
    }

    public String getModel() {
        return model;
    }
}
