package day6;

public class Airplane {
    private String producer;
    private int year;
    private double length;
    private double weight;
    private double fuel;

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public Airplane(String producer, int year, double length, double weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    public void info() {
        System.out.println(String.format("Изготовитель: %s, год выпуска: %d, длина: %f, вес: %f, количество топлива в баке: %f",
                producer,
                year,
                length,
                weight,
                getFuel()));
    }

    public double fillUp(double fillQuantity) {
        return fuel += fillQuantity;
    }
}
