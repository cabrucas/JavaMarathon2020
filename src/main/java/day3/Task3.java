package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        double dividend, divider = 0.1d;
        try (Scanner scanner = new Scanner(System.in)) {
            for (int globalCounter = 0; globalCounter < 5; globalCounter++) {
                dividend = scanner.nextDouble();
                divider = scanner.nextDouble();
                if (divider == 0) {
                    System.out.println("Деление на 0");
                    continue;
                }
                System.out.println(dividend / divider);
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
