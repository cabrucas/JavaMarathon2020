package day5;

public class Task1 {
    public static void main(String[] args) {
        Car testCar = new Car();
        testCar.setYearOfConstruction(2020);
        testCar.setModel("Mitsubishi Outlander");
        testCar.setColor("Metallic grey");

        System.out.println(String.format("%s, %s, %d",
                testCar.getModel(),
                testCar.getColor(),
                testCar.getYearOfConstruction()));
    }
}
