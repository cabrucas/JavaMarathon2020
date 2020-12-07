package day8;

public class Task1 {
    public static void main(String[] args) {
        String testStringObject = new String();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            testStringObject = testStringObject + i + " ";
        }
        long finishTime = System.currentTimeMillis();
        System.out.println(testStringObject);
        System.out.println(String.format("Затраченное время String: %d", finishTime - startTime));

        StringBuilder sb = new StringBuilder();
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            sb.append(i);
            sb.append(" ");
        }
        finishTime = System.currentTimeMillis();
        System.out.println(sb.toString());
        System.out.println(String.format("Затраченное время StringBuilder: %d", finishTime - startTime));
    }
}
