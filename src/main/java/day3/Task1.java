package day3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner (System.in)) {
            while (true) {
                String inputString = scanner.nextLine();
                if (inputString.equals("Stop")) {
                    break;
                }
                switch (inputString) {
                    case "Рим" :
                        System.out.println("Италия");
                        break;
                    case "Милан" :
                        System.out.println("Италия");
                        break;
                    case "Турин" :
                        System.out.println("Италия");
                        break;
                    case "Москва" :
                        System.out.println("Россия");
                        break;
                    case "Владивосток" :
                        System.out.println("Россия");
                        break;
                    case "Ростов" :
                        System.out.println("Россия");
                        break;
                    case "Ливерпуль" :
                        System.out.println("Англия");
                        break;
                    case "Манчестер" :
                        System.out.println("Англия");
                        break;
                    case "Лондон" :
                        System.out.println("Англия");
                        break;
                    case "Берлин" :
                        System.out.println("Германия");
                        break;
                    case "Мюнхен" :
                        System.out.println("Германия");
                        break;
                    case "Кёльн" :
                        System.out.println("Германия");
                        break;
                    default :
                        System.out.println("Неизвестная страна");
                }
                inputString = null;
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
