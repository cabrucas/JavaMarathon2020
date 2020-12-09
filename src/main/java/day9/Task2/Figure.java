package day9.Task2;

public abstract class Figure {
    String color;

    public Figure(String color) {
        this.color = color;
    }

    public abstract double area();

    public abstract double perimeter();
}
