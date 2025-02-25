package Pr4;

class CPU {
    int cashMemory;
    int price;
    int weight;

    // Конструктор по умолчанию задаем крч как структуру в которой описываем как она будет выглядить
    CPU() {
        this.cashMemory = 0;
        this.price = 0;
        this.weight = 0;
    }

    // Конструктор с параметрами те как мы можем заполнить эту тумбуюмбу
    CPU(int cashMemory, int price, int weight) {
        this.cashMemory = cashMemory;
        this.price = price;
        this.weight = weight;
    }

    // Метод для вывода характеристик
    void displayInfo() {
        System.out.println("CPU: Cache Memory = " + cashMemory + "MB, Price = " + price + ", Weight = " + weight + "g");
    }
}
