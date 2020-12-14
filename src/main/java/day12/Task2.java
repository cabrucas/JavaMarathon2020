package day12;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        while (list.size() < 10) {
            int tmp = random.nextInt(350);
            if (tmp % 2 == 0 && (tmp <= 30 || tmp >= 300)) {
                list.add(tmp);
            }
        }
        System.out.println(list);
    }
}
