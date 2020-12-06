package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane plane1 = new Airplane("Boeing", 2018, 27, 216.23);
        Airplane plane2 = new Airplane("Airbus", 2016, 27.0, 216.23);
        Airplane.compareAirplanes(plane1, plane2);
    }
}
