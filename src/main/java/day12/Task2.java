package day12;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        while (list.size() < 10) {
            int tmp = random.nextInt(30);
            if (tmp % 2 == 0) {
                list.add(tmp);
            } else {
                tmp = random.nextInt(50) + 300;
                if (tmp % 2 == 0) {
                    list.add(tmp);
                }
            }
        }
        System.out.println(list);
    }
}
