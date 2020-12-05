package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Boeing G650 Gulfstream", 2016, 17.2, 128.6);
        System.out.println("Сгенерирован объект:");
        airplane.info();
        airplane.fillUp(250.17);
        airplane.setLength(21.6);
        airplane.setYear(2020);
        airplane.fillUp(500);
        System.out.println("Объект после изменений:");
        airplane.info();
    }
}
