package Pr4;

class Laptop {
    String name;       // Название ноутбука
    int price;         // Базовая цена (без комплектующих)
    int weight;        // Вес самого ноутбука
    HDD hardDiskDrive; // Один HDD
    CPU[] cpuMemory;   // Массив процессоров

    // Конструктор для Laptop
    Laptop(String name, int price, int weight, HDD hardDiskDrive, CPU[] cpuMemory) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.hardDiskDrive = hardDiskDrive;
        this.cpuMemory = cpuMemory;
    }

    // Метод для расчёта общей цены (ноутбук + процессоры + HDD)
    int getTotalPrice() {
        int total = price + hardDiskDrive.price;
        for (CPU cpu : cpuMemory) {
            total += cpu.price;
        }
        return total;
    }

    // Метод для расчёта общей памяти процессоров
    int getTotalCPUMemory() {
        int total = 0;
        for (CPU cpu : cpuMemory) {
            total += cpu.cashMemory;
        }
        return total;
    }

    // Метод для расчёта общего веса (ноутбук + процессоры + HDD)
    int getTotalWeight() {
        int total = weight + hardDiskDrive.weight;
        for (CPU cpu : cpuMemory) {
            total += cpu.weight;
        }
        return total;
    }

    // Метод для вывода информации о ноутбуке
    void displayInfo() {
        System.out.println("\nLaptop: " + name);
        System.out.println("Total Price: $" + getTotalPrice());
        System.out.println("Total CPU Cache Memory: " + getTotalCPUMemory() + "MB");
        System.out.println("Total Weight: " + getTotalWeight() + "g");
    }
}
