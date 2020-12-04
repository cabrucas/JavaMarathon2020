package day4;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[][] matrix = new int[12][8];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int)(Math.random() * 50);
            }
        }
        System.out.println(getRowIndexWithMaxSum(matrix));
    }

    public static int getRowIndexWithMaxSum(int[][] matrix) {
        int index = 0;
        int sumMax = 0;
        int sumCurrent = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                sumCurrent += matrix[i][j];
            }
            if (sumCurrent > sumMax) {
                sumMax = sumCurrent;
                index = i;
            }
            sumCurrent = 0;
        }
        return index;
    }
}
