package day11.task1;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Picker implements Worker {
    private Warehouse warehouse;
    private int salary;
    private boolean isPayed;

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public void doWork() {
        warehouse.setCountPickedOrders(warehouse.getCountPickedOrders() + 1);
        salary += 80;
    }

    @Override
    public void bonus() {
        if (warehouse.getCountPickedOrders() < 10_000)
            System.out.println("Бонус пока не доступен");

        if (isPayed)
            System.out.println("Бонус уже был выплачен");

        if (warehouse.getCountPickedOrders() >= 10_000 && !isPayed) {
            isPayed = true;
            salary += 70_000;
        }
    }
}