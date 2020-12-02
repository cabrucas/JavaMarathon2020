package day2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        double x = 0d;
        double y = 0d;

        try (Scanner scanner = new Scanner(System.in)) {
            x = scanner.nextDouble();
        } catch (Exception exception) {
            exception.printStackTrace();
        }

        if (x > -3 && x < 5) {
            y = (x + 3) * (x * x - 2);
        } else if (x >= 5) {
            y = (x * x - 10) / (x + 7);
        } else {
            y = 420;
        }

        System.out.println(y);
    }
}
