package day2;

import java.io.IOException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int floorCount = 0;
        try (Scanner scanner = new Scanner(System.in)) {
            floorCount = scanner.nextInt();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        if (floorCount < 1) {
            System.out.println("Ошибка ввода");
        } else if (floorCount >= 1 && floorCount <= 4) {
            System.out.println("Малоэтажный дом");
        } else if (floorCount >= 5 && floorCount <= 8) {
            System.out.println("Среднеэтажный дом");
        } else if (floorCount >= 9) {
            System.out.println("Многоэтажный дом");
        }
    }
}
