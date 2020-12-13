package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> carList = new ArrayList<>();
        carList.add("Ford");
        carList.add("Skoda");
        carList.add("Lada");
        carList.add("Mitsubishi");
        carList.add("BMW");

        System.out.println(carList);

        carList.add(2, "Mercedes");
        carList.remove(0);
        System.out.println(carList);
    }
}
