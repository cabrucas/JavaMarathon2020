package day4;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int arraySize = 0;

        try (Scanner scanner = new Scanner(System.in)) {
            arraySize = scanner.nextInt();
        } catch (Exception exception) {
            exception.printStackTrace();
        }

        int[] array = new int[arraySize];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * (array.length << 2) / (i + 1));
        }


        System.out.println(Arrays.toString(array));
        System.out.println(String.format("Длина массива: %d", arraySize));
        System.out.println(String.format("Количество чисел больше %d: %d", 8, checkNumberOfDigitsMoreThenArgument(8, array)));
        System.out.println(String.format("Количество чисел равных %d: %d", 1, checkNumberOfDigitsEqualToArgument(1, array)));
        System.out.println(String.format("Количество четных чисел: %d", checkNumberOfEven(array)));
        System.out.println(String.format("Количество нечетных чисел: %d", array.length - checkNumberOfEven(array)));
        System.out.println(String.format("Сумма всех элементов массива: %d", getSumOfArrayElements(array)));
    }

    public static int checkNumberOfDigitsMoreThenArgument(int value, int[] array) {
        int counter = 0;
        for (int x : array) {
            if (x > value) {
                counter++;
            }
        }
        return counter;
    }

    public static int checkNumberOfDigitsEqualToArgument(int value, int[] array) {
        int counter = 0;
        for (int x : array) {
            if (x == value) {
                counter++;
            }
        }
        return counter;
    }

    public static int checkNumberOfEven(int[] array) {
        int counter = 0;
        for (int x : array) {
            if (x % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }

    public static int getSumOfArrayElements(int[] array) {
        int sum = 0;
        for (int x : array) {
            sum += x;
        }
        return sum;
    }

}
