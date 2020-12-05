package day6;

public class Motorbike {
    private int yearOfConstruction;
    private String model;
    private String color;

    public Motorbike(int yearOfConstruction, String model, String color) {
        this.yearOfConstruction = yearOfConstruction;
        this.model = model;
        this.color = color;
    }

    public int getYearOfConstruction() {
        return yearOfConstruction;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public void info() {
        System.out.println("Это мотоцикл");
    }

    public int yearDifference(int year) {
        return Math.abs(year - yearOfConstruction);
    }
}
