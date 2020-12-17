package day16;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.StringJoiner;

public class Task2 {
    public static void main(String[] args) {
        File fileNumbers = new File("file1.txt");
        File result = new File("file2.txt");
        final int RANDOM_MAX_VALUE = 1_000;

        generateFileWithNumbers(fileNumbers, RANDOM_MAX_VALUE);
        genereateMedians(fileNumbers, result);
        printResult(result);
    }

    public static void generateFileWithNumbers(File file, int bound) {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            Random random = new Random();
            StringJoiner stringJoiner = new StringJoiner(" ");
            for (int i = 0; i < 1_000; i++) {
                stringJoiner.add(String.valueOf(random.nextInt(bound)));
            }
            writer.write(stringJoiner.toString());
            writer.flush();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public static void genereateMedians(File fileIn, File fileOut) {
        List<Integer> list = new ArrayList<>();
        StringJoiner stringJoiner = new StringJoiner(" ");
        int COUNT_ITEMS_FOR_MEDIANS = 20;
        int sum = 0;
        double result = 0d;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileIn));
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileOut))) {
            while (reader.ready()) {
                String[] tmp = reader.readLine().split(" ");
                for (String item : tmp) {
                    list.add(Integer.parseInt(item));
                }
            }
            while (list.size() > 0) {
                for (int i = 0; i < COUNT_ITEMS_FOR_MEDIANS; i++) {
                    sum += list.get(0);
                    list.remove(0);
                }
                result = (double) sum / (double)COUNT_ITEMS_FOR_MEDIANS;
                stringJoiner.add(String.valueOf(result));
                sum = 0;
            }
            writer.write(stringJoiner.toString());
            writer.flush();
        } catch (FileNotFoundException | NumberFormatException exception) {
            exception.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public static void printResult(File file) {
        double sum = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            while (reader.ready()) {
                String[] tmp = reader.readLine().split(" ");
                for (String item : tmp) {
                    sum += Double.parseDouble(item);
                }
            }
            System.out.println((int) sum);
        } catch (FileNotFoundException | NumberFormatException exception) {
            exception.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
