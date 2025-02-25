package Pr4;

public class task3 {
    public static void main(String[] args) {
        // Создаём процессоры
        CPU cpu1 = new CPU(8, 300, 500);
        CPU cpu2 = new CPU(16, 500, 600);

        // Создаём жёсткие диски
        HDD hdd1 = new HDD(512, 150, 300);
        HDD hdd2 = new HDD(1024, 200, 400);

        // Создаём ноутбуки с разным количеством процессоров
        Laptop[] laptops = {
                new Laptop("Laptop1", 1000, 2000, hdd1, new CPU[]{cpu1, cpu2}),  // 2 CPU
                new Laptop("Laptop2", 1100, 2100, hdd2, new CPU[]{cpu1, cpu2}),  // 2 CPU
                new Laptop("Laptop3", 1200, 2200, hdd1, new CPU[]{cpu1, cpu2, cpu1, cpu2}), // 4 CPU
                new Laptop("Laptop4", 1300, 2300, hdd2, new CPU[]{cpu1, cpu2, cpu1, cpu2}), // 4 CPU
                new Laptop("Laptop5", 1400, 2400, hdd1, new CPU[]{cpu1, cpu2, cpu1, cpu2, cpu1, cpu2, cpu1, cpu2}), // 8 CPU
                new Laptop("Laptop6", 1500, 2500, hdd2, new CPU[]{cpu1, cpu2, cpu1, cpu2, cpu1, cpu2, cpu1, cpu2})  // 8 CPU
        };

        // Выводим информацию о каждом ноутбуке
        for (Laptop laptop : laptops) {
            laptop.displayInfo();
        }

        // Подсчёт общей цены, памяти и веса всех ноутбуков
        int totalPrice = 0, totalMemory = 0, totalWeight = 0;

        for (Laptop laptop : laptops) {
            totalPrice += laptop.getTotalPrice();
            totalMemory += laptop.getTotalCPUMemory();
            totalWeight += laptop.getTotalWeight();
        }

        System.out.println("\nОбщие характеристики всех ноутбуков:");
        System.out.println("Общая цена: $" + totalPrice);
        System.out.println("Общая кэш-память процессоров: " + totalMemory + "MB");
        System.out.println("Общий вес: " + totalWeight + "g");
    }
}
