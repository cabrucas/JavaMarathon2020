package day9.Task2;

public class TestFigures {
    public static void main(String[] args) {
        Figure[] figures = {
                new Triangle(10, 10, 10, "Red"), // 30
                new Triangle(10, 20, 30, "Green"),
                new Triangle(10, 20, 15, "Red"),  // 45
                new Rectangle(5, 10, "Red"), // 30
                new Rectangle(40, 15, "Orange"),
                new Circle(4, "Red"), // 25,12
                new Circle(10, "Red"), // 62,8
                new Circle(5, "Blue")
        };

        System.out.println(calculateRedArea(figures));
        System.out.println(calculateRedPerimeter(figures));
    }

    public static double calculateRedPerimeter(Figure[] figures) {
        double perimeter = 0;
        for (Figure fig : figures) {
            if (fig.color.equals("Red")) {
                perimeter += fig.perimeter();
            }
        }
        return perimeter;
    }

    public static double calculateRedArea(Figure[] figures) {
        double area = 0;
        for (Figure fig : figures) {
            if (fig.color.equals("Red")) {
                area += fig.area();
            }
        }
        return area;
    }
}
