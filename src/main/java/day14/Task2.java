package day14;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        String path = "people.txt";
        File file = new File(path);
        System.out.println(parseFileToStringList(file));
    }

    public static List<String> parseFileToStringList(File file) {
        List<String> list = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            while (reader.ready()) {
                String tmp = reader.readLine();
                if (checkAge(tmp)) {
                    list.add(tmp);
                } else {
                    list.clear();
                    return list;
                }
            }
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("Файл не найден");
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        return list;
    }

    public static boolean checkAge(String item) {
        boolean isNormal = true;
        String[] array = item.split(" ");
        int age;
        try {
            age = Integer.parseInt(array[1]);
            if (age < 0) {
                isNormal = false;
                throw new IOException();
            }
        } catch (NumberFormatException | IOException numberFormatException) {
            System.out.println("Некорректный входной файл");
        }
        return isNormal;
    }
}
