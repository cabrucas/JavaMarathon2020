package day11.task1;

public class Picker extends Employee {
    private final int TAX_RATE = 80;
    private final int BONUS_RATE = 70_000;

    public Picker(Warehouse warehouse) {
        super(warehouse);
    }

    @Override
    public void doWork() {
        setSalary(getSalary() + TAX_RATE);
        warehouse.setCountPickedOrders(warehouse.getCountPickedOrders() + 1);
    }

    @Override
    public void bonus() {
        if (warehouse.getCountPickedOrders() >= 10_000) {
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
