package day11.task1;

public abstract class Employee implements Worker {
    private int salary;
    private boolean isPayed = false;
    Warehouse warehouse;

    public Employee(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    public void setPayed(boolean payed) {
        isPayed = payed;
    }

    @Override
    public void doWork() {
        System.err.println("Переопределите метод doWork");
    }

    @Override
    public void bonus() {
        System.err.println("Переопределите метод bonus");
    }

    @Override
    public String toString() {
        return String.format("На счете %d", getSalary());
    }
}
