package day2;

import java.util.Scanner;

public class Task3 {
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
            while (a < b) {
                ++a;
                if (a % 5 == 0 && a % 10 != 0) {
                    System.out.print(a + " ");
                }
            }
        }
    }
}
