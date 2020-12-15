package day15.task1;

import java.io.*;
import java.util.StringJoiner;

public class Task1 {
    public static void main(String[] args) {
        final String path = "src/main/resources/shoes.csv";
        File file = new File(path);
        File fileOut = new File("src/main/resources/missing_shoes.txt");
        getZeroQuantity(file, fileOut);
    }
    public static void getZeroQuantity(File file, File fileOut) {
        StringJoiner stringJoiner = new StringJoiner("\n");
        try (BufferedReader reader = new BufferedReader(new FileReader(file));
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileOut))) {
            while (reader.ready()) {
                String tmpString = reader.readLine();
                if (tmpString.endsWith(";0")) {
                    stringJoiner.add(tmpString.replaceAll(";", ", "));
                }
            }
            writer.write(stringJoiner.toString());
            writer.flush();
        } catch (IOException exception) {
          exception.printStackTrace();
        }
    }
}
