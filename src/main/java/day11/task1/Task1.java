package day11.task1;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Worker picker = new Picker(warehouse);
        Worker courier = new Courier(warehouse);

        businessProcess(picker);
        businessProcess(courier);
        System.out.println(warehouse);
        System.out.println(picker);
        System.out.println(courier);

        System.out.println("===== Тестируем второй склад =====");
        Warehouse warehouse1 = new Warehouse();
        Worker picker1 = new Picker(warehouse1);
        Worker courier1 = new Courier(warehouse1);
        picker1.doWork();
        picker1.bonus();
        System.out.println(picker1);
        courier1.doWork();
        courier1.bonus();
        System.out.println(courier1);
        System.out.println(warehouse1);
        System.out.println("===== Тем временем первый склад =====");
        System.out.println(warehouse);
        System.out.println(picker);
        picker.bonus();
        System.out.println(courier);
        courier.bonus();
    }

    static void businessProcess(Worker worker) {
        for (int i = 0; i < 10_000; i++) {
            worker.doWork();
        }
        worker.bonus();
    }
}
