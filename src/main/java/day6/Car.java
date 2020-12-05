package day6;

public class Car {
    private int yearOfConstruction;
    private String model;
    private String color;

    public int getYearOfConstruction() {
        return yearOfConstruction;
    }

    public void setYearOfConstruction(int yearOfConstruction) {
        this.yearOfConstruction = yearOfConstruction;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void info() {
        System.out.println("Это автомобиль");
    }
    public int yearDifference(int year) {
        return Math.abs(year - yearOfConstruction);
    }

    public Car(int yearOfConstruction, String model, String color) {
        this.yearOfConstruction = yearOfConstruction;
        this.model = model;
        this.color = color;
    }
}
