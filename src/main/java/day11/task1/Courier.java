package day11.task1;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Courier implements Worker {
    private Warehouse warehouse;
    private int salary;
    private boolean isPayed;

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public void doWork() {
        warehouse.setCountDeliveredOrders(warehouse.getCountDeliveredOrders() + 1);
        salary += 100;
    }

    @Override
    public void bonus() {
        if (warehouse.getCountDeliveredOrders() < 10_000)
            System.out.println("Бонус пока не доступен");

        if (isPayed)
            System.out.println("Бонус уже был выплачен");

        if (warehouse.getCountDeliveredOrders() >= 10_000 && !isPayed) {
            isPayed = true;
            salary += 50_000;
        }
    }
}