package day4;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 10000);
        }
        System.out.println("Сгенерирован массив:");
        System.out.println(Arrays.toString(array));
        System.out.println("==========================================");
        System.out.println(String.format("Максимальный элемент массива: %d", getArrayMaximum(array)));
        System.out.println(String.format("Минимальный элемент массива: %d", getArrayMinimum(array)));
        System.out.println(String.format("Количество элементов, оканчивающихся на 0: %d", getZeroEndedArrayElements(array)));
        System.out.println(String.format("Сумма элементов, оканчивающихся 0: %d", getSumOfZeroEndedElements(array)));
    }

    public static int getArrayMaximum(int[] array) {
        int maximum = array[0];
        for (int x : array) {
            if (x > maximum) {
                maximum = x;
            }
        }
        return maximum;
    }

    public static int getArrayMinimum(int[] array) {
        int minimum = array[0];
        for (int x : array) {
            if (x < minimum) {
                minimum = x;
            }
        }
        return minimum;
    }

    public static int getZeroEndedArrayElements(int[] array) {
        int counter = 0;
        for (int x : array) {
            if (x % 10 == 0) {
                counter++;
            }
        }
        return counter;
    }

    public static int getSumOfZeroEndedElements(int[] array) {
        int sum = 0;
        for (int x : array) {
            if (x % 10 == 0) {
                sum += x;
            }
        }
        return sum;
    }
}
