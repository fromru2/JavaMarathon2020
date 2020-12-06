package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setAge(1992);
        car1.setColor("Black");
        car1.setModel("Ford");
        System.out.println("Год выпуска автомобиля: " + car1.getAge());
        System.out.println("Цвет автомобиля: " + car1.getColor());
        System.out.println("Модель автомобиля: " + car1.getModel());
    }
}
class Car {
    private int age;
    private String color;
    private String model;
    public void setAge(int carAge) {
        if (carAge < 0) {
            System.out.println("Некорректный ввод ");
        } else {
            age = carAge;
        }
    }
    public int getAge() {
        return age;
    }
    public void setColor(String carColor) {
        if (carColor.isEmpty()) {
            System.out.println("Некорректный ввод ");
        } else {
            color = carColor;
        }
    }
    public String getColor() {
        return color;
    }
    public void setModel(String carModel) {
        if (carModel.isEmpty()) {
            System.out.println("Некорректный ввод ");
        } else {
            model = carModel;
        }
    }
    public String getModel() {
        return model;
    }
}


