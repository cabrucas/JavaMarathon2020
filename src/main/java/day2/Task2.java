package day2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;

        try (Scanner scanner = new Scanner(System.in)) {
            a = scanner.nextInt();
            b = scanner.nextInt();
        } catch (Exception exception) {
            exception.printStackTrace();
        }

        if (a >= b) {
            System.out.println("Некорректный ввод");
        } else {
            for (int i = a + 1; i < b; i++) {
                if (i % 5 == 0 && i % 10 != 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
