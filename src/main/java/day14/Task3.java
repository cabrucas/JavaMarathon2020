package day14;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        File file = new File("people.txt");
        System.out.println(parseFileToObjList(file));
    }

    public static List<Person> parseFileToObjList(File file) {
        List<Person> list = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            while (reader.ready()) {
                String[] tmpLineFromFile = reader.readLine().split(" ");
                String tmpPersonName = tmpLineFromFile[0];
                int tmpPersonAge = Integer.parseInt(tmpLineFromFile[1]);
                if (tmpPersonAge >= 0) {
                    list.add(new Person(tmpPersonName, tmpPersonAge));
                } else {
                    list.clear();
                    throw new IOException();
                }
            }
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("Файл не найден");
        } catch (NumberFormatException | IOException exception) {
            list.clear();
            System.out.println("Некорректный входной файл");
        }

        return list;
    }
}
