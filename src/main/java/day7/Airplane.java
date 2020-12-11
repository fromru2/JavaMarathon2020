package day7;

public class Airplane {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel = 0;

    public int getFuel() {
        return fuel;
    }
    public void setProducer(String producer) {
        this.producer = producer;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public int getLength() { return length; }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public void setFuel(int fuel) {
        this.fuel = fuel;
    }
    public void fillUp(int n) {
        fuel = n + fuel;
    }

    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    public void info() {
        System.out.println("Изготовитель: " + producer + " год выпуска: " + year + " длина: " + length + " вес: " + weight + " количество топлива в баке: " + fuel);
    }

    public static void sVSs(Airplane air1, Airplane air2) {
        if (air1.getLength() > air2.getLength()) {
            System.out.println("Длинна самолета " + air1.producer + " больше длинны самолета " + air2.producer);
        } else if (air1.getLength() < air2.getLength()) {
            System.out.println("Длинна самолета " + air1.producer + "меньше длинны самолета " + air2.producer);
        }
    }
}
