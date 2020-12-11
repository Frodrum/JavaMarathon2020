package day11.task1;

public class Task1 {
    public static void main(String[] args) {
        // Создаём основные объекты
        Warehouse firstWarehouse = new Warehouse();
        Courier firstCourier = new Courier(firstWarehouse, 100, false);
        Picker firstPicker = new Picker(firstWarehouse, 80, false);

        // Реализуем бизнес-процессы
        businessProcess(firstCourier);
        businessProcess(firstPicker);

        // Смотрим результаты
        System.out.println(firstWarehouse);
        System.out.println(firstCourier.getSalary());
        System.out.println(firstPicker.getSalary());

        // Повторно создаём основные объекты
        Warehouse secondWarehouse = new Warehouse();
        Courier secondCourier = new Courier(secondWarehouse, 100, false);
        Picker secondPicker = new Picker(secondWarehouse, 80, false);

        // Вновь реализуем бизнес-процессы
        businessProcess(secondCourier);
        businessProcess(secondPicker);

        // Повторно смотрим результаты
        System.out.println(secondWarehouse);
        System.out.println(secondCourier.getSalary());
        System.out.println(secondPicker.getSalary());
    }

    static void businessProcess(Worker worker) {
        for (int i = 0; i < 10_000; i++) {
            worker.doWork();
        }

        worker.bonus();
    }
}