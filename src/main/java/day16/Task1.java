package day16;

import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;

public class Task1 {
    public static void main(String[] args) {
        File inputFile = new File("in.txt");
        printResult(inputFile);
    }

    public static void printResult(File file) {
        double result = 0d;
        int sum = 0;
        int count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            while (reader.ready()) {
                String[] array = reader.readLine().split(" ");
                for (String item : array) {
                    sum += Integer.parseInt(item);
                    count++;
                }
            }
            result = (double) sum / (double) count;
            System.out.print(result + " --> " + round(result, 3));
        } catch (FileNotFoundException | NumberFormatException | ArithmeticException exception) {
           exception.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    private static double round(double value, int places) {
        BigDecimal bd = new BigDecimal(Double.toString(value));;
        try {
            if (places < 0) {
                throw new IllegalArgumentException();
            } else {
                bd = bd.setScale(places, RoundingMode.HALF_UP);
            }
        } catch (IllegalArgumentException exception) {
            exception.printStackTrace();
        }
        return bd.doubleValue();
    }
}

