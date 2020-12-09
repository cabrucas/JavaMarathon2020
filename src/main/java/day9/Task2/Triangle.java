package day9.Task2;

public class Triangle extends Figure {
    double side1, side2, side3;

    public Triangle(double side1, double side2, double side3, String color) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double area() {
        return Math.sqrt((this.perimeter() / 2) * (this.perimeter() / 2 - side1) * (this.perimeter() / 2 - side2) * (this.perimeter() / 2 - side3));
    }

    @Override
    public double perimeter() {
        return side1 + side2 + side3;
    }
}
