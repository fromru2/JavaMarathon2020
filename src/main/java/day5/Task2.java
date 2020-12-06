package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorbike bike = new Motorbike(2000,"Green","NOKIA");
        System.out.print(bike.getModel()+bike.getColor()+bike.getAge());
    }
}
class Motorbike {


    private int age;
    private String color;
    private String model;

    public Motorbike(int age,String color,String model){
    this.age=2000;
    this.color="Green";
    this.model="NOKIA";}

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;}
    }