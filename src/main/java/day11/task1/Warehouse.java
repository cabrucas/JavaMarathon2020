package day11.task1;

public class Warehouse {
    private int countPickedOrders = 0;
    private int countDeliveredOrders = 0;

    public int getCountPickedOrders() {
        return countPickedOrders;
    }

    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }

    public void setCountPickedOrders(int countPickedOrders) {
        this.countPickedOrders = countPickedOrders;
    }

    public void setCountDeliveredOrders(int countDeliveredOrders) {
        this.countDeliveredOrders = countDeliveredOrders;
    }

    @Override
    public String toString() {
        return String.format("Количество собранных заказов %d, количество доставленных заказов %d",
                countPickedOrders,
                countDeliveredOrders);
    }
}