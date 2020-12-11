package day11.task1;

import lombok.Data;

@Data
public class Warehouse {
    public int countPickedOrders = 0;
    private int countDeliveredOrders = 0;
}