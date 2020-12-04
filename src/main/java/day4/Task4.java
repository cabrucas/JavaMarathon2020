package day4;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[100];
        int currentSum = 0;
        int sumMax = 0;
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 10000);
        }
        for (int i = 0; i < (array.length - 2); i++) {
            for (int j = i; j < i + 3; j++) {
                currentSum += array[j];
            }
            if (currentSum > sumMax) {
                sumMax = currentSum;
                index = i;
            }
            currentSum = 0;
        }
        System.out.println(sumMax);
        System.out.println(index);
    }
}
