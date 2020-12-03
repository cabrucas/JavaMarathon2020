package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        double dividend, divider = 0.1d;
        try (Scanner scanner = new Scanner(System.in)) {
            while (divider != 0) {
                dividend = scanner.nextDouble();
                divider = scanner.nextDouble();
                if (divider == 0) break;
                System.out.println((dividend / divider));
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
