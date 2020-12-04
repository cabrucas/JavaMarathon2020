package day5;

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
}
