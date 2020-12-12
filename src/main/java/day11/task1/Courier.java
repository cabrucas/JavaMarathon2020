package day11.task1;

public class Courier extends Employee {
    private final int TAX_RATE = 100;
    private final int BONUS_RATE = 50_000;

    public Courier(Warehouse warehouse) {
        super(warehouse);
    }

    @Override
    public void doWork() {
        this.setSalary(getSalary() + TAX_RATE);
        warehouse.setCountDeliveredOrders(warehouse.getCountDeliveredOrders() + 1);
    }

    @Override
    public void bonus() {
        if (warehouse.getCountDeliveredOrders() >= 10_000) {
            if (!isPayed()) {
                setSalary(getSalary() + BONUS_RATE);
                setPayed(true);
            } else {
                System.out.println("Бонус уже был выплачен");
            }
        } else {
            System.out.println("Бонус пока не доступен");
        }
    }
}
