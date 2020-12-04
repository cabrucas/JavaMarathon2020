package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorbike testMotorbike = new Motorbike(2020, "Kawasaki Ninja", "Black");
        System.out.println(String.format("%s, %s, %d",
                testMotorbike.getModel(),
                testMotorbike.getColor(),
                testMotorbike.getYearOfConstruction()));
    }
}
