package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car(2016, "Nissan Teana", "Black");
        car.info();
        System.out.println(car.yearDifference(2020));
        System.out.println("====================");
        Motorbike moto = new Motorbike(2008, "Kawasaki", "Red");
        moto.info();
        System.out.println(moto.yearDifference(2020));
    }
}
