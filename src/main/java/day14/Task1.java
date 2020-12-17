package day14;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Task1 {
    static final int NUMBER_OF_DIGITS_IN_FILE = 10;

    public static void main(String[] args) {
        String path = "in.txt";
        File file = new File(path);
        printSumDigits(file);
    }

    public static void printSumDigits(File file) {
        List<String> fileContent = new ArrayList<>();
        List<Integer> numList = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            while (reader.ready()) {
                fileContent.add(reader.readLine());
            }
            for (String tmp : fileContent) {
                String[] array = tmp.split(" ");
                for (int i = 0; i < array.length; i++) {
                    numList.add(Integer.parseInt(array[i]));
                }
            }
            if (numList.size() != NUMBER_OF_DIGITS_IN_FILE) {
                throw new IOException();
            } else {
                int sum = 0;
                for (int x : numList) {
                    sum += x;
                }
                System.out.println(sum);
            }
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("Файл не найден");
        } catch (NumberFormatException numberFormatException) {
            System.out.println("Не все в файле является целым числом");
        } catch (IOException ioException) {
            System.out.println("Некорректный входной файл");
        }
    }
}
